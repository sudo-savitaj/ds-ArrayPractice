//https://leetcode.com/problems/pascals-triangle/
package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public void display() {
        List<Integer> output = getRow(4);

        for (Integer item : output) {
            System.out.println(item);
        }
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> current = new ArrayList<>();
        current.add(1);
        if (rowIndex == 0) {
            return current;
        }

        if (rowIndex == 1) {
            current.add(1);
            return current;
        }

        List<Integer> list = getRow(rowIndex - 1);

        int i = 0;

        for (i = 0; i <= list.size() - 2; i++) {
            current.add(list.get(i) + list.get(i + 1));
        }

        current.add(1);
        return current;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            if (i == 2) row.add(1);
            else if (i > 2) {
                List<Integer> lastRow = pascalTriangle.get(i - 2);
                for (int j = 0; j < lastRow.size() -1; j++) {
                    row.add(lastRow.get(j)+lastRow.get(j+1));
                }
                row.add(1);
            }

            pascalTriangle.add(row);
        }

        return pascalTriangle;
    }

}
