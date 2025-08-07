package banking;

public class bankingclass {

    private int accNo;
    private int pin;
    private float balance;

    public bankingclass() {
        this.accNo = 0;
        this.pin = 0;
        this.balance = 0.0f;
    }

    public bankingclass(float balance) {
        this.accNo = 0;
        this.pin = 0;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAccNo() {
        return accNo;
    }

    public boolean verifyAccount(int accn, int pn) {
        return (this.accNo == accn && this.pin == pn);
    }

    public void deposit(float amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount deposited successfully. New balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(float amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + this.balance);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }
}
