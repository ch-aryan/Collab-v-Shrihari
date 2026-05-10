package DSAProblems.BasicArrays.MediumArrays.TwoSum;

import java.util.HashMap;

public class BetterTwoSum {
    public static int[] findingTargetIndexes(int arr[],int target){
        HashMap<Integer,Integer> tMap = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            int remaining = target - arr[i];
            if(tMap.containsKey(remaining)){
                return new int[]{tMap.get(remaining),i};
            }
            tMap.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr [] = {2,5,6,11,8};

        int result[] = findingTargetIndexes(arr,14);
        System.out.println("target found at indexes : "+ result[0] +" "+ result[1]);
    }
}

