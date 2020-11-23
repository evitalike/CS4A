import java.util.ArrayList;
import java.util.Date;

class Account {
    // VARIABLES

    private String name;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private static ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    // CONSTRUCTORS

    Account(){
        dateCreated  = new Date();
        transactions = new ArrayList<>();
    }


    Account(String name, int ident, double initBalance){
        this();
        this.name = name;
        this.id = ident;
        this.balance = initBalance;
    }

    

    // SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //GETTERS

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return getAnnualInterestRate()/12;
    }

    // WITHDRAW

    /**
     * withdraw
     * @param amount (money to withdraw)
     */
    public void withdraw(double amount){
        String description = "User withdraws $" + amount;
        this.balance -= amount;

        Transaction transaction = new Transaction('W', amount, this.balance, description); // new transaction

        System.out.println(description);
        System.out.println("The current balance is " + this.balance);

        transactions.add(transaction);

    }

    // DEPOSIT

    /**
     * deposit 
     * @param amount (money to deposit)
     */
    public void deposit(double amount){
        String description = "User deposits $" + amount;
        this.balance += amount;

        Transaction transaction = new Transaction('D', amount, balance, description);

        System.out.println(description);
        System.out.println("The current balance is " + this.balance);

        transactions.add(transaction);
    }

    // PRINT ACCOUNT INFO 

    public void accountInfo(){
        System.out.println("---------------------");
        System.out.println("Account Information");
        System.out.println("Name: " + this.name);
        System.out.println("Date Created: " + this.dateCreated);
        System.out.println("Interest Rate: " + this.annualInterestRate);
        System.out.println("Balance: " + this.balance);

        System.out.println("\nTransaction History: ");

        for(Transaction t: transactions){
            System.out.println(t);
        }
        
    }


}