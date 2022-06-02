package Arrays;

public class TargetArrayWithMultipleSum {
    public boolean isPossible(int[] target) {
        int[] list = new int[target.length];
        int sum =0;
        for (int i=0;i<target.length;i++){
            list[i] = 1;
            sum += target[i];
        }
//        while ()
        return false;
    }
}


//1 1 1
//sum - 3  ele - 1  diff - 2
//3 1 1
//sum - 5  ele -