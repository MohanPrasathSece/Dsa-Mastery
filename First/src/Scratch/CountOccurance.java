package First.src.Scratch;

import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 32444421;
        int n = sc.nextInt();
        int count = 0;
        while(a > 0){
            int rem = a % 10;
            if(rem == n){
                count++;
            }
            a = a / 10;
        }
        System.out.println(count);

    }
}
