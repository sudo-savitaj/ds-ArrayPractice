package Arrays;

import java.util.HashSet;

public class CheckIfAStringContainsAllBinaryCodesOfSizeK {
    public void display() {

    }
    public boolean hasAllCodes(String s, int k) {
        int expectedBinaryCodes = 1 << k;
        HashSet<String> binarycodes = new HashSet<>();
        for (int i=k;i<s.length();i++)
        {
            String subString = s.substring(i-k,i);
            if(!binarycodes.contains(subString)){
                binarycodes.add(subString);
                expectedBinaryCodes--;
            }
            if(expectedBinaryCodes==0) return true;
        }
        return expectedBinaryCodes == 0;
    }
}
