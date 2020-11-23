import java.util.Scanner;

public class Exercise11_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //VARIABLES
        String name;
        double annualInterestRate;
        double balance;
        double amount;
        char transactionType;

        // GET INFO

        System.out.println(" ======== BANK ACCOUNT ======== ");

        System.out.print("Please enter in first name: ");
        name = in.nextLine();

        System.out.print("Please enter in interest rate: ");
        annualInterestRate = in.nextDouble();

        System.out.print("Please enter in balance: ");
        balance = in.nextDouble();

        Account myAccount = new Account(name, 1122, balance);   // create new account with info
        myAccount.setAnnualInterestRate(annualInterestRate);    // set interest rate

        System.out.print("\nDeposit or Withdrawal? (D\\W)");    // choose deposit or withdrawal
        transactionType = in.next().charAt(0);
        in.nextLine();

        transactionType = Character.toUpperCase(transactionType);

        // switch statement (runs while user does not select X for transaction type)

        while (transactionType != 'X') {
            switch (transactionType) {
                case 'D':
                    amount = promptAmount("deposit");
                    myAccount.deposit(amount);
                    break;
                case 'W':
                    amount = promptAmount("withdrawal");
                    myAccount.withdraw(amount);
                    break;
                default:
                    amount = 0;
                    break;
            }

            System.out.print("\nDeposit or Withdrawal? (D\\N)");

            transactionType = in.next().charAt(0);
            transactionType = Character.toUpperCase(transactionType);

        }

        myAccount.accountInfo(); // prints info

    }

    /**
     * promptAmount
     * @param type (of transaction)
     * @return double (amount to withdraw or deposit)
     */
    static double promptAmount(String type) {
        Scanner in = new Scanner(System.in);
        double amount;

        do {
            System.out.print("Please enter in the amount you would like to " + type + ": ");
            amount = in.nextDouble();

            if (amount <= 0) {
                System.out.println("ERROR - Amount cannot be negative");
            }

        } while (amount <= 0);

        return amount;
    }
}
