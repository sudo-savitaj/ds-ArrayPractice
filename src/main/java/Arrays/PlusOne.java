//https://leetcode.com/problems/plus-one/
package Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry =1;
        int n = digits.length;
        for(int i = n -1; i>=0; i--){
            int sum = digits[i] + carry;
            digits[i] = sum%10;
            carry= sum/10;
        }
        if(carry > 0)
        {
            digits = new int[n+1];
            digits[0] = 1;
        }
        return digits;
    }


    public void display(){
        int[] num = {9, 9};
        int[] plusOne = plusOne(num);

        for (int digit : plusOne) {
            System.out.println(digit);
        }
    }
}
