//https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1
package Arrays;

import java.util.ArrayList;

public class StockBuyAndSell {
    public void display() {
        int[] stock = {74,92,10,11,3};
        ArrayList<ArrayList<Integer>> lists = stockBuySell(stock, 5);

        for (ArrayList<Integer> list : lists) {
            System.out.println();
            for (Integer item : list) {
                System.out.print(item);
            }
        }
    }

    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int min = 0, max = 0;

        for (int i = 1; i < n; i++) {


            if (A[i] < A[max]) {

                if (min < max && A[min] < A[max]) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(min);
                    list.add(max);
                    res.add(list);
                }
                min = i;
                max =i;
            }

            if (A[max] <= A[i]) max = i;
        }

        if (min < max && A[min] < A[max]) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(min);
            list.add(max);
            res.add(list);
        }

        return res;
    }
}
