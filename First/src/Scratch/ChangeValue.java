package First.src.Scratch;
import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        changeValue(arr);
     }

     static void changeValue(int[] nums){
        nums[1] = 171;
         System.out.println(Arrays.toString(nums));
     }
}
