import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the operator: ");
            char ch = sc.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.println("Enter num1: ");
                int a = sc.nextInt();
                System.out.println("Enter num2: ");
                int b = sc.nextInt();

                if(ch == '+'){
                    ans = a + b;
                }
                if(ch == '-'){
                    ans = a- b;
                }
                if(ch == '*'){
                    ans = a * b;
                }
                if(ch == '/'){
                    ans = a / b;
                }
                if(ch == '%'){
                    ans = a % b;
                }
            }
            else if( ch == 'x' || ch == 'X')
            {
                break;
            }
            System.out.println(ans);
        }
    }
}
