import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double WidthdrawAmount;

        IAccount t1 = new CurrentAccount("Harsh", 1, 110000, 7);

        WidthdrawAmount = sc.nextDouble();

        t1.withdraw(WidthdrawAmount);
        t1.Balance();
        System.out.println(t1.toString());

        sc.close();
    }
}