import java.io.Serializable;

public class SavingsAccount implements Serializable {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
        System.out.println("SavingsAccount(int,String,double) 3 arg...ctor...");

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public SavingsAccount() {
        System.out.println("SavingsAccount() no arg...ctor...");
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
