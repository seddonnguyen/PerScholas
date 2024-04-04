package module._303.glab._10.bankaccount;

public class CreditCard extends BankAccount {

    private String ccNumber;


    public CreditCard(int accountNumber, double balance, String ccNumber) {
        super(accountNumber, balance);
        this.ccNumber = ccNumber;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    @Override
    public void withdraw(double amount) {
        double balance = super.getBalance();
        if (amount > 0 && balance  >= amount){
            balance -= amount;
            super.setBalance(balance);
            System.out.println("Withdrawl succesful: current balance = " + balance);
        }else{
            System.out.println("Withdraw failed: not enough funds");
        }
    }


    public static String tierCheck(String creditCardNumber){
        String strippedCCNumber = creditCardNumber.replaceAll("[^\\d]","");
        long ccNumberLong = Long.parseLong(strippedCCNumber);
        int sum = 0;
        while(ccNumberLong > 0){
            long lastDigit = ccNumberLong % 10;
            sum += lastDigit;
            ccNumberLong = ccNumberLong / 10;
        }
        if(sum >= 80){
            return "Platinum";
        }else if(sum >= 60){
            return "Gold";
        }else if(sum >= 40){
            return "Silver";
        }else {
            return "Bronze";
        }
    }

    @Override
    public void checkStatus() {
        System.out.println(STR."Credit Carc Account number: \{super.getAccountNumber()}");
        System.out.println(STR."Credit Card Tier: \{this.tierCheck(this.ccNumber)}");
        System.out.println(STR."Credit Card Number: \{this.ccNumber}");
        super.checkStatus();
    }
}
