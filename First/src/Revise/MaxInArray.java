package First.src.Revise;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,300,4,55,6,7,8,9};
        int res = MaxArray(arr);
        System.out.println(res);
    }
    static int MaxArray(int[] arr){
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
