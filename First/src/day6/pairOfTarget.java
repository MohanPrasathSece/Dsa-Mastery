package First.src.day6;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class pairOfTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9};
        int target = 13;
        int[] ans = hasSomePairs(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] hasSomePairs(int[] arr, int target){
        int n = arr.length - 1;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
