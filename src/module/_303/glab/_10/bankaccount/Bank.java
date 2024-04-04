package module._303.glab._10.bankaccount;

import java.util.ArrayList;
import java.util.List;

public class Bank<T extends BankAccount> {


    private List<T> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(T account) {
        accounts.add(account);
    }

    public T getAccount(int index) {
        return accounts.get(index);
    }

    public List<T> getAccounts() {
        return accounts;
    }

    public void removeAccount(T account) {
        accounts.remove(account);
    }

    public void removeAccount(int index) {
        accounts.remove(index);
    }


    public double getTotalBalance() {
        double total = 0;
        for (T account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}
