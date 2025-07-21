package First.src.day2;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8,}, {9,10,11,12}, {12,13,14,15}};
        int target = 10;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(target == arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
