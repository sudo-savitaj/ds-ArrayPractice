package Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (nums1[j] > nums2[i]) {
                    break;
                }
            }
            for (int k = m -1; k >= j; k--) {
                nums1[k+1] = nums1[k];
            }
            nums1[j] = nums2[i];
            m++;
        }
    }

    public void mergeOptimized(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n -1;
        int p1 = m -1;
        int p2 = n-1;
        while(i>=0 & p1>=0 & p2 >=0){
            if(nums1[p1]>nums2[p2]){
                nums1[i] = nums1[p1];
                i--;
                p1--;
            } else {
                nums1[i] = nums2[p2];
                i--;
                p2--;
            }
        }

        while (p2>=0){
            nums1[i] = nums2[p2];
            p2--;
            i--;
        }
    }

    public void displayResult() {
        int[] nums1 = new int[]{9,0,0};
        int[] nums2 = new int[]{5,6};

        int m = 2;
        int n = 2;
        mergeOptimized(nums1, m, nums2, n);

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }


    //https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1#


}
