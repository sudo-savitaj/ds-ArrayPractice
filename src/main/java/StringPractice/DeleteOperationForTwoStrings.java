package StringPractice;

public class DeleteOperationForTwoStrings {
    public void display() {
        int minDistance = minDistance("leetcode","etco");

        System.out.println(minDistance);
    }

    public int minDistance(String word1, String word2) {
        int lcs = lcsDp(word1, word2);
        return word1.length()+word2.length() - (2*lcs);
    }

    private int lcs(String word1, String word2) {
        if (word1.isEmpty() || word2.isEmpty()) return 0;

        if(word1.charAt(0)==word2.charAt(0)) return 1 + lcs(word1.substring(1),word2.substring(1));
        return Integer.max(lcs(word1,word2.substring(1)),lcs(word1.substring(1),word2));
    }

    private int lcsDp(String word1, String word2) {
        int[][] t = new int[word1.length()+1][word2.length()+1];
        for (int i=0;i<=word1.length();i++){
            for (int j=0;j<=word2.length();j++){
                if(i==0||j==0) t[i][j] = 0;
                else if(word1.charAt(i-1)==word2.charAt(j-1)) t[i][j] = 1 + t[i-1][j-1];
                else t[i][j] = Integer.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[word1.length()][word2.length()];
    }
}
