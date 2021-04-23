package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckForDouble {

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
                if (set.contains(arr[i] * 2) || (arr[i] % 2 == 0 && set.contains(arr[i] / 2))){
                    return true;
            }
                set.add(arr[i]);
        }
        return false;
    }

    public void displayResult() {
        int[] nums = new int[]{3,1,7,11};

        boolean doubleExists = checkIfExist(nums);

        System.out.println(doubleExists);
    }
}
