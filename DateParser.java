package LabProgram508;

import java.util.Scanner;

public class DateParser {
	public static int getMonthAsInt(String monthString) {
		int monthInt;

		// Java switch/case statement
		switch (monthString) {
		case "January":
			monthInt = 1;
			break;
		case "February":
			monthInt = 2;
			break;
		case "March":
			monthInt = 3;
			break;
		case "April":
			monthInt = 4;
			break;
		case "May":
			monthInt = 5;
			break;
		case "June":
			monthInt = 6;
			break;
		case "July":
			monthInt = 7;
			break;
		case "August":
			monthInt = 8;
			break;
		case "September":
			monthInt = 9;
			break;
		case "October":
			monthInt = 10;
			break;
		case "November":
			monthInt = 11;
			break;
		case "December":
			monthInt = 12;
			break;
		default:
			monthInt = 0;
		}

		return monthInt;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// TODO: Read dates from input, parse the dates to find the ones
		// in the correct format, and output in m-d-yyyy format

		while(true) {
			String date = scnr.nextLine();
			String[] myArray = date.split("[ ]+");
			if (myArray.length - 1 == 2) {
				if (myArray[1].contains(",")) {
					String[] tempDate = myArray[1].split("[,]+");
					System.out.println(getMonthAsInt(myArray[0]) + "-" + tempDate[0] + "-" + myArray[2]);
				}
			}
			else if (myArray[0].equals("-1"))
				break;
		} 
	}
}
