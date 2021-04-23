package Arrays;

public class kThSmallestElement {
    public void display() {

    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        if(l>r) return -1;

        int pivot = partition(arr,l,r);
        if(pivot==k-1) return arr[k-1];
        else if(k-1<pivot) return kthSmallest(arr,l,pivot-1,k);
        else
        return kthSmallest(arr,pivot+1,r,k);
    }

    private static int partition(int[] arr, int l, int r) {
        int pivotEle = arr[r];
        int i = l;
        int temp;
        for (int j=l;j<=r;j++){
            if(arr[j]<pivotEle){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        return i;
    }
}
