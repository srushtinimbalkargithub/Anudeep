
package mypackage;
import java.util.*;

public class IntegerInput {

	public static void main(String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        while (true) {
            try {
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

	}

}



