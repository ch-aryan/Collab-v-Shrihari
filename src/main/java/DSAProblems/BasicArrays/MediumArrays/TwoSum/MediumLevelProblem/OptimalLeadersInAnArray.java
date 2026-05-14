package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;
import java.util.ArrayList;
import java.util.Collections;

public class OptimalLeadersInAnArray {

    public static ArrayList<Integer> findingLeader(int arr[]) {

        // Initial maximum value
        int maxi = Integer.MIN_VALUE;

        // Length of array
        int n = arr.length;

        // ArrayList to store leaders
        ArrayList<Integer> ans = new ArrayList<>();


        // Array:
        // {10,22,12,3,0,6}


        // Traverse from RIGHT to LEFT
        for(int i = n-1; i>=0; i--) {

            // ---------------- ITERATION 1 ----------------
            // i = 5
            // arr[i] = 6
            // maxi = -2147483648

            // Check:
            // 6 > -2147483648  -> TRUE

            if(arr[i] > maxi) {

                // Update maxi
                // maxi = 6
                maxi = arr[i];

                // Add leader into ans
                // ans = [6]
                ans.add(arr[i]);
            }

            // Math.max(6,6) = 6
            // maxi remains 6
            maxi = Math.max(maxi,arr[i]);



            // ---------------- ITERATION 2 ----------------
            // i = 4
            // arr[i] = 0
            // maxi = 6

            // Check:
            // 0 > 6 -> FALSE

            // if block skipped

            // Math.max(6,0) = 6
            // maxi remains 6



            // ---------------- ITERATION 3 ----------------
            // i = 3
            // arr[i] = 3
            // maxi = 6

            // Check:
            // 3 > 6 -> FALSE

            // if block skipped

            // Math.max(6,3) = 6
            // maxi remains 6



            // ---------------- ITERATION 4 ----------------
            // i = 2
            // arr[i] = 12
            // maxi = 6

            // Check:
            // 12 > 6 -> TRUE

            // maxi = 12
            // ans = [6,12]



            // ---------------- ITERATION 5 ----------------
            // i = 1
            // arr[i] = 22
            // maxi = 12

            // Check:
            // 22 > 12 -> TRUE

            // maxi = 22
            // ans = [6,12,22]



            // ---------------- ITERATION 6 ----------------
            // i = 0
            // arr[i] = 10
            // maxi = 22

            // Check:
            // 10 > 22 -> FALSE

            // if block skipped

            // Math.max(22,10) = 22
            // maxi remains 22
        }


        // Before sorting:
        // ans = [6,12,22]

        Collections.sort(ans);

        // After sorting:
        // ans = [6,12,22]

        return ans;
    }

    public static void main(String[] args) {

        int arr [] = {10,22,12,3,0,6};

        ArrayList<Integer> result = findingLeader(arr);

        for(int num : result) {

            // Printing:
            // 6 12 22
            System.out.print("[" +num+ "]");
        }
    }
}