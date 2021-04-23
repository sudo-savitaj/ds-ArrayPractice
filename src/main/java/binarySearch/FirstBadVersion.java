//https://leetcode.com/problems/first-bad-version/
package binarySearch;

public class FirstBadVersion {
    public void displayResult() {
        int firstBadVersion = firstBadVersion(5);
        System.out.println(firstBadVersion);
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid=0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                    high = mid ;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    boolean isBadVersion(int version) {
        return (version == 4 || version == 5) ? true : false;
    }
}
