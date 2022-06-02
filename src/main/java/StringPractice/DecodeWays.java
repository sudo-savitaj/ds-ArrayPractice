package StringPractice;

public class DecodeWays {
    public int numDecodings(String s) {
        int[] cache = new int[s.length()+1];
        for (int i=0;i<s.length();i++) {
            cache[i] = -1;
        }
        return numDecodings(s, cache);
    }

    private int numDecodings(String str, int[] cache) {
        if(str.length() == 0) return 1;

        if(cache[str.length()-1] != -1) return cache[str.length()-1];

        int numOfCombination = 0;
        int secondDigit = str.charAt(str.length()-1) - '0';
        int firstDigit = str.length() > 1 ? str.charAt(str.length()-2) - '0' : 0;

        if(secondDigit != 0)
            numOfCombination += numDecodings(str.substring(0, str.length()-1));

        int finalDigit = firstDigit * 10 + secondDigit;
        if (finalDigit != secondDigit && finalDigit <=26 && finalDigit >0 )
            numOfCombination += numDecodings(str.substring(0, str.length()-2));

        cache[str.length()-1] = numOfCombination;
        return numOfCombination;
    }

    private int numDecodingsDP(String str) {
        int[] cache = new int[str.length()+1];

        cache[0] =1;

        for (int i =1;i<=str.length();i++){
            int secondDigit = str.charAt(i-1) - '0';
            int firstDigit =  i >= 2 ? str.charAt(i-2) - '0' : 0;
            int finalDigit = firstDigit * 10 + secondDigit;

            if (secondDigit != 0)
                cache[i] = cache[i-1];
            if(firstDigit > 0 && finalDigit <=26 )
                cache[i] += cache[i-2];
        }

        return cache[str.length()];
    }

    public void display(){
       int sol1 = numDecodings("226");
       int sol2 = numDecodingsDP("226");

       System.out.println(sol1);
       System.out.println(sol2);
    }
}
