package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;

public class MajorityElementOptimal {

    public static int checkMajority(int arr[]) {

        // stores current majority candidate
        int element = 0;

        // stores frequency count
        int count = 0;

        // ---------------- PHASE 1 : MOORE VOTING ----------------

        for(int i = 0; i < arr.length; i++) {

            // if count becomes 0
            // choose new candidate
            if(count == 0) {

                element = arr[i];

                count = 1;
            }

            // if same element found
            else if(arr[i] == element) {

                count++;
            }

            // if different element found
            else {

                count--;
            }
        }

        // ---------------- PHASE 2 : VERIFICATION ----------------

        // reset count
        count = 0;

        // count frequency of candidate
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == element) {

                count++;
            }
        }

        // majority condition
        if(count > arr.length / 2) {

            return element;
        }

        // no majority element
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {7,7,5,5,7,2,1,5,7,3,5,7};

        int res = checkMajority(arr);

        if(res != -1) {

            System.out.println("Majority Element = " + res);
        }

        else {

            System.out.println("No Majority Element Found");
        }
    }
}



/*
============================================================================

DRY RUN

ARRAY

[7,7,5,5,7,2,1,5,7,3,5,7]

n = 12

majority condition:
count > n/2
count > 6

============================================================================


---------------- PHASE 1 : FIND CANDIDATE ----------------


INITIAL

element = 0
count = 0


============================================================================

i = 0

arr[i] = 7

count == 0

choose new candidate

element = 7
count = 1


ARRAY

[7,7,5,5,7,2,1,5,7,3,5,7]
 ↑

============================================================================

i = 1

arr[i] = 7

same as candidate

count++

count = 2


ARRAY

[7,7,5,5,7,2,1,5,7,3,5,7]
   ↑

============================================================================

i = 2

arr[i] = 5

different element

count--

count = 1


ARRAY

[7,7,5,5,7,2,1,5,7,3,5,7]
     ↑

============================================================================

i = 3

arr[i] = 5

different element

count--

count = 0


candidate cancelled


ARRAY

[7,7,5,5,7,2,1,5,7,3,5,7]
       ↑

============================================================================

i = 4

arr[i] = 7

count == 0

new candidate

element = 7
count = 1


ARRAY

[7,7,5,5,7,2,1,5,7,3,5,7]
         ↑

============================================================================

i = 5

arr[i] = 2

different

count--

count = 0

============================================================================

i = 6

arr[i] = 1

count == 0

new candidate

element = 1
count = 1

============================================================================

i = 7

arr[i] = 5

different

count--

count = 0

============================================================================

i = 8

arr[i] = 7

count == 0

new candidate

element = 7
count = 1

============================================================================

i = 9

arr[i] = 3

different

count--

count = 0

============================================================================

i = 10

arr[i] = 5

count == 0

new candidate

element = 5
count = 1

============================================================================

i = 11

arr[i] = 7

different

count--

count = 0

============================================================================

FINAL CANDIDATE

element = 5


============================================================================
---------------- PHASE 2 : VERIFICATION ----------------
============================================================================

count frequency of 5

5 appears 4 times

majority condition:

4 > 6 ❌

false


============================================================================

RETURN

-1

No majority element exists.

============================================================================
*/