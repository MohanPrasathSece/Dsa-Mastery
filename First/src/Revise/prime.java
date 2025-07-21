package First.src.Revise;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        int i = 2;
        while(i * i <= n){
            if(n % i == 0){
                return false;
            }
            i++;

        }
        return true;
    }
}
