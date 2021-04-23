package Arrays;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        int max = 100000;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >  max){
                max = nums[i];
                counter++;
                if(counter == 3){
                    return max;
                }
            }
        }
        return max;
    }

    public void displayResult() {
        int[] nums = new int[]{2, 2, 3, 1};

        int thirdMAx = thirdMax(nums);

        System.out.println(thirdMAx);

    }
}
