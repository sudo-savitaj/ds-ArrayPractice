//https://leetcode.com/problems/squares-of-a-sorted-array/
package Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int i = 0;
        while (i < A.length && A[i] < 0) {
            i++;
        }
        int j = i;
        i = i - 1;

        int k = 0;
        while (i >= 0 && j < A.length) {
            int ithElementSquare = A[i] * A[i];
            int jthElementSquare = A[j] * A[j];
            if (ithElementSquare < jthElementSquare) {
                result[k++] = ithElementSquare;
                i--;
            } else {
                result[k++] = jthElementSquare;
                j++;
            }
        }

        while (i >= 0) {
            result[k++] = A[i] * A[i];
            i--;
        }
        while (j < A.length) {
            result[k++] = A[j] * A[j];
            j++;
        }
        return result;
    }

    public void displayResult() {
        int[] nums = new int[]{-1};
        sortedSquares(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
