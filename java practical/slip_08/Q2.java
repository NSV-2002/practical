import java.util.Scanner;

// User-defined exception
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

// MyDate class
class MyDate {
    int day, month, year;

    // Constructor
    public MyDate(int day, int month, int year) throws InvalidDateException {
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to display date
    public void display() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    // Method to check if date is valid
    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1) {
            return false;
        }

        // Days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year in February
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return day <= daysInMonth[month - 1];
    }

    // Method to check leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        try {
            MyDate date = new MyDate(day, month, year);
            date.display();
        } catch (InvalidDateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
