package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;
import java.util.HashSet;

public class OptimalLongestConsecutiveSequence {

    public static int findLongestSequence(int arr[]) {

        // Original Array
        // {101,4,100,2,102,1,3,99,1,2}

        HashSet<Integer> set = new HashSet<>();

        // -----------------------------
        // Store elements into HashSet
        // duplicates automatically removed
        // -----------------------------

        for(int num : arr) {

            set.add(num);
        }

        // Final HashSet:
        //
        // +-----+-----+-----+-----+-----+-----+-----+------+
        // |  1  |  2  |  3  |  4  | 99  | 100 | 101 | 102 |
        // +-----+-----+-----+-----+-----+-----+-----+------+

        int longest = 0;

        // traverse HashSet
        for(int num : set) {

            // ------------------------------------------------
            // ITERATION 1
            // num = 1
            // ------------------------------------------------

            // check previous consecutive number exists or not
            //
            // set.contains(0)
            //
            // 0 not present
            //
            // contains(0) -> false
            //
            // !false -> true
            //
            // Meaning:
            // 1 is starting point of sequence
            //
            // because no previous consecutive number exists

            if(!set.contains(num - 1)) {

                int current = num;

                int count = 1;

                // -----------------------------------------
                // current = 1
                // count = 1
                // -----------------------------------------

                // check next consecutive numbers
                while(set.contains(current + 1)) {

                    // -----------------------------------------
                    // check set.contains(2)
                    //
                    // 2 exists
                    //
                    // current = 2
                    // count = 2
                    // -----------------------------------------

                    // -----------------------------------------
                    // check set.contains(3)
                    //
                    // 3 exists
                    //
                    // current = 3
                    // count = 3
                    // -----------------------------------------

                    // -----------------------------------------
                    // check set.contains(4)
                    //
                    // 4 exists
                    //
                    // current = 4
                    // count = 4
                    // -----------------------------------------

                    // -----------------------------------------
                    // check set.contains(5)
                    //
                    // 5 NOT exists
                    //
                    // while loop stops
                    // -----------------------------------------

                    current++;

                    count++;
                }

                // update longest sequence
                longest = Math.max(longest, count);

                // longest = 4
            }

            // ------------------------------------------------
            // ITERATION 2
            // num = 2
            // ------------------------------------------------
            //
            // check:
            // set.contains(1)
            //
            // 1 exists
            //
            // contains(1) -> true
            //
            // !true -> false
            //
            // Meaning:
            // 2 is NOT starting point
            //
            // skip sequence
            // because sequence already started from 1
            // ------------------------------------------------

            // same logic skips:
            // 3
            // 4
            // 100
            // 101
            // 102
        }

        return longest;
    }

    public static void main(String[] args) {

        int arr[] = {101,4,100,2,102,1,3,99,1,2};

        int result = findLongestSequence(arr);

        System.out.println("Longest Consecutive Length: " + result);
    }
}