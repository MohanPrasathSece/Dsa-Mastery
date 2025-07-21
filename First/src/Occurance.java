import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = 1234522334;
       int n = sc.nextInt();
       int count = 0;
       while(num > 0){
           int rem = num % 10;
           if(rem == n){
               count++;
           }
           num = num / 10;
       }
        System.out.println(count);
    }
}
