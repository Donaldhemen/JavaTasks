public class Account {
    private double balance;
    private final int pin;

    public Account(int pin) {

        balance = 0;
        this.pin = pin;
    }
    public double checkBalance(int pin) {
        if(this.pin == pin) {
            return balance;
        }
        return -1;
    }

    public void deposit(double amount) {

        if(amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount, int pin) {
        if(this.pin == pin && amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
