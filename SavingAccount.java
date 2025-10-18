public class SavingAccount implements IAccount {

    String holderName;
    int accno;
    double balance;
    double minBalance = 5000;
    double interestRate;

    public SavingAccount(String holderName, int accno, double balance, double minBalance, double interestRate) {
        this.holderName = holderName;
        this.accno = accno;
        this.balance = balance;
        this.minBalance = minBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        this.balance = this.balance + minBalance + amount;
        System.out.println("Your new balance is " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance < 5000) {
            System.out.println("cannot withdraw . Min balance should be 5000");
        } else {
            this.balance = this.balance + minBalance - amount;
            System.out.println("Your new balance is after withdrawal is  " + balance);
        }
    }

    @Override
    public void Balance() {
        System.out.println("Your Current Balance is " + balance);
    }

    @Override
    public String toString() {
        return "SavingAccount [holderName=" + holderName + ", accno=" + accno + ", balance=" + balance + "]";
    }

}