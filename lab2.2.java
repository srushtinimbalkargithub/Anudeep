
package login;
import java.nio.file.StandardOpenOption;
import java.time.Month;

public class MonthDays 
{
	 public static void main(String[] args) 
	 {
		// Iterate through each month in the enum
	        for (Month month : Month.values()) {
	            // Get the total number of days in the month
	            int totalDays = getTotalDays(month);

	            // Print the name of the month and the total number of days
	            System.out.println(month + ": " + totalDays + " days");
	        }
	    }
	    
	    // Method to get the total number of days in a month
	    public static int getTotalDays(Month month) {
	        switch (month) {
	            case JANUARY:
	            case MARCH:
	            case MAY:
	            case JULY:
	            case AUGUST:
	            case OCTOBER:
	            case DECEMBER:
	                return 31;
	            case APRIL:
	            case JUNE:
	            case SEPTEMBER:
	            case NOVEMBER:
	                return 30;
	            case FEBRUARY:
	                return 28; // Non-leap year
	            default:
	                return -1; // Error case
	        }
	    }
 }

