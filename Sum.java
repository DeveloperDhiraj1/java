
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:-");
        int a = sc.nextInt();
        System.out.println("enter the second number:-");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("sum of two number:-" + c);
    }
}
