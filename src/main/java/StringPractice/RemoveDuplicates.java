package StringPractice;

public class RemoveDuplicates {
    public void display() {
    }

    public String removeDuplicates(String s, int k) {
        boolean deletion = true;
        int occurences = 1;
        int i=1;
        int deletionsInCurIteration = 0;
        while(i<s.length()){
            if(s.charAt(i-1) == s.charAt(i)){
                occurences ++;
            }

            if(occurences == k){
                deletionsInCurIteration += occurences;
            }

        }
        return s;
    }
}
