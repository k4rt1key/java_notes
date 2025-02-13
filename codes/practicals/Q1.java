package codes.practicals;

public class Q1 {
    public static void main(String[] args) {
        Bank hdfc = new Bank("HDFC", "HDFC001", "Ganghinagar_Branch");
        BankAccount savingAccount1 = new BankAccount("001", "Kartikey", 5000, hdfc);
        savingAccount1.toString();      
        savingAccount1.withdraw(6000);
    }
}


class Bank {

    Bank(){}
    Bank(String bankName, String ifscCode, String branchName){
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
    }

    String bankName;
    String ifscCode;
    String branchName;
}

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    Bank bank;

    BankAccount(){}
    BankAccount(String accountNumber, String accountHolderName, double balance, Bank bank){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.bank = bank;
    }

    void deposite(double amount){
        this.balance += amount;
        System.out.println(amount + " RS CREDITED, CURR BALANCE IS " + balance);
    }
    
    void withdraw(double amount){
        if(this.balance < amount ){
            throw new InsufficientFundsException(this.balance);
        }
        this.balance -= amount;
        System.out.println(amount + " RS DEBITED, CURR BALANCE IS " + balance );
    }
    double getBalance(){
        System.out.println("CURR BALANCE IS " + balance);
        return balance;
    }
    String getBranchName(){
        System.out.println("YOUR BRANCH NAME IS " + this.bank.branchName);
        return this.bank.bankName;
    }

    public String toString(){
        String s = this.accountHolderName + "<>" + this.accountNumber + "<> BALANCE : " + this.balance + "<>" + this.bank.bankName;
        System.out.println(s);
        return s;
    }
}


class InsufficientFundsException extends RuntimeException {
    InsufficientFundsException(double amount){
        super("Insufficient Funds!! You have only : " + amount);
    }
}
