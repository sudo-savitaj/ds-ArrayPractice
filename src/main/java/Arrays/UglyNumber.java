//https://leetcode.com/problems/ugly-number-ii/
package Arrays;

public class UglyNumber {
    public void display() {
        int num = nthUglyNumberDp(10);

        System.out.println("-----------------\n" + num);
    }

    public int nthUglyNumber(int n) {
        int i = 1;
        int num = 0;
        while (n > 0) {
            if (isUgly(i)) {
                System.out.println(i);
                num = i;
                n--;
            }
            i++;
        }
        return num;
    }

    private boolean isUgly(int no) {
        no = maxDivide(no, 2);
        no = maxDivide(no, 3);
        no = maxDivide(no, 5);
        return no == 1 ? true : false;
    }

    private int maxDivide(int n, int i) {
        while (n % i == 0) n = n / i;
        return n;
    }

    public int nthUglyNumberDp(int n) {
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        int[] uglyNums = new int[n];
        int i=0;
        uglyNums[i] = 1;

        System.out.println(uglyNums[i]);
        i++;

        int seq2 = 2;
        int seq3 = 3;
        int seq5 = 5;

        while (i<n) {

            uglyNums[i] = Math.min(Math.min(seq2, seq3), seq5);
            System.out.println(uglyNums[i]);

            if (uglyNums[i] == seq2) seq2 = 2*uglyNums[++index2];
            if (uglyNums[i] == seq3) seq3 = 3*uglyNums[++index3];
            if (uglyNums[i] == seq5) seq5 = 5*uglyNums[++index5];

            i++;

        }

        return uglyNums[n-1];
    }

}
