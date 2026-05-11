package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;

public class MaximumSubarraySumOptimal {

    public static int maximumSubarraySum(int arr[]) {

        // stores current running sum
        int sum = 0;

        // stores maximum sum
        int maxi = Integer.MIN_VALUE;


        // Kadane's Algorithm
        for(int i = 0; i < arr.length; i++) {

            // add current element
            sum = sum + arr[i];

            // update maximum sum
            if(sum > maxi) {

                maxi = sum;
            }

            /*
             If running sum becomes negative,
             discard subarray
            */
            if(sum < 0) {

                sum = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {

        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        int result = maximumSubarraySum(arr);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}
