
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double avg = (double) sum / size;

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + avg);
    }
}
