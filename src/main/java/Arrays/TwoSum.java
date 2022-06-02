package Arrays;

import java.util.HashMap;

public class TwoSum {
    public void display() {
        int[] twoSum = twoSum(new int[]{3,2,4},6);
        for (int num : twoSum) {
            System.out.println(num);
        }
    }

    public int[] twoSum(int[] nums, int target)
    {
        int[] sumNumbers = new int[2];
        HashMap<Integer, Integer> map = new HashMap();
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }

        for (int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i)
            {
                sumNumbers[0]= i;
                sumNumbers[1]= map.get(target-nums[i]);
                return sumNumbers;
            }
        }
        return sumNumbers;
    }
}
