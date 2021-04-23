//https://leetcode.com/problems/sort-array-by-parity/
package Arrays;

public class SortByParity {

    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length-1;
        int temp;
        while(i < j){
            if(A[i] % 2 != 0 && A[j] % 2 == 0){
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            } else if (A[i] % 2 == 0 ){
                i++;
            } else{
                j--;
            }
        }
        return A;
    }

    public void displayResult() {
        int[] nums = new int[]{3,1,2,4};
        nums = sortArrayByParity(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
