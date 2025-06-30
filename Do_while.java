
import java.util.Scanner;

public class Do_while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int choice;

        do {
            System.out.println(" ATM Menu ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance:" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit:");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Rs" + deposit + " deposited successfully.");
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: Rs");
                    int withdraw = sc.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Rs" + withdraw + " withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
