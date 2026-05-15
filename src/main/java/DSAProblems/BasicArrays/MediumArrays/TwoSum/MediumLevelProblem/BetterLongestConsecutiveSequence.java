package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;

import java.util.Arrays;

public class BetterLongestConsecutiveSequence {

    public static int findLongestSequence(int arr[]) {

        // if array empty return 0
        if(arr.length == 0) {

            return 0;
        }

        // original array:
        // {101,4,100,2,102,1,3,99,1,2}

        // after sorting:
        // {1,1,2,2,3,4,99,100,101,102}
        Arrays.sort(arr);

        // stores maximum sequence length
        int longest = 1;

        // stores current sequence count
        int count = 0;

        // stores previous smaller element
        int lastSmaller = Integer.MIN_VALUE;

        // traverse sorted array
        for(int i = 0; i < arr.length; i++) {

            // -----------------------------
            // i = 0
            // arr[i] = 1
            // lastSmaller = MIN_VALUE
            //
            // 1-1 == MIN_VALUE ?
            // false
            //
            // duplicate check:
            // MIN_VALUE != 1
            // true
            //
            // count = 1
            // lastSmaller = 1
            //
            // longest = max(1,1)=1
            // -----------------------------

            // consecutive element found
            if(arr[i] - 1 == lastSmaller) {

                // increase sequence count
                count++;

                // update previous element
                lastSmaller = arr[i];
            }

            // -----------------------------
            // i = 1
            // arr[i] = 1
            //
            // 1-1 == 1 ?
            // false
            //
            // duplicate check:
            // 1 != 1
            // false
            //
            // duplicate ignored
            // -----------------------------

            // new sequence starts
            else if(lastSmaller != arr[i]) {

                count = 1;

                lastSmaller = arr[i];
            }

            // -----------------------------
            // i = 2
            // arr[i] = 2
            //
            // 2-1 == 1 ?
            // true
            //
            // count = 2
            // lastSmaller = 2
            //
            // longest = 2
            // -----------------------------

            // -----------------------------
            // i = 3
            // arr[i] = 2
            //
            // duplicate ignored
            // -----------------------------

            // -----------------------------
            // i = 4
            // arr[i] = 3
            //
            // 3-1 == 2 ?
            // true
            //
            // count = 3
            // lastSmaller = 3
            //
            // longest = 3
            // -----------------------------

            // -----------------------------
            // i = 5
            // arr[i] = 4
            //
            // 4-1 == 3 ?
            // true
            //
            // count = 4
            // lastSmaller = 4
            //
            // longest = 4
            // -----------------------------

            // -----------------------------
            // i = 6
            // arr[i] = 99
            //
            // 99-1 == 4 ?
            // false
            //
            // new sequence starts
            //
            // count = 1
            // lastSmaller = 99
            // -----------------------------

            // update maximum sequence length
            longest = Math.max(longest, count);
        }

        return longest;
    }

    public static void main(String[] args) {

        int arr[] = {101,4,100,2,102,1,3,99,1,2};

        int result = findLongestSequence(arr);

        System.out.println("Longest Consecutive Length: " + result);
    }
}
