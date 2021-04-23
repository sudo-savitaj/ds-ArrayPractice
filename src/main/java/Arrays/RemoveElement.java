package Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int frequencyOfVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                frequencyOfVal++;
                nums[i]=0;
            } else if (frequencyOfVal > 0) {
                nums[i - frequencyOfVal] = nums[i];
                nums[i]=0;
            }
        }
        return nums.length - frequencyOfVal;
    }

    public void displayResult() {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int elementToDelete = 2;


        int length = removeElement(nums, elementToDelete);

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }
}
