package DSAProblems.BasicArrays;

public class OptimalLongestSubarraySumK {

    public static int longestSubarrayWithSumK(int arr[], int k) {

        // left pointer
        int left = 0;

        // right pointer
        int right = 0;

        // current window sum
        long sum = arr[0];

        // stores maximum length
        int maxLen = 0;

        int n = arr.length;

        // traverse array
        while(right < n) {

            /*
             -----------------------------------
             DRY RUN EXAMPLE

             arr = [1,2,3,1,1,1,1]
             k = 3

             Initial:
             left = 0
             right = 0
             sum = 1

             Window:
             [1]
              L
              R
             -----------------------------------
            */


            // if sum becomes greater than k
            // shrink window from left side
            while(left <= right && sum > k) {

                /*
                 Example:

                 Window:
                 [1,2,3]
                  L   R

                 sum = 6

                 6 > 3

                 remove arr[left]

                 sum = 6 - 1 = 5
                 left++

                 New Window:
                 [2,3]

                 Again:
                 5 > 3

                 remove arr[left]

                 sum = 5 - 2 = 3
                 left++

                 New Window:
                 [3]
                */

                sum -= arr[left];

                left++;
            }


            // if sum becomes equal to k
            if(sum == k) {

                /*
                 Example:

                 Window:
                 [1,2]

                 left = 0
                 right = 1

                 Length:
                 1 - 0 + 1 = 2

                 maxLen = 2
                */

                maxLen = Math.max(maxLen, right - left + 1);
            }


            // move right pointer
            right++;

            /*
             Example:

             right moves from:
             0 -> 1
             1 -> 2
             2 -> 3
            */


            // add next element into current window
            if(right < n) {

                /*
                 Example:

                 Current sum = 3

                 right = 2

                 arr[2] = 3

                 sum = 3 + 3 = 6
                */

                sum += arr[right];
            }


            /*
             -----------------------------------
             VISUAL WINDOW MOVEMENT

             [1,2,3,1,1,1,1]
              L R

             [1,2,3,1,1,1,1]
              L   R

             [1,2,3,1,1,1,1]
                  LR

             [1,2,3,1,1,1,1]
                    L   R
             -----------------------------------
            */
        }

        // return final answer
        return maxLen;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,1,1,1,1};

        int k = 3;

        int result = longestSubarrayWithSumK(arr, k);

        System.out.println("Longest Length = " + result);
    }
}