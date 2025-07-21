package First.src.Revise;

import java.util.Scanner;

public class countOccurance {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 1223334444;
    int x = sc.nextInt();
    int res = occurance(n, x);
        System.out.println(res);
    }

    static int occurance(int n, int x){
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if (rem == x){
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
