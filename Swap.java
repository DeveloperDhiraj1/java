
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your frist number a =");
        int a = sc.nextInt();
        System.out.println("Enter your second number b =");
        int b = sc.nextInt();
        int temp;
        System.out.println("before swap number =" + a);
        System.out.println("before swap number =" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swap value of a=" + a);
        System.err.println("after swap value of b=" + b);
    }
}
