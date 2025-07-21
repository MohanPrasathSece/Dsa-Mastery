package First.src.Scratch;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,6,7,8,9};
        System.out.println(max(arr,1,5));
    }

    static int max(int[] arr, int start,int end){
        int max_val = arr[0];
        for(int i = start; i < end; i++){
            if(arr[i] > max_val){
                max_val = arr[i];
            }
        }
        return max_val;
    }
}
