package Arrays;

import java.util.Arrays;

public class MinimumMoves {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int mid = nums[(nums.length-1)/2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+= Math.abs(nums[i]-mid);
        }
        return count;
    }
}
