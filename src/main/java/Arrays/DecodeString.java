package Arrays;

import java.util.ArrayList;
import java.util.Stack;

public class DecodeString {
    public void display() {
        System.out.println(decodeString("100[leetcode]"));
//        System.out.println(power(10,0));
    }
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        int i=0;
        while (i<s.length()){
            char currentCh = s.charAt(i);
            if(currentCh ==']'){
            ArrayList<Character> subStringToDecode = new ArrayList<>();
               while (!isADigit(stack.peek())){
                   char temp = stack.pop();
                   if(temp!='[')
                       subStringToDecode.add(temp);
               }

               int multipler = 0;
               int counter = 0;
               while (!stack.isEmpty()&&isADigit(stack.peek())){
                   char temp = stack.pop();
                   multipler = multipler + getDigit(temp)*power(10,counter);
                   counter++;
               }
              while (multipler!=0){
                  int j=subStringToDecode.size()-1;
                  while (j>=0){
                      stack.push(subStringToDecode.get(j));
                      j--;
                  }
                  multipler--;
              }
            } else {
                stack.push(currentCh);
            }
            i++;
        }

        String str = "";
        while (!stack.isEmpty())
        str =stack.pop() + str;
        return str;
    }

    private int power(int i, int counter) {
        int val =1;
        while (counter>=1)
        {
            val*=i;
            counter--;
        }

        return val;
    }

    private int getDigit(char temp) {
        return temp - '0';
    }

    private boolean isADigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
}
