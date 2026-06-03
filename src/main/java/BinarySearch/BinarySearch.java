package BinarySearch;

public class BinarySearch {
    public static int binaryAlgo(int [] arr , int key){
        int l = 0;
        int h = arr.length;
        while(l < h){
            int mid = l + (h-l)/2;
            if(arr[mid] > key){
                h = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,10};
        int key = 3;
        int res = binaryAlgo(arr, key);
        System.out.println(res);
    }
}
