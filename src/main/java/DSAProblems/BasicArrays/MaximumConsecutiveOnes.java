package DSAProblems.BasicArrays;

import static java.lang.Math.max;

public class MaximumConsecutiveOnes {
    public static int findMaximumOnes(int arr[]){
        int maxi = 0;
        int count =0;
        for(int i = 0;i< arr.length-1;i++){
            if(arr[i] == 1){
                count++;
                maxi = max(maxi,count);
            }else{
                count = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr [] = {1,1,0,1,1,1,0,1,1};
        int result = findMaximumOnes(arr);
        System.out.print(result);
    }

}
