package First.src.Scratch;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("0");
        }
        int a = 0;
        int b = 1;
        int count = 2;

        int temp;
        while(count <= n){
            temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
