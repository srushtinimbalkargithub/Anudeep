
package mypackage;
import java.util.*;
public class IntegerConversion {

	public static void main(String[] args) {
		Scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null input detected.");
        }
 }









 

 
