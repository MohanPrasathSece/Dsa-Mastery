package First.src.Scratch;

import java.util.Arrays;

public class IndexSwap_Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
      //  swap(arr,0,1);
        reverse(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }


    static void reverse(int[] arr, int start, int end) {
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int arr[], int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
