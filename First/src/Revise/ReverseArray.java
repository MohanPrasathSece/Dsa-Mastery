package First.src.Revise;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        reverse(arr);
    }

    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
