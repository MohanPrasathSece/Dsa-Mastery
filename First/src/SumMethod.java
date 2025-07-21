import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = Sum(num1,num2);
        System.out.println(res);

    }

     public static int Sum(int num1, int num2){
        int res = num1 + num2;
         return res;
    }
}
