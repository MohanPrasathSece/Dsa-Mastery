package First.src.day3;

public class OgnasticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 100,80,60,40,20,10,5};
        int target = 0;
        int ans = OgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int OgnosticBS(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
