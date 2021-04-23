//https://leetcode.com/problems/valid-mountain-array/
package Arrays;

public class MountainArray {
    public boolean validMountainArray(int[] A) {
        int i=0;
        while (i+1<A.length && A[i]<A[i+1]){
            i++;
        }
        if(i==0 || i == A.length -1 )
            return false;

        while (i+1<A.length && A[i]>A[i+1])
            i++;

        if(i == A.length -1 )
            return true;
        return false;
    }

    public void displayResult() {
        int[] nums = new int[]{3,5,5};

        boolean isMountainArray = validMountainArray(nums);

        System.out.println(isMountainArray);

    }
}
