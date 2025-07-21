import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//
//        if(a>b && a>c){
//            System.out.println("A is greatest: " + a);
//        }
//        else if(b>a && b>c){
//            System.out.println("B is greatest: " + b);
//        }
//        else {
//            System.out.println("C i greatest: "+ c);
//        }
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
}
