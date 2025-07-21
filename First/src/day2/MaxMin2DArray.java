package First.src.day2;

public class MaxMin2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8,}, {9,10,11,12}, {12,13,14,15}};
        int minimum = min(arr);
        System.out.println(minimum);
        int maximum = max(arr);
        System.out.println(maximum);
    }

    static int min(int[][] arr){
        int minVal = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] < minVal){
                    minVal = arr[row][col];
                }
            }
        }
        return minVal;
    }
    static int max(int[][] arr){
        int maxVal = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > maxVal){
                    maxVal = arr[row][col];
                }
            }
        }
        return maxVal;
    }
}
