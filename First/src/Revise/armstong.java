package First.src.Revise;

import java.util.Scanner;

public class armstong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isArmstrong(n);
        System.out.println(res);
    }

    static boolean isArmstrong(int n){
        int temp = n;
        int res = 0;
        while(n > 0){
            int rem = n % 10;
            res = res + (rem * rem * rem);
            n = n / 10;
        }
        if(res == temp){
            return true;
        }
        else{
            return false;
        }

    }
}
