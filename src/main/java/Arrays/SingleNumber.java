//https://leetcode.com/problems/single-number
package Arrays;

import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum=0,sumOfSet  =0;
        for (int num : nums) {
            if(!set.contains(num))
            {
                sumOfSet+= num;
                set.add(num);
            }
            sum+= num;
        }
        return (2*sumOfSet) - sum;
    }
}
