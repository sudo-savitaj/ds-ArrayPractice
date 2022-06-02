//https://leetcode.com/problems/jump-game-iii/
package Arrays;

public class JumpGame {
    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length ||arr[start]<0) return false;
        if (arr[start] == 0) return true;
        arr[start] = - arr[start];
        return canReach(arr,start+arr[start]) || canReach(arr,start-arr[start]);
    }

    public void display() {
        int[] arr={2,2,3,2,3};
        boolean canReach= canReach(arr,3);
        System.out.println(canReach);
    }
}
