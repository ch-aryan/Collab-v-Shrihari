package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;

import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int arr[]) {

        int n = arr.length;

        // Initial Array
        // [2,1,5,4,3,0,0]

        int ind = -1;

        // =====================================================
        // STEP 1 : FIND BREAKPOINT
        // =====================================================

        for (int i = n - 2; i >= 0; i--) {

            // i = 5
            // arr[5] = 0
            // arr[6] = 0
            //
            // 0 < 0 ? FALSE
            //
            // Array:
            // [2,1,5,4,3,0,0]

            // -------------------------------------------------

            // i = 4
            // arr[4] = 3
            // arr[5] = 0
            //
            // 3 < 0 ? FALSE
            //
            // Array:
            // [2,1,5,4,3,0,0]

            // -------------------------------------------------

            // i = 3
            // arr[3] = 4
            // arr[4] = 3
            //
            // 4 < 3 ? FALSE
            //
            // Array:
            // [2,1,5,4,3,0,0]

            // -------------------------------------------------

            // i = 2
            // arr[2] = 5
            // arr[3] = 4
            //
            // 5 < 4 ? FALSE
            //
            // Array:
            // [2,1,5,4,3,0,0]

            // -------------------------------------------------

            // i = 1
            // arr[1] = 1
            // arr[2] = 5
            //
            // 1 < 5 ? TRUE
            //
            // Breakpoint Found

            if (arr[i] < arr[i + 1]) {

                // ind = 1
                ind = i;

                break;
            }
        }

        // Breakpoint Index:
        // ind = 1

        // Breakpoint Value:
        // arr[ind] = 1

        // =====================================================
        // STEP 2 : CHECK IF NO BREAKPOINT
        // =====================================================

        // If ind remains -1
        // it means array is descending
        // Example:
        // [5,4,3,2,1]

        if (ind == -1) {

            reverse(arr, 0, n - 1);

            return;
        }

        // =====================================================
        // STEP 3 : FIND NEXT GREATER ELEMENT
        // =====================================================

        for (int i = n - 1; i > ind; i--) {

            // i = 6
            // arr[6] = 0
            //
            // 0 > 1 ? FALSE
            //
            // Array:
            // [2,1,5,4,3,0,0]

            // -------------------------------------------------

            // i = 5
            // arr[5] = 0
            //
            // 0 > 1 ? FALSE
            //
            // Array:
            // [2,1,5,4,3,0,0]

            // -------------------------------------------------

            // i = 4
            // arr[4] = 3
            //
            // 3 > 1 ? TRUE
            //
            // Swap arr[4] and arr[1]

            if (arr[i] > arr[ind]) {

                int temp = arr[i];

                arr[i] = arr[ind];

                arr[ind] = temp;

                // Array after swap:
                // [2,3,5,4,1,0,0]

                break;
            }
        }

        // =====================================================
        // STEP 4 : REVERSE RIGHT HALF
        // =====================================================

        // Reverse from:
        // ind+1 = 2
        // to
        // n-1 = 6

        // Current Array:
        // [2,3,5,4,1,0,0]

        reverse(arr, ind + 1, n - 1);

        // Reverse Process:

        // -------------------------------------
        // swap arr[2] and arr[6]
        // swap 5 and 0
        //
        // Array:
        // [2,3,0,4,1,0,5]

        // -------------------------------------

        // swap arr[3] and arr[5]
        // swap 4 and 0
        //
        // Array:
        // [2,3,0,0,1,4,5]

        // Final Answer:
        // [2,3,0,0,1,4,5]
    }

    // =====================================================
    // REVERSE FUNCTION
    // =====================================================

    public static void reverse(int arr[], int start, int end) {

        while (start < end) {

            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {2,1,5,4,3,0,0};

        nextPermutation(arr);

        System.out.println(Arrays.toString(arr));
    }
}
