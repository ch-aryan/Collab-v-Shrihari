package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;

public class Sort012Optimal {

    public static void sortArray(int arr[]) {

        // low -> next position for 0
        int low = 0;

        // mid -> current element checking pointer
        int mid = 0;

        // high -> next position for 2
        int high = arr.length - 1;

        /*
         ------------------------------------------------

         INITIAL ARRAY

         arr = [1, 0, 2, 1, 0, 2, 1, 0]

         low = 0
         mid = 0
         high = 7

         ARRAY VISUAL

         [1, 0, 2, 1, 0, 2, 1, 0]
          L
          M
                               H

         ------------------------------------------------
        */


        // traverse until mid crosses high
        while(mid <= high) {

            /*
             ------------------------------------------------

             REGIONS

             0 to low-1     -> all 0s
             low to mid-1   -> all 1s
             mid to high    -> unknown area
             high+1 to end  -> all 2s

             ------------------------------------------------
            */


            // if current element is 0
            if(arr[mid] == 0) {

                /*
                 Example:

                 [1,0,2,1,0,2,1,0]
                    M
                  L

                 0 should go LEFT side

                 swap low and mid
                */

                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                /*
                 After swap:

                 [0,1,2,1,0,2,1,0]
                  L
                  M
                               H
                */

                // move both
                low++;
                mid++;
            }


            // if current element is 1
            else if(arr[mid] == 1) {

                /*
                 Example:

                 [0,1,2,1,0,2,1,0]
                    M

                 1 is already in correct middle region

                 simply move mid
                */

                mid++;
            }


            // if current element is 2
            else {

                /*
                 Example:

                 [0,1,2,1,0,2,1,0]
                      M         H

                 2 should go RIGHT side

                 swap mid and high
                */

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                /*
                 After swap:

                 [0,1,0,1,0,2,1,2]
                      M       H

                 high moves left

                 IMPORTANT:
                 mid does NOT move

                 because swapped element
                 from high side is still UNKNOWN
                */

                high--;
            }


            /*
             ------------------------------------------------

             FINAL EXPECTED ARRAY

             [0,0,0,1,1,1,2,2]

             ------------------------------------------------
            */
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 1, 0, 2, 1, 0};

        sortArray(arr);

        System.out.println("Sorted Array:");

        for(int num : arr) {

            System.out.print(num + " ");
        }
    }
}