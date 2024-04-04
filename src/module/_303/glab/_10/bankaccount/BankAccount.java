package module._303.glab._10.bankaccount;

public abstract class BankAccount implements AccountStatus {

    private double balance;
    private int accountNumber;


    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public void displayAccountInfo() {
        System.out.println("Account number " + accountNumber + "Balace" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void checkStatus() {
        if (balance < 0) {
            System.out.println(STR."Account is overdrawn. Balance: \{balance}");
        } else if (balance == 0) {
            System.out.println(STR."Account is empty. Balance: \{balance}");
        } else {
            System.out.println(STR."Account is in good standing. Balance: \{balance}");
        }
    }
}
