public class CurrentAccount implements IAccount {
    String holderName;
    int accno;
    double balance;
    double overDraftLimit;

    public CurrentAccount(String holderName, int accno, double balance, double overDraftLimit) {
        this.holderName = holderName;
        this.accno = accno;
        this.balance = balance;
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void deposit(double amount) {
        this.balance = balance + amount;
        System.out.println("Your new Balance is : " + balance);
    }

    @Override
    public void withdraw(double amount) {

        if (balance == 0) {
            System.out.println("Balance camnnot be less than 0 ");
        } else {
            this.balance = balance - amount;
            System.out.println("Your new balance is : " + balance);
        }
    }

    @Override
    public void Balance() {
        System.out.println("Your current balance is : " + balance);
    }

    @Override
    public String toString() {
        return "CurrentAccount [holderName=" + holderName + ", accno=" + accno + ", balance=" + balance + "]";
    }

}