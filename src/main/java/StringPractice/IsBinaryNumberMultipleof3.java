//https://practice.geeksforgeeks.org/problems/is-binary-number-multiple-of-30654/1
package StringPractice;

//011 -> 0*2^2 + 1*2^1 + 1*2^0
public class IsBinaryNumberMultipleof3 {
    int isDivisible(String s) {
        int num=0;
        for(int i=0;i<s.length();i++){
            int digit = s.charAt(i) - '0';
            int power= s.length() - 1 -i;
            num += (int) (digit * Math.pow(2,power));
        }
        return num%3 == 0 ? 1 : 0;
    }

    public void demo(){
        int result = isDivisible("110");
        System.out.println(result);
    }
}
