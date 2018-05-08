import java.util.Scanner;

public class LeapYears {
	public static void main(String args[]) {
		Scanner number = new Scanner(System.in); //Input variable that holds the keyboard entry
		double year; //Year is double because I need decimal values to calculate modulus
		int month;
		short repeat = 1;
		while(repeat == 1){
			System.out.println("Enter Month:" ); //Input month number
			month = number.nextInt();
			switch (month) { // cases 4,6,9,11 check if entered months can have 30 days
				case 4:
					System.out.println("Luna are 30 de zile");
					break;
				case 6:
					System.out.println("Luna are 30 de zile");
					break;
				case 9:
					System.out.println("Luna are 30 de zile");
					break;
				case 11:
					System.out.println("Luna are 30 de zile");
					break;
				case 2: //case 2 is for Leap year calculation and 28 or 29 days decision
					System.out.println("Enter Year: " ); //enter year to be checked
					year = number.nextDouble();
					if (year % 4 != 0 && year % 400 != 0) { //check if year is not divisible by 4; modulus different from 0 and
						// check if year is not divisible by 400; modulus different from 0
						System.out.println("Luna are 28 de zile");}
					else { //if above IF statements are not true, Feb. has 29 days
						System.out.println("Luna are 29 de zile");
					}
					break;
				default: //Default case. Most months of a year have 31 days.
					System.out.println("Luna are 31 de zile");
					break;}
			// Option to repeat the cycle
			System.out.println("Want to do iy again? Type 1 for YES and 0 for NO");
			repeat = number.nextShort();
		}}}
