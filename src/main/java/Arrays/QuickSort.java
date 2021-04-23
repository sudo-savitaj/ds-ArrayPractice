package Arrays;
import java.util.Arrays;

public class QuickSort {
    public void display() {
        int[] array = new int[]{1,5,3,8,7,6,4};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
    public void quickSort(int [] lst) {
        quickSort(lst,0,lst.length-1);
    }

    private void quickSort(int[] list, int low, int high) {
        if(high < low)
            return;
        int pivot = partion(list,low,high);
        quickSort(list,low,pivot-1);
        quickSort(list,pivot+1,high);
    }

    private int partion(int[] list, int low, int high) {
        int pivotEle = list[high];
        int i =low;
        int temp;
        for (int j=low;j<high;j++){
            if (list[j]<pivotEle){
                temp = list[j];
                list[j]= list[i];
                list[i] = temp;
                i++;
            }
        }

        temp = list[high];
        list[high] = list[i];
        list[i] = temp;

        return i;
    }
}
