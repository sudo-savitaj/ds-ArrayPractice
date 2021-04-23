//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
package Arrays;

public class KadanesAlgo {
    public void display() {
        int[] arr= {1,2,3,-2,5};
        int res = maxSubarraySum(arr,5);

        System.out.println(res);
    }

    int maxSubarraySum(int arr[], int n) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > sum+arr[i])
                sum = arr[i];
            else
                sum += arr[i];

            if (max < sum) max = sum;
        }
        return max;
    }
}
