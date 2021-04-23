package Arrays;

public class DuplicateZero {

    public void duplicateZeros(int[] arr) {
        int numberOFZeroToDuplicate = 0;
        boolean isZeroInBoundry = false;

        for (int i = 0; i < arr.length - numberOFZeroToDuplicate; i++) {
            if (arr[i] == 0) {
                if (i == arr.length - numberOFZeroToDuplicate - 1) {
                    isZeroInBoundry = true;
                }
                    numberOFZeroToDuplicate++;
            }
        }

        System.out.println("numberOFZeroToDuplicate" + numberOFZeroToDuplicate);

        int i = arr.length - 1;
        if (isZeroInBoundry) {
            arr[i] = 0;
            i--;
        }

        int j = i - numberOFZeroToDuplicate;
        while (i >= 0 && numberOFZeroToDuplicate > 0) {
            if (arr[j] == 0) {
                arr[i] = 0;
                i--;
                numberOFZeroToDuplicate--;
            }
            arr[i] = arr[j];
            i--;
            j--;

        }

    }


    public void displayResult() {
        int[] inputArray = new int[]{8, 4, 0, 0, 4, 0, 0, 7};
        duplicateZeros(inputArray);
        for (int element : inputArray) {
            System.out.println(element);
        }
    }
}

//8,4,0,0,4,0,0,7
//84000040

//1230
//12300
//123000
//1023  - 1002  -  2
// 1020       1,0,0,0,4,5,0