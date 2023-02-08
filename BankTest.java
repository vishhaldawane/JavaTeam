public class BankTest {
    public static void main(String[] args) {
        System.out.println("begin main");
        BankAccount bankAccountObj1 = new BankAccount(1012,"Sandeep",50000);
        BankAccount bankAccountObj2 = new BankAccount(8282,"Ashok",60000);
        BankAccount bankAccountObj3 = new BankAccount(7567,"Sandesh",80000);

        bankAccountObj1.printBankAccount();
        bankAccountObj2.printBankAccount();
        bankAccountObj3.printBankAccount();

        bankAccountObj1.withdraw(600);
        bankAccountObj2.deposit(700);
        bankAccountObj3.withdraw(500);

        bankAccountObj1.printBankAccount();
        bankAccountObj2.printBankAccount();
        bankAccountObj3.printBankAccount();


        System.out.println("end main..");
    }
}
class BankAccount
{
    //FIELDS/DATA MEMBER
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;
                          //LOCAL VARIABLES

    // a constructor function has the same name "as of the class"
    // it does not have return type
    // it can take arguments (if it want)
    // what is the use of this function?, lets see


    BankAccount(int accountNumber, String accountHolder, double accountBalance) {
        System.out.println("Constructor is setting the initial details...");
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    void printBankAccount() {
        System.out.println("Account Number  : "+accountNumber);
        System.out.println("Account Holder  : "+accountHolder);
        System.out.println("Account balance : "+accountBalance);
        System.out.println("----------------------------");
    }
    void withdraw(double amountToWithdraw) {
        System.out.println("withdrawing...."+amountToWithdraw);
        accountBalance = accountBalance - amountToWithdraw;
    }
    void deposit(double amountToDeposit) {
        System.out.println("depositing...."+amountToDeposit);
        accountBalance = accountBalance + amountToDeposit;
    }

}
