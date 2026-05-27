public class ConsecutiveSequence {
    public static int findConsecutive(int arr[]){
        int count = 1;
        int maxi = 1;
        for(int i =1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                count = 1;
            }
            maxi = Math.max(maxi,count);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr [] = {0,1,0,1,1,1,1};
        int ans  = findConsecutive(arr);
        System.out.println(ans);

    }
}
