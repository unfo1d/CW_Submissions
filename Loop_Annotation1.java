/**
 * This method takes an integer (1-12) and returns the corresponding month 
 * as a string. If the integer is out of range, it returns "Invalid month number"
 */
public static String getMonth(int n) {
		// Defines a single string containing all the months separated by spaces
		String months = "January February March April May June "
				+ "July August September October November December ";

		// Iterate through the 12 months
		for (int i = 1; i <= 12; i++) {
			// Finds the index of the first space, marking the end of the current month's name
			int sL = months.indexOf(' ');

			// Checks if the current iteration matches the given month number
			if (n == i) {
        				// Returns the substring up to the first space, which is the current month
				return months.substring(0, sL);
			} 
			// In any other case, remove the current month's name and the space, moving to the next month
			else {
       	// Changes the value of the string in the beginning.
				months = months.substring(sL + 1);
			}
		}
		// Returns this if the number is out of the 1-12 range.
		return "Invalid month number"
}
