package First.src.Scratch;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }


    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + "," + b );
    }
}
