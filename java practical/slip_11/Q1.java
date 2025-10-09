// MyDate class
class MyDate {
    int dd, mm, yy;

    // Parameterized constructor
    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;   // 'this' refers to current object
        this.mm = mm;
        this.yy = yy;
    }

    // Display method
    public void display() {
        System.out.printf("Date: %02d-%02d-%02d%n", this.dd, this.mm, this.yy);
    }
}

// Main class
public class Q1 {
    public static void main(String[] args) {
        // Create MyDate object using parameterized constructor
        MyDate date = new MyDate(9, 10, 25);  // Example date: 09-10-25

        // Display the date
        date.display();
    }
}
