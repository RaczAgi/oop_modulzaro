package bank;

import java.util.HashSet;
import java.util.Set;

public class BankAccount {
    private String accountName;
    private int balance;
    private final String accountNumber;


    public BankAccount(String accountName, int balance, String accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int deposit(int deposit) {
        return getBalance() + deposit;
    }

    public int withraw(int withraw) throws NoEnoughMoneyException {
        if ((getBalance() - withraw) > 0) {
            return getBalance() - withraw;
        }
        throw new NoEnoughMoneyException("Nincs elég pénzed");
    }

    public static boolean isValidAccountNumber(String accountNumber) throws NoValidAccountNumberException {
        int sum = 0;
        for (int i = 0; i < accountNumber.length(); i++) {
            sum += Integer.parseInt(String.valueOf(accountNumber.charAt(i)));
            if (sum > 20) {
                return true;
            }
        } throw new NoValidAccountNumberException("Ez a számlaszám nem érvényes");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
