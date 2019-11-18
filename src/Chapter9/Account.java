package Chapter9;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0 / 100;
    private Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getAnnualInterestRate();
    }

    public void withdraw(double balance) {
        this.balance -= balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }
}
