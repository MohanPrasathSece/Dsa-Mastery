package First.src.Scratch;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int n = sc.nextInt();
        while(n > 0){
            int rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        System.out.println(res);
    }
}
