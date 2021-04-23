package StringPractice;

//https://leetcode.com/problems/count-binary-substrings/solution/
public class CountBinarySubStrings {
      void display(){
          int count = countBinarySubstrings("00110");
          System.out.println(count);
      }

    public int countBinarySubstrings(String s) {
        int cur =1;
        int prev =0;
        int count = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) != s.charAt(i)){
                count += Integer.min(prev,cur);
                prev = cur;
                cur=1;
            } else cur++;
        }
        count += Integer.min(prev,cur);
        return count;
    }


      //NotWorking
    private int countBinarySubstringsSum(String s) {
        int count=0;
        if(s.isEmpty()) return 0;
        if(isValidSubString(s))
            count++;
        for (int i=1;i<s.length();i++){
            String leftSubString = s.substring(0,i);
            String rightSubString = s.substring(i);
            int countLeftSubString = countBinarySubstrings(leftSubString);
            int countRightSubString = countBinarySubstrings(rightSubString);
            count += countLeftSubString + countRightSubString;
        }
        return count;
    }

    private boolean isValidSubString(String s) {
        boolean isStartingWithZero = s.charAt(0) == '0';
        int countZero=0;
        int countOne=0;
        if(isStartingWithZero){

            for (int i=0;i<s.length() && s.charAt(i) =='0';i++) countZero++;
            for (int i=countZero;i<s.length() && s.charAt(i) =='1';i++) countOne++;
        } else {

            for (int i=0;i<s.length() && s.charAt(i) =='1';i++) countOne++;
            for (int i=countZero;i<s.length() && s.charAt(i) =='0';i++) countZero++;
        }
        return countZero==countOne && countZero+countOne == s.length();
    }
}
