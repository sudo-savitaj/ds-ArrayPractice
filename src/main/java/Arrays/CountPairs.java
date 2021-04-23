//https://www.geeksforgeeks.org/count-pairs-with-given-sum/
package Arrays;

import java.util.HashMap;

public class CountPairs {
    public void display() {

        int[] arr = {1, 1, 1, 1};
        int res = getPairsCount(arr, 4, 2);

        System.out.println(res);
    }

    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            int diff = k - arr[i];
            if (map.containsKey(diff)) {
                count += map.get(diff);
            }
            int freq = map.containsKey(arr[i]) ? map.get(arr[i]) : 0;
            map.put(arr[i], freq+1);
        }
        return count;
    }
}
