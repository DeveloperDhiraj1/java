
import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the frist number A=");
        int a = n.nextInt();
        System.out.println("Enter the Second number B=");
        int b = n.nextInt();
        System.out.println("Enter the third number C=");
        int c = n.nextInt();
        if (a > b & a > c) {
            System.out.println("The largest number=");

        } else if (b > c & b > a) {
            System.out.println("The largest number=" + b);

        } else {
            System.out.println("The largest number=" + c);
        }
    }
}
