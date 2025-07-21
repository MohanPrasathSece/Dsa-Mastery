package First.src;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            res = res * 10 + rem;
        }
        System.out.println(res);
    }
}
