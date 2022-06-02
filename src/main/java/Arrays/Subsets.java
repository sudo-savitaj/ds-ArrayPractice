package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public void display() {

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTracking(0,nums,res,new ArrayList<>());
        return res;
    }

//    1,2,2,3
//
//    [[],[1],[1,2],[1,2,2],[1,2,2,3]]

    private void backTracking(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> cur) {
        res.add(cur);

        cur.add(nums[i]);
        backTracking(i+1,nums,res,cur);
        cur.remove(cur.size()-1);
    }
}
