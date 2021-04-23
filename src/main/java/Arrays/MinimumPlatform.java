//https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1

package Arrays;

import java.util.Arrays;
import java.util.Stack;

public class MinimumPlatform {
    public void display() {
//        int[] arr={900, 940, 950, 1100, 1500, 1800};
//        int[] dep={910, 1200, 1120, 1130, 1900, 2000};
//        int platformNeeded = findPlatform(arr,dep,arr.length);
//        System.out.println(platformNeeded);

        int[] arr1 = {940, 900};
        int[] dep1 = {942, 935};
        int platformNeeded1 = findPlatformUsingStack(arr1, dep1, arr1.length);
        System.out.println(platformNeeded1);

    }

    int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0, j = 0;
        int platformNeeded = 0;
        int result = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platformNeeded++;
                i++;
            } else {
                platformNeeded--;
                j++;
            }
            if (result < platformNeeded) result = platformNeeded;
        }
        return result;
    }

    int findPlatformUsingStack(int arr[], int dep[], int n) {
        Stack<Integer> stack = new Stack();

        stack.push(0);

        int i = 1;
        int result = 0;

        while (i < n) {

            int platformNeeded = stack.size();
            while (!stack.isEmpty() && dep[stack.peek()] < arr[i]) {
                if (arr[stack.peek()] > arr[i] && dep[stack.peek()] > dep[i])
                    platformNeeded--;
                stack.pop();
            }

            if (result < platformNeeded) result = platformNeeded;

            stack.push(i);
            i++;
        }

        return result;
    }
}
