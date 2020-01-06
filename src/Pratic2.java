import java.util.Scanner;


public class Pratic2 {
	
	
	
	public static int getDayNumber(int d, int m, int y) {
		int year, month, day, x;
		year = y - (14 - m) / 12;
		x = year + year / 4 - year / 100 + year / 400;
		month = m + 12 * ((14 - m) / 12) - 2;
		day = (d + x + 31 * month / 12) % 7;

		return day;
	}

	// To check Year is Leaf or Not
	public static boolean isLeaf(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}

		} else {
			return false;
		}

	}

	// To get Corresponding month
	public static String[] getMonthData(int month, int year) {
		String nonleaf[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" };
		// if nonleaf 28 dates of month

		String leaf[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29" };
		// if leaf year 29 dates of month

		String month_30[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };

		String month_31[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return month_31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return month_30;
		} else {

			if ((month == 2) && isLeaf(year)) {
				return leaf;
			} else {
				return nonleaf;
			}
		}
	}

	// Static class Queue with LinkedList for Calender
	public static int[] getPrimeData(int limit) {
		int i, j, count, k = 0;
		int prime[] = new int[limit];
		for (i = 1; i <= limit; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					count++;
				}
			}

			if (count == 2) {
				prime[k] = i;
				k++;
			}

		}
		int a[] = new int[k];
		for (i = 0; i < a.length; i++) {
			if (prime[i] != 0) {
				a[i] = prime[i];
			}
		}
		return a;
	}
	public static int inputNumber() {
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public static void main(String[] args) {
		Week w = new Week();
		Weekday wd;
		int date = 1, month, year,weekNo, i, j;
		String days[] = { "SUN", "MON", "TUES", "WENS", "THUS", "FRI", "SAT" };
		System.out.println("Enter the Month :");
		month = inputNumber();
		
		System.out.println("Enter the Year :");
		year = inputNumber();

		System.out.println("Enter the Week number 1 to 5 :");
		weekNo = inputNumber();

		
		// pass the month , year and by default date =1
		int dayNo = getDayNumber(date, month, year);

		// get Month data
		String monthData[] = getMonthData(month, year);

		System.out.println("\n\n\t\t\t Calendar : " + month + "-" + year);
		System.out.println("\t-----------------------------------------------------");
		for (i = 0; i < days.length; i++) {
			System.out.print("\t" + days[i]);	// Day are Addes in the Queue
		}
		System.out.println("\n\t-----------------------------------------------------");

		j = 0;
		for (i = 0; i < (monthData.length + dayNo); i++) {
			if (i < dayNo) {
				wd = new Weekday(" ", " "); // Weeday value Store into Objct / Wrapping
				w.ql.add(wd); // Pass the Object into Queue
			} else if (j < (monthData.length)) {
				wd = new Weekday(" ", monthData[j]); // Weeday value Store into Objct / Wrapping
				w.ql.add(wd); // Pass the Object into Queue
				j++;
			}

		}

		// Pop the object from Queue and
		for (i = 1; i <= 5; i++) {
			for (j = 0; j < 7; j++) {
				wd = w.ql.remove();
				if (wd != null&&i==weekNo) {
					System.out.print("\t" + wd.date);
				}
			}
			System.out.println();
		}
	}
}
