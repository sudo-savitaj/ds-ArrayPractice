//https://leetcode.com/problems/consecutive-characters
package Arrays;

public class ConsecutiveCharacters {
    public void display() {

    }
    public int maxPower(String s) {
        int max=0;
        int counter=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1)){
                counter++;
            } else {
                max = max<counter? counter : max;
                counter=1;
            }

        }
        return max;
    }
}
