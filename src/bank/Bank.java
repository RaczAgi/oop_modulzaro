package bank;

import java.util.HashSet;
import java.util.Set;

public class Bank {

    Set<BankAccount> accounts = new HashSet<>();


    public void addAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }


    public String getAccountNumber(String accountName) throws NoAccountNumberException {
        for (BankAccount bankAccount : accounts) {
            if (accountName.equals(bankAccount.getAccountName())) {
                return bankAccount.getAccountNumber();
            }
        }
        throw new NoAccountNumberException("Nincs ilyen bankszámlaszám");
    }

    public String getAccountName(String accountNumber) throws NoAccountNameException {
        for (BankAccount bankAccount : accounts) {
            if (accountNumber.equals(bankAccount.getAccountNumber())) {
                return bankAccount.getAccountName();
            }

        }
        throw new NoAccountNameException("Nincs ilyen számlatulajdonos");
    }

    public int getBalance(String accountName) throws NoMoneyException {
        for (BankAccount bankAccount : accounts) {

            if (accountName.equals(bankAccount.getAccountName())) {
                return bankAccount.getBalance();
            }
        }
        throw new NoMoneyException("Nincs pénz");
    }

    public void transfer(int sum, String accountNumberFrom, String accountNumberTo) throws NoEnoughMoneyException, NoAccountNumberException {
        for (BankAccount bankAccount : accounts) {
            if (accountNumberFrom.equals(bankAccount.getAccountNumber())) {

                for (BankAccount bankAccount1 : accounts) {
                    if (accountNumberTo.equals(bankAccount1.getAccountName())) {
                        if ((bankAccount.getBalance() - sum) > 0) {
                            bankAccount.setBalance(bankAccount.getBalance() - sum);

                            bankAccount1.setBalance(bankAccount1.getBalance() + sum);
                        }
                    }
                    throw new NoAccountNumberException("Nincs ilyen számla");
                }

            }
            throw new NoEnoughMoneyException("Nincs elég pénzed");
        }
    }

}
