//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
package Arrays;

public class MissingNumber {
    public void display() {
        int[] array = {1, 3, 4};
        int res = MissingNumber(array,4);
        System.out.println(res);
    }

    int MissingNumber(int array[], int n) {
        int diff = 1;
        for(int i=2;i<=n;i++){
            diff +=i;
            diff-=array[i-2];
        }
        return diff;
    }

    public int missingNumber(int[] nums) {
        int xor = 0;
        for(int i=0;i<nums.length;i++)
            xor= xor ^ i ^ nums[i];

        return xor ^ nums.length;
    }

    public int MissingNumber(int[] nums) {
        int sum = getSum(nums);
        int n = nums.length;
        int total = (n *(n+1))/2;
        int missingNumber = total - sum;
        return missingNumber;
    }

    private int getSum(int[] nums){
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        return sum;
    }
}
