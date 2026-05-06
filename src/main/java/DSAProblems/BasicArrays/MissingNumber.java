package DSAProblems.BasicArrays;

public class MissingNumber {
    public static int findMissing(int arr[],int N){
        int xor1 =0;
        int xor2 = 0;
        int n = N-1;
        for(int i=0;i<n;i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ N;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,4,5};
        int result = findMissing(arr,5);
        System.out.println("missing number is : " + result);
    }
}
