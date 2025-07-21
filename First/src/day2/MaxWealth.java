package First.src.day2;

public class MaxWealth {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {40,5,6}, {7,5,0}};
        int ans = maxSum(arr);
        System.out.println(ans);
    }

    static int maxSum(int[][] arr){
        int max = 0;
        for(int row = 0; row < arr.length; row++){
            int rowSum = 0;
            for(int col = 0; col < arr[row].length; col++){
                rowSum = rowSum + arr[row][col];
            }
            if(rowSum > max){
                max = rowSum;
            }
        }
        return max;
    }
}
