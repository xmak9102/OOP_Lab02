package displaydate;

import java.util.Scanner;
public class Display_date {
	static boolean check_valid_month(String month) {
		switch(month) {
			case "1",  "Jan", "Jan.",  "January", "3", "Mar", "Mar.", "March", "5", "May", "7", "Jul", "July", "8", "Aug", "Aug.", "August", "10", "Oct", "Oct.", "October", "12", "Dec", "Dec.", "December", "2",  "Feb", "Feb.",  "February","4",  "Apr", "Apr.",  "April", "6", "Jun", "June", "9", "Sep", "Sept.", "September", "11", "Nov", "Nov.", "November": 
				return true;
		}
		return false;
	}
	
	static boolean check_valid_year(int year) {
		return year > 0;
	}
	
	static int number_of_days(String month, int year) {
		boolean leaf_year = true;
		if ((year%100 == 0 && year%400 != 0) || year%4 != 0) {
			leaf_year = false;
		}
		switch (month) {
			case "1",  "Jan", "Jan.",  "January", "3", "Mar", "Mar.", "March", "5", "May", "7", "Jul", "July", "8", "Aug", "Aug.", "August", "10", "Oct", "Oct.", "October", "12", "Dec", "Dec.", "December":
				return 31;
			case "2",  "Feb", "Feb.",  "February":
				if (left_year) {
					return 29;
				} else {
					return 28;
				}
			case "4",  "Apr", "Apr.",  "April", "6", "Jun", "June", "9", "Sep", "Sept.", "September", "11", "Nov", "Nov.", "November":
				return 30;
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("Enter month:");
		Scanner scanner = new Scanner(System.in);
		String month = scanner.nextLine();
		
		while(!check_valid_month(month)) {
			System.out.println("Invalid month.\n Retry:");
			month = scanner.nextLine();
		}
		
		System.out.println("Enter year:");
		int year = scanner.nextInt();
		while(!check_valid_year(year)) {
			System.out.println("Invalid year.\n Retry:");
			year = scanner.nextInt();
		}
		
		System.out.println("Number of days: " + number_of_days(month, year));
		scanner.close();
	}
}
