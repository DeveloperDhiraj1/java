
import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entar the number");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            default:
                System.out.println("invalid number");
        }

    }
}
