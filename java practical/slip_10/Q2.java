import java.util.Scanner;

// User-defined exception
class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

// SavingAccount class
class SavingAccount {
    int acNo;
    String name;
    double balance;
    final double MIN_BALANCE = 500;

    // Constructor
    public SavingAccount(int acNo, String name, double balance) {
        this.acNo = acNo;
        this.name = name;
        if (balance < MIN_BALANCE) {
            this.balance = MIN_BALANCE;
        } else {
            this.balance = balance;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundException {
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundException("Withdrawal failed! Balance cannot go below minimum of " + MIN_BALANCE);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // View balance
    public void viewBalance() {
        System.out.println("Account No: " + acNo + ", Name: " + name + ", Balance: " + balance);
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account
        System.out.print("Enter account number: ");
        int acNo = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        SavingAccount account = new SavingAccount(acNo, name, balance);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. View Balance\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (InsufficientFundException e) {
                        System.out.println("Exception: " + e.getMessage());
                    }
                    break;
                case 3:
                    account.viewBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
