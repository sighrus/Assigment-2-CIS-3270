package Chapter9;

public class AccountClient {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        System.out.println("Annual Interest Rate is: " + account.getAnnualInterestRate());

        account.withdraw(2500);
        System.out.println("Account balance, monthly interest, and date after withdraw respectively is: " + account.getBalance() + ", " + account.getMonthlyInterest() + ", " + account.getDateCreated());

        account.deposit(3000);
        System.out.println("Account balance, monthly interest, and date after deposit respectively is: " + account.getBalance() + ", " + account.getMonthlyInterest() + ", " + account.getDateCreated());
    }
}
