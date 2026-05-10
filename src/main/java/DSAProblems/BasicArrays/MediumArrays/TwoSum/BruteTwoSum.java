package DSAProblems.BasicArrays.MediumArrays.TwoSum;

public class BruteTwoSum {
    public static int[] findingTargetIndexes(int arr[],int target){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    continue;
                }
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr [] = {2,5,6,8,11};

        int result[] = findingTargetIndexes(arr,14);
        System.out.println("target found at indexes : "+ result[0] +" "+ result[1]);
    }
}
