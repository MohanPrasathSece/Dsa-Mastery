import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        switch(fruit){
            case "apple":
                System.out.println("A sweet red fruit");
                break;

            case "mango":
                System.out.println("Summer fruit");
                break;

            case "grape":
                System.out.println("Small fruit");
                break;

            default:
                System.out.println("Enter a valid fruit");
        }

    }
}
