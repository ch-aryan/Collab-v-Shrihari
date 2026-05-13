package DSAProblems.BasicArrays.MediumArrays.TwoSum.MediumLevelProblem.TwoSum;

import java.util.Arrays;

public class OptimalTwoSum {

    public static String twoSum(int arr[], int target) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            int sum = arr[left] + arr[right];

            if(sum == target) {
                return "YES";
            }

            else if(sum < target) {
                left++;
            }

            else {
                right--;
            }
        }

        return "NO";
    }

    public static void main(String[] args) {

        int arr[] = {2, 6, 5, 8, 11};

        int target = 14;

        System.out.println(twoSum(arr, target));
    }
}
