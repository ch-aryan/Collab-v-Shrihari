package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem;

public class BruteLongestConsecutiveSequence {

    public static int findLongestSequence(int arr[]) {

        int longest = 1;

        for(int i = 0; i < arr.length; i++) {

            int x = arr[i];

            int count = 1;

            for(int j = 0; j < arr.length; j++) {

                // check next consecutive element
                if(arr[j] == x + 1) {

                    x++;

                    count++;

                    // restart loop from beginning
                    j = -1;
                }
            }

            // update maximum length
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