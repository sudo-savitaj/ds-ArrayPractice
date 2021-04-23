//https://leetcode.com/problems/move-zeroes/
package Arrays;

public class MoveZero {

    public void displayResult() {
        int[] nums = new int[]{0,1,0,3,12};
        moveZero(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    private void moveZero(int[] nums) {
        int numberOfZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                numberOfZero++;
            } else if (numberOfZero > 0){
                nums[i-numberOfZero] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
