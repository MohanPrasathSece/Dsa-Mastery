package First.src.Scratch;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //armstrong(n);
        for(int i = 100; i < 1000; i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }
    }
       static boolean armstrong(int n){
            int res = 0;
            int temp = n;
            while (temp > 0) {
                int rem = temp % 10;
                res = res + (rem * rem * rem);
                temp = temp / 10;

            }
            if (n == res) {
                return true;
            } else {
                return false;
            }
        }


}
