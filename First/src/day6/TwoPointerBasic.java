package First.src.day6;

import java.util.Arrays;

public class TwoPointerBasic {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 10, 16, 17};
        int target = 27;
        int[] ans = hasSomePairs(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] hasSomePairs(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if((arr[left] + arr[right]) == target){
                return new int[] {left, right};
            }
            else if((arr[left] + arr[right]) > target){
                right--;
            }
            else if((arr[left] + arr[right]) < target){
                left++;
            }
        }
        return new int[] {-1, -1};
    }
}
