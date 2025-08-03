package First.src.day3;

public class BinarySearchDescending {
    public static void main(String[] args) {
        int[] arr = { 100,80,60,40,20,10,5};
        int target = 10;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                start = mid + 1;
            }
            else if(target > arr[mid]){
                end = mid - 1;
            }
            else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}
