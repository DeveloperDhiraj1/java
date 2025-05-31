
import java.util.Scanner;

public class Amit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("fabuary");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            default:
                System.out.println("invalid number");
        }
    }
}
