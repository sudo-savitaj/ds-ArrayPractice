package Arrays;

public class Sorting {

    //https://practice.geeksforgeeks.org/problems/bubble-sort/1#editorial
    void bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //https://www.geeksforgeeks.org/insertion-sort/
    void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j] = temp;
                }
            }
        }
    }



}
