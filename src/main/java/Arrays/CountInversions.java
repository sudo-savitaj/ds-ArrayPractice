//https://leetcode.com/problems/robot-bounded-in-circle/discuss/290856/JavaC%2B%2BPython-Let-Chopper-Help-Explain
package Arrays;
import java.util.ArrayList;
import java.util.List;

public class CountInversions {
    public void display(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(6);
        list.add(4);
        list.add(5);

//        for(int item : list) System.out.println(item);

        long count = getInversions(list);
        System.out.println(count);
    }

    long getInversions(List<Integer> arr){
        List<Integer> list2 = new ArrayList<>(arr);
        return mergeSort(arr,list2,0,arr.size()-1);
    }

    private long mergeSort(List<Integer> list1, List<Integer> list2, int low, int high) {
        if (low>= high) return 0;
        long inversionCount =0;

        int mid = low + ((high-low)>>1);

        inversionCount+= mergeSort(list1,list2,low,mid);
        inversionCount+= mergeSort(list1,list2,mid+1,high);
        inversionCount+= merge(list1,list2,low,mid,high);

        return inversionCount;
    }

    private long merge(List<Integer> list1, List<Integer> list2, int low, int mid, int high) {
        int i =low,j=mid+1,k=low;
        long inversionCount = 0;
        while (i<=mid&&j<=high){
            if(list1.get(i)<=list2.get(j)) list2.set(k++,list1.get(i++));
            else {
                list2.set(k++,list2.get(j++));
                inversionCount += mid - i + 1;
            }
        }
        return inversionCount;
    }
}
