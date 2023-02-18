public class CustomExceptionTest {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(101,"Sandeep Thapa",100000.0);

        System.out.println("my account details : "+savingsAccount.getAccountBalance());

        try {
            savingsAccount.withdraw(4500);
        }
        catch(NegativeAmountException  x) {
            System.out.println("handler 1==> problem : "+x.getMessage());
            System.out.println("Please enter positive value...");
          //  System.out.println("==>Some problem occurred during withdraw..."+alian.getMessage());
       }

        catch(InsufficientBalanceException  x) {
            System.out.println("handler 2==>problem : "+x);
            System.out.println("Please enter value lesser than your balance...");
            //  System.out.println("==>Some problem occurred during withdraw..."+alian.getMessage());
        }
        catch(UnableToDispenseException x) {
            System.out.println("handler 3==>bank's problem : "+x);
            System.out.println("Sorry for this inconvenience caused....");
        }
        catch(RuntimeException e) {
            System.out.println("handler 4 for any unknown exception ....."+e);
        }

        System.out.println("my account details : "+savingsAccount.getAccountBalance());

    }
}

//every class in java has a parent !!!! who is that parent class??? Object

class SavingsAccount // who is the parent of this class???? Object [11 functions]
{
    int accountNumber;
    String accountHolderName;
    double accountBalance;

    public SavingsAccount(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }


    public String toString() { //recoding/redefining that toString()
        return "SavingsAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    void withdraw(double amountToWithdraw) {
        System.out.println("==> START of WITHDRAW");
        System.out.println("Trying to withdraw...."+amountToWithdraw);
        int withdrawHoursDenied=12; //this time is not allowed to withdraw

        if(withdrawHoursDenied < 18) {
            AnyException a = new AnyException();
            throw a;
        }
        else if(amountToWithdraw > 5000) { //assuming total cash in ATM now is 5000
            UnableToDispenseException rte = new UnableToDispenseException("ATM is out of cash...please visit nearest ATM");
            throw rte;
        }
        else if(amountToWithdraw < 0 ) { //means it is negative value
           // RuntimeException rte = new RuntimeException("Amount to withdraw cannot be in negative..."); //
            NegativeAmountException rte = new NegativeAmountException("Amount to withdraw cannot be in negative...");
            throw rte;
        }
        else if (amountToWithdraw > accountBalance) {
           // System.out.println("There is insufficient balance in your account, cannot withdraw....");
           // RuntimeException rte = new RuntimeException("There is insufficient balance in your account, cannot withdraw....");
             InsufficientBalanceException rte   = new InsufficientBalanceException("There is insufficient balance in your account, cannot withdraw....");
             throw rte; //throw means stop this function from here, and wait for someone to catch this object
        }
        else {
            accountBalance = accountBalance - amountToWithdraw;
            System.out.println("Withdraw is successful.....");
        }
        System.out.println("==> End of WITHDRAW");
    }

    /*
    void withdraw(double amountToWithdraw) {
        System.out.println("==> START of WITHDRAW");

        System.out.println("Trying to withdraw...."+amountToWithdraw);
        if (amountToWithdraw > accountBalance) {
            System.out.println("There is insufficient balance in your account, cannot withdraw....");
        }
        else {
            accountBalance = accountBalance - amountToWithdraw;
            System.out.println("Withdraw is successful.....");
        }
        System.out.println("==> End of WITHDRAW");
       }

     */

    public double getAccountBalance() { //remember??? function without argument, but with return
        return accountBalance;
    }
}

class InsufficientBalanceException extends RuntimeException
{
    InsufficientBalanceException(String anyRef) {
        super(anyRef);
    }
}
class NegativeAmountException extends RuntimeException
{
    NegativeAmountException(String x) {
        super(x);
    }
}

// Ask And It is GIVEN

class UnableToDispenseException extends RuntimeException
{
    UnableToDispenseException(String x) {
        super(x);
    }
}

class AnyException extends  RuntimeException
{

}
//do we know....4th one 5th... 6th..