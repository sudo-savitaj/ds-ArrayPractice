package Arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int duplicates = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                duplicates++;
            } else {
                nums[i - duplicates] = nums[i];
            }
        }
        return nums.length - duplicates;
    }

    public int removeDuplicatesSecondApproach(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }

    public void displayResult() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int length = removeDuplicatesSecondApproach(nums);

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }
}
