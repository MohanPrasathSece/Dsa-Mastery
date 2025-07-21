package First.src.Scratch;
import java.util.Scanner;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.next().trim().charAt(0);

        if(c >= 'a' && c <= 'z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("UpperCase");
        }
    }
}
