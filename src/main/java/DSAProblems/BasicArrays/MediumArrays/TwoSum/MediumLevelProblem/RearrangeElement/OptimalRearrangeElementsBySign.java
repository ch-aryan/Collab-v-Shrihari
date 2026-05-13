package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem.RearrangeElement;

public class OptimalRearrangeElementsBySign {

    public static int[] reArrangeElements(int nums[]) {

        // nums = {3,1,-2,-5,2,-4}

        int n = nums.length;

        // Final answer array
        int ans[] = new int[n];

        // Positive numbers go to even indexes
        int posIndex = 0;

        // Negative numbers go to odd indexes
        int negIndex = 1;

        // Traverse original array
        for (int i = 0; i < n; i++) {

            // ---------------------------------
            // i = 0
            // nums[0] = 3
            // Positive number
            // ---------------------------------

            // ans[0] = 3
            // posIndex becomes 2

            // ans = {3,0,0,0,0,0}

            // ---------------------------------
            // i = 1
            // nums[1] = 1
            // Positive number
            // ---------------------------------

            // ans[2] = 1
            // posIndex becomes 4

            // ans = {3,0,1,0,0,0}

            // ---------------------------------
            // i = 2
            // nums[2] = -2
            // Negative number
            // ---------------------------------

            // ans[1] = -2
            // negIndex becomes 3

            // ans = {3,-2,1,0,0,0}

            // ---------------------------------
            // i = 3
            // nums[3] = -5
            // Negative number
            // ---------------------------------

            // ans[3] = -5
            // negIndex becomes 5

            // ans = {3,-2,1,-5,0,0}

            // ---------------------------------
            // i = 4
            // nums[4] = 2
            // Positive number
            // ---------------------------------

            // ans[4] = 2
            // posIndex becomes 6

            // ans = {3,-2,1,-5,2,0}

            // ---------------------------------
            // i = 5
            // nums[5] = -4
            // Negative number
            // ---------------------------------

            // ans[5] = -4
            // negIndex becomes 7

            // Final ans:
            // {3,-2,1,-5,2,-4}

            if (nums[i] < 0) {

                // Store negative at odd index
                ans[negIndex] = nums[i];

                // Move to next odd index
                negIndex += 2;

            } else {

                // Store positive at even index
                ans[posIndex] = nums[i];

                // Move to next even index
                posIndex += 2;
            }
        }

        // Return rearranged array
        return ans;
    }

    public static void main(String[] args) {

        int nums[] = {3, 1, -2, -5, 2, -4};

        int result[] = reArrangeElements(nums);

        // Print final array
        for (int ans : result) {
            System.out.print(ans + " ");
        }
    }
}