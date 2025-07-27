
import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner ag = new Scanner(System.in);
        System.out.println("Enter your age=");
        int Age = ag.nextInt();
        if (Age >= 18) {
            System.out.println("You can do Voting");
        } else {
            System.out.println("You can't Voting");
        }
    }
}
