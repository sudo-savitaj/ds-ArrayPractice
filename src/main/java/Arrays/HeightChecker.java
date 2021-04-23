//https://leetcode.com/problems/height-checker/
package Arrays;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        if (heights.length <= 1){
            return 0;
        }
        int[] elements = Arrays.copyOf(heights,heights.length);
        Arrays.sort(elements);

        int elementsToMove = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != elements[i]) {
                elementsToMove++;
            }
        }
        return elementsToMove;
    }

    public void displayResult() {
        int[] nums = new int[]{1, 1, 4, 2, 1, 3};

        int minimumMoves = heightChecker(nums);

        System.out.println(minimumMoves);
    }
}
