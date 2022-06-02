package Bitwise;

public class MaximumProductofWordLengths {

    public int maxProduct(String[] words) {
        int[] bitRep = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            bitRep[i] = 0;
            for (int j = 0; j < words[i].length(); j++) {
                bitRep[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }

        int max = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((bitRep[i] & bitRep[j]) == 0) {
                    int prod = words[i].length() * words[j].length();
                    if (prod > max) max = prod;
                }
            }
        }
        return max;
    }

    //attempt : some scenarios failing
    public int maxProductTest(String[] words) {
        int max = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (lcs(words[i], words[j]) == 0) {
                    int len = words[i].length() * words[j].length();
                    if (max < len)
                        max = len;
                }
            }
        }
        return max;
    }

    private int lcs(String word, String word1) {
        int n = word.length();
        int m = word1.length();
        int[][] cache = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) cache[i][j] = 0;
                else {
                    if (word.charAt(i - 1) == word1.charAt(j - 1)) cache[i][j] = 1 + cache[i - 1][j - 1];
                    else
                        cache[i][j] = Integer.max(cache[i][j - 1], cache[i - 1][j]);
                }
            }
        }
        return cache[n][m];
    }

    public void demo() {
        int n = lcs("xtfn", "abcdef");
        System.out.println(n);
    }
}
