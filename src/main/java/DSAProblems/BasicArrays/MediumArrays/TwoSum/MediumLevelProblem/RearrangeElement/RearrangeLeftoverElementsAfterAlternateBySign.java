package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem.RearrangeElement;
import java.util.ArrayList;

public class RearrangeLeftoverElementsAfterAlternateBySign {

    public static int[] rearrangeArray(int arr[]) {

        // Example:
        // arr = {1,2,-4,-5,3,6}

        int n = arr.length;

        int ans[] = new int[n];

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // ---------------------------------
        // Step 1 : Separate positive and negative
        // ---------------------------------

        for (int i = 0; i < n; i++) {

            // i = 0
            // arr[0] = 1
            // positive
            // pos = {1}

            // i = 1
            // arr[1] = 2
            // positive
            // pos = {1,2}

            // i = 2
            // arr[2] = -4
            // negative
            // neg = {-4}

            // i = 3
            // arr[3] = -5
            // negative
            // neg = {-4,-5}

            // i = 4
            // arr[4] = 3
            // positive
            // pos = {1,2,3}

            // i = 5
            // arr[5] = 6
            // positive
            // pos = {1,2,3,6}

            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        // Final:
        // pos = {1,2,3,6}
        // neg = {-4,-5}

        // pos.size() = 4
        // neg.size() = 2

        // ---------------------------------
        // Case 1 :
        // Positive elements are more
        // ---------------------------------

        if (pos.size() > neg.size()) {

            // ---------------------------------
            // Step 2 : Alternate placement
            // ---------------------------------

            for (int i = 0; i < neg.size(); i++) {

                // ---------------------------------
                // i = 0
                // ---------------------------------

                // ans[0] = pos.get(0)
                // ans[0] = 1

                // ans[1] = neg.get(0)
                // ans[1] = -4

                // ans becomes:
                // {1,-4,0,0,0,0}

                // ---------------------------------
                // i = 1
                // ---------------------------------

                // ans[2] = pos.get(1)
                // ans[2] = 2

                // ans[3] = neg.get(1)
                // ans[3] = -5

                // ans becomes:
                // {1,-4,2,-5,0,0}

                ans[2 * i] = pos.get(i);

                ans[2 * i + 1] = neg.get(i);
            }

            // ---------------------------------
            // Step 3 : Find next empty index
            // ---------------------------------

            // neg.size() = 2

            // index = 2 * 2
            // index = 4

            // because indexes 0,1,2,3 already filled

            int index = neg.size() * 2;

            // ---------------------------------
            // Step 4 : Add remaining positives
            // ---------------------------------

            for (int i = neg.size(); i < pos.size(); i++) {

                // ---------------------------------
                // i = 2
                // ---------------------------------

                // ans[4] = pos.get(2)
                // ans[4] = 3

                // ans becomes:
                // {1,-4,2,-5,3,0}

                // index becomes 5

                // ---------------------------------
                // i = 3
                // ---------------------------------

                // ans[5] = pos.get(3)
                // ans[5] = 6

                // Final ans:
                // {1,-4,2,-5,3,6}

                ans[index] = pos.get(i);

                index++;
            }
        }

        // ---------------------------------
        // Case 2 :
        // Negative elements are more
        // ---------------------------------

        else {

            // Alternate placement
            for (int i = 0; i < pos.size(); i++) {

                ans[2 * i] = pos.get(i);

                ans[2 * i + 1] = neg.get(i);
            }

            // Find next empty index
            int index = pos.size() * 2;

            // Add remaining negatives
            for (int i = pos.size(); i < neg.size(); i++) {

                ans[index] = neg.get(i);

                index++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, -4, -5, 3, 6};

        int result[] = rearrangeArray(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}