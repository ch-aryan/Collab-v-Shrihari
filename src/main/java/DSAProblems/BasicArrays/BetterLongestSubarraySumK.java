package DSAProblems.BasicArrays;

import java.util.HashMap;

public class BetterLongestSubarraySumK {

    public static int longestSubarrayWithSumK(int arr[], int k) {

        // HashMap stores:
        // prefixSum -> index
        HashMap<Long, Integer> preSumMap = new HashMap<>();

        // running sum
        long sum = 0;

        // stores longest length
        int maxLen = 0;

        // traverse array
        for(int i = 0; i < arr.length; i++) {

            // STEP 1:
            // add current element into running sum

            // Example:
            // i = 0
            // arr[0] = 1
            // sum = 0 + 1 = 1

            // i = 1
            // arr[1] = 2
            // sum = 1 + 2 = 3

            sum += arr[i];



            // STEP 2:
            // if total sum itself becomes k
            // then subarray starts from index 0

            // Example:
            // sum = 3
            // k = 3
            // maxLen = 2

            if(sum == k) {

                maxLen = i + 1;
            }



            // STEP 3:
            // calculate remaining value

            // Formula:
            // rem = currentSum - k

            // Example:
            // sum = 6
            // k = 3
            // rem = 3

            long rem = sum - k;



            // STEP 4:
            // check if rem already exists in map

            // Meaning:
            // if rem existed before,
            // then middle subarray sum becomes k

            if(preSumMap.containsKey(rem)) {

                // get previous index

                // Example:
                // rem = 3
                // map contains:
                // 3 -> 1

                int prevIndex = preSumMap.get(rem);



                // calculate subarray length

                // Example:
                // current i = 2
                // previous index = 1
                // len = 2 - 1 = 1

                int len = i - prevIndex;



                // update maximum length

                // Example:
                // maxLen = max(2,1)
                // maxLen = 2

                maxLen = Math.max(maxLen, len);
            }



            // STEP 5:
            // store current prefix sum first time only

            // Example:
            // map.put(1,0)
            // map.put(3,1)
            // map.put(6,2)

            if(!preSumMap.containsKey(sum)) {

                preSumMap.put(sum, i);
            }



            // STEP 6:
            // visualize current HashMap

            // Example:
            // {
            //   1=0,
            //   3=1,
            //   6=2
            // }

        }

        // return final longest length
        return maxLen;
    }

    public static void main(String[] args) {

        // input array
        int arr[] = {1, 2, 3, 1, 1, 1, 1};

        // target sum
        int k = 3;

        // function call
        int result = longestSubarrayWithSumK(arr, k);

        // final answer
        System.out.println("Longest Length = " + result);
    }
}