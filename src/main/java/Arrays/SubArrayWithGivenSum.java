//https://www.geeksforgeeks.org/find-subarray-with-given-sum/
package Arrays;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    void display() {
        int[] array = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
        ArrayList<Integer> res = subarraySum(array, 42, 468);

        for (Integer item : res) {
            System.out.println(item);
        }

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList();
        int curSum = arr[0];
        int j = 0;
        for ( int i = 1; i <= arr.length; i++) {
            while (curSum > s && j < i) {
                curSum -= arr[j];
                j++;
            }

            if (curSum == s) {
                result.add(j+1);
                result.add(i);
                return result;
            }

            if(i<n)
            curSum += arr[i];
        }

        result.add(-1);
        return result;
    }
}
