package Arrays;

public class PartitionToKEqualSumSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int total = sum(nums);
        int sumForEachSubset = total / k;
        int rem = total % k;
        if (rem != 0) return false;

        return canPartitionKSubsets(nums, new boolean[nums.length], sumForEachSubset, 0, k, 0);
    }

    private boolean canPartitionKSubsets(int[] nums, boolean[] visited, int target, int curSum, int k, int i) {
        if (k == 1) return true;

        if (curSum == target) return canPartitionKSubsets(nums, visited, target, 0, k - 1, 0);

        for (int j = i; j < nums.length; j++) {
            if (visited[j] || curSum + nums[j] > target) continue;

            visited[j] = true;
            if (canPartitionKSubsets(nums,visited,target,curSum+nums[j],k,j+1)) return true;
            visited[j] = false;
        }
        return false;
    }

    private int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

}
