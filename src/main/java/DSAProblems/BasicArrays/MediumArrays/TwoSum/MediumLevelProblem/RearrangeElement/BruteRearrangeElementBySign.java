package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem.RearrangeElement;
import java.util.ArrayList;

public class BruteRearrangeElementBySign {

    public static int[] reArrangeElements(int arr[]) {

        // Original array
        // arr = {3,1,-2,-5,2,-4}

        int n = arr.length;

        // ArrayList to store positive numbers
        ArrayList<Integer> pos = new ArrayList<>();

        // ArrayList to store negative numbers
        ArrayList<Integer> neg = new ArrayList<>();

        // -------------------------------
        // Step 1 : Separate positive and negative numbers
        // -------------------------------

        for (int i = 0; i < n; i++) {

            // i = 0
            // arr[0] = 3
            // 3 > 0 → store in pos
            // pos = {3}

            // i = 1
            // arr[1] = 1
            // 1 > 0 → store in pos
            // pos = {3,1}

            // i = 2
            // arr[2] = -2
            // -2 is negative → store in neg
            // neg = {-2}

            // i = 3
            // arr[3] = -5
            // neg = {-2,-5}

            // i = 4
            // arr[4] = 2
            // pos = {3,1,2}

            // i = 5
            // arr[5] = -4
            // neg = {-2,-5,-4}

            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        // After loop:
        // pos = {3,1,2}
        // neg = {-2,-5,-4}

        // -------------------------------
        // Step 2 : Place elements alternatively
        // -------------------------------

        for (int i = 0; i < n / 2; i++) {

            // ---------------------------------
            // Iteration 1
            // i = 0
            // ---------------------------------

            // arr[2*0] = pos.get(0)
            // arr[0] = 3

            // arr[2*0 + 1] = neg.get(0)
            // arr[1] = -2

            // Array becomes:
            // {3,-2,-2,-5,2,-4}

            // ---------------------------------
            // Iteration 2
            // i = 1
            // ---------------------------------

            // arr[2*1] = pos.get(1)
            // arr[2] = 1

            // arr[2*1 + 1] = neg.get(1)
            // arr[3] = -5

            // Array becomes:
            // {3,-2,1,-5,2,-4}

            // ---------------------------------
            // Iteration 3
            // i = 2
            // ---------------------------------

            // arr[2*2] = pos.get(2)
            // arr[4] = 2

            // arr[2*2 + 1] = neg.get(2)
            // arr[5] = -4

            // Final Array:
            // {3,-2,1,-5,2,-4}

            arr[2 * i] = pos.get(i);

            arr[2 * i + 1] = neg.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {

        int arr[] = {3, 1, -2, -5, 2, -4};

        int result[] = reArrangeElements(arr);

        // Printing final array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}