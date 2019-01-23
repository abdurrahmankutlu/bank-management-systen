package user;

import account.AccountType;
import account.BasicAccount;

public class SuperUser extends BaseUser {


    public SuperUser(String firstName, String lastName, UserType userType) {
        super(firstName, lastName, userType);
    }

    public boolean checkoutMoney(AccountType accountType, double amount) {
        BasicAccount account = getAccount(accountType);
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }

    public void depositMoney(AccountType accountType, double amount) {
        BasicAccount account = getAccount(accountType);
        account.setBalance(account.getBalance() + amount);
    }
}
