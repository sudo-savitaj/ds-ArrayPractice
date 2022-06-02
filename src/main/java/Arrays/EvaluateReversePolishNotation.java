//https://leetcode.com/problems/evaluate-reverse-polish-notation/
package Arrays;

import java.util.Arrays;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for (String token : tokens) {
           if(isAOperator(token)){
               int num2 = stack.pop();
               int num1 = stack.pop();
                int num3 = 0;
                switch (token){
                    case "+":
                        num3 = num1+ num2;
                        break;
                    case "-":
                        num3 = num1 - num2;
                        break;
                    case "*" :
                        num3 = num1 * num2;
                        break;
                    case "/":
                        num3 = num1 / num2;
                        break;
                }
                stack.push(num3);
            }
           else{
               stack.push(Integer.parseInt(token));
           }
        }

        return stack.pop();
    }

    private boolean isAOperator(String token) {
        String[] list = {"+","-","*","/"};
        return Arrays.asList(list).contains(token);
    }

}
