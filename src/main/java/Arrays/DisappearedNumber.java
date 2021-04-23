//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
package Arrays;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i : nums) {
            int index = Math.abs(i);
           if(nums[index -1] > 0) {
               nums[index-1] *= -1;
           }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;
    }

    public void displayResult() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNumbers(nums);

        for (Integer element : result){
            System.out.println(element);
        }
    }
}


//8
//123456