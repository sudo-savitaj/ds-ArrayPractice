//https://www.geeksforgeeks.org/find-triplet-sum-two-equals-third-element/
package Arrays;

import java.util.Arrays;

public class CountTripplets {
    public void display() {
        //3,6,8,11,14,16
        int[] arr = {14, 3, 6, 8, 11, 16};
        int res = countTriplet(arr, 6);
        System.out.println(res);

        long[] arr1 = {5, 1, 3, 4, 7};
        long res1 = countTriplets(arr1, 5, 12);
        System.out.println(res1);

    }

    int countTriplet(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int j = 0, k = i - 1;
            while (j < k) {
                if (arr[j] + arr[k] == arr[i]) {
                    count++;
                    j++;
                    k--;
                } else if (arr[j] + arr[k] < arr[i]) j++;
                else k--;
            }
        }
        return count;
    }

    //https://www.geeksforgeeks.org/count-triplets-with-sum-smaller-that-a-given-value/
    //1,2,3,4,5,7
    long countTriplets(long arr[], int n, int sum) {
        Arrays.sort(arr);

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int j = 0, k = i - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] < sum) {
                    count += k - j;
                    j++;
                } else {
                    k--;
                }
            }
        }
        return count;
    }
}
