package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;

public class MaximumSubarraySumPrintingIndex{

    public static void maximumSubarray(int arr[]) {

        // stores current running sum
        int sum = 0;

        // stores maximum sum
        int maxi = Integer.MIN_VALUE;

        // final starting index
        int start = 0;

        // final ending index
        int end = 0;

        // temporary starting index
        int tempStart = 0;


        // Kadane's Algorithm
        for(int i = 0; i < arr.length; i++) {

            /*
             If current sum becomes 0,
             possible new subarray starts here
            */
            if(sum == 0) {

                tempStart = i;
            }

            // add current element
            sum = sum + arr[i];


            /*
             If better maximum found,
             store:
             - maximum sum
             - starting index
             - ending index
            */
            if(sum > maxi) {

                maxi = sum;

                start = tempStart;

                end = i;
            }


            /*
             If sum becomes negative,
             discard current subarray
            */
            if(sum < 0) {

                sum = 0;
            }
        }


        // print maximum sum
        System.out.println("Maximum Sum = " + maxi);

        // print indexes
        System.out.println("Start Index = " + start);

        System.out.println("End Index = " + end);

        // print subarray
        System.out.println("Maximum Subarray:");

        for(int i = start; i <= end; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        maximumSubarray(arr);
    }
}
