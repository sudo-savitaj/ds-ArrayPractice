package StringPractice;

public class BasicCalculatorII {
    public int calculate(String s) {
        int result =0, curNum =0, lastNum=0;
        char op = '+';
        for(int i=0;i<s.length();i++){
            char curCh = s.charAt(i);
            if(Character.isDigit(curCh)) {
                curNum = curNum * 10 + curCh - '0';
            }

            if(!Character.isDigit(curCh)||i==s.length()-1||!Character.isWhitespace(curCh)){
                if(op == '-' || op == '+'){
                    result += lastNum;
                    lastNum += op == '+' ? curNum : -curNum;
                } else if(op=='/'){
                    lastNum /= curNum;
                } else if(op =='*'){
                    lastNum *= curNum;
                }
            op = curCh;
                curNum=0;
            }
        }
        result+= lastNum;
        return result;
    }
}
