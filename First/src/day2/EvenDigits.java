package First.src.day2;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,10,233,2345,1,23};
        int ans =check(arr);
        System.out.println(ans);
    }

    //check if digit is even or not
  static int check(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(digit(arr[i]) % 2 == 0){
                count++;
            }
        }
        return count;
  }



    static int digit(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
}
