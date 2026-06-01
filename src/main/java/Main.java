public class Main {
    public static void main(String[]args){
        int arr [] =  {8,12,14,10,20};
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for(int i =1;i< arr.length;i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];


            }else if(arr[i] <= largest && arr[i] >= slargest){
                slargest = arr[i];
            }

        }

        System.out.println(slargest);

        }
    }

