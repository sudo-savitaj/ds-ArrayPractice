//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
package Arrays;

public class ReplaceElementWithGreatestElement {

    public int[] replaceElements(int[] arr) {
        int greatestElement = -1;
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp = greatestElement;
            if(arr[i]>greatestElement){
                greatestElement = arr[i];
            }
            arr[i] = temp;
        }
        return arr;
    }

    public void displayResult() {
        int[] nums = new int[]{17,18,5,4,6,1};

        nums = replaceElements(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
