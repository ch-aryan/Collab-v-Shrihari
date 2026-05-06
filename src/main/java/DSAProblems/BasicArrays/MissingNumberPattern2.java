package DSAProblems.BasicArrays;

public class MissingNumberPattern2 {

    public static int findMissing(int arr[], int N) {

        // Sum of first N natural numbers
        int totalSum = (N * (N + 1)) / 2;

        // Sum of array elements
        int arraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraySum = arraySum + arr[i];
        }

        // Missing number
        return totalSum - arraySum;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5};

        int result = findMissing(arr, 5);

        System.out.println("Missing Number = " + result);
    }
}
