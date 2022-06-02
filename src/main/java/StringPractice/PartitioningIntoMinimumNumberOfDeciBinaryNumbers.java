package StringPractice;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
            int max=0;
        for(int i=0;i<n.length();i++){
            int val = n.charAt(i) - '0';
            if(max < val)
                max = val;
        }
        return max;
    }
}
