package DSAProblems.BasicArrays;

public class NumAppearOnceOtherTwice {
    public static int findNumber(int arr[]){
        int XOR = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            XOR = XOR ^ arr[i];

        }
        return XOR;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4};
        int result = findNumber(arr);
        System.out.println("this number appearing once in array: " + result);
    }
}
