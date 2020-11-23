import java.util.Date;

class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    // CONSTRUCTOR

    public Transaction(char type, double amount, double balance, String description)
    {
        this.date        = new Date();
        this.type        = type;
        this.amount      = amount;
        this.balance     = balance;
        this.description = description;
    }


    // GETTERS

    public void setType(char type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // GETTERS

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    // PRINT INFO
    /**
     * toString (overriden function)
     * @return String (new output string)
     */
    @Override
    public String toString(){
        return("\nType of transaction: " + this.type + "\nAmount: " + this.amount + "\nBalance: " + this.balance + 
                "\nDescription: " + this.description + "\nDate: " + this.date);

    }


}