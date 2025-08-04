package First.src.day3;

public class OgnasticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 100,80,60,40,20,10,5};
        int target = 10;
        int ans = OgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int OgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc =  arr[start] < arr[end];

        if(isAsc){
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(arr[mid] == target){
                    return mid;
                } else if(arr[mid] > target){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        else{
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(arr[mid] == target){
                    return mid;
                } else if(arr[mid] < target){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
