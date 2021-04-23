//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
package Arrays;

public class MissingNumber {
    public void display() {
        int[] array = {1, 3, 4};
        int res = MissingNumber(array,4);
        System.out.println(res);
    }

    int MissingNumber(int array[], int n) {
        int diff = 1;
        for(int i=2;i<=n;i++){
            diff +=i;
            diff-=array[i-2];
        }
        return diff;
    }
}
