public class BankAcountTest2 {
    public static void main(String[] args) {

        //data + functions
        Account accountObj1 = new Account(); //all the three variables are inside this
        accountObj1.printAccount();
      //  accountObj1.setAccount(123,"Sandeep Thapa",5000);
        accountObj1.printAccount();

        accountObj1.deposit(4000);
        float newBalance = accountObj1.getBalance();
        System.out.println("Now the new balance is : "+newBalance);

        accountObj1.deposit(3000);
        float newBalance2 = accountObj1.getBalance();
        System.out.println("Now the new balance is : "+newBalance2);

        accountObj1.withdraw(1500);
        float newBalance3 = accountObj1.getBalance();
        System.out.println("Now the new balance is : "+newBalance3);

        //data + functions
        /*Account accountObj2 = new Account();

        //data + functions
        Account accountObj3 = new Account();

        accountObj1.setAccount(123,"Sandeep Thapa",5000);
        accountObj2.setAccount(453,"Ashok Magar",5500);
        accountObj3.setAccount(556,"Sushmita Dhital", 6500);

        accountObj1.printAccount();
        accountObj2.printAccount();
        accountObj3.printAccount();
        */
    }
}
//prevention is better than cure
class Account // class is a design  of your objects
{
    //below three lines are inside "a class"
    //THEY ARE KNOWN AS fields of the class
    //and they are available to all the methods of the class

    private int accountNumber; //this line is not inside any function
    private String accountHolderName; //this line is not inside any function
    private float accountBalance; // this line is not inside any function

    //below function is designed to receive three values and
    // set these values to the fields of this class

    //no return        with arguments
    void setAccount(int x, String y, float z) {
        System.out.println("setAccount(int,String,float) is called....");
        accountNumber = x; // assign the local value of x to the field accountNumber
        accountHolderName = y; //same here
        accountBalance = z; //same here
    }
    //no return     no argument
    void printAccount() { //does this function know what values are there? NO
        System.out.println("my account number  : " + accountNumber);//print the field
        System.out.println("my account holder  : " + accountHolderName);//print the field
        System.out.println("my account balance : " + accountBalance);//print the field
        System.out.println("-------------------------");
    }
    void withdraw(float amountToWithdraw)
    {
        System.out.println("withdrawing amount....."+amountToWithdraw);
        if(amountToWithdraw > accountBalance) {
            System.out.println("Insufficient balance...cannot withdraw");
        }
        else {
            System.out.println("withdrawn...."+amountToWithdraw);
            accountBalance = accountBalance - amountToWithdraw;
        }
    }
    void deposit(float amountToDeposit)
    {
        System.out.println("depositing amount....");
        accountBalance = accountBalance + amountToDeposit;
    }
    //with return   no argument
    float getBalance()
    {
        System.out.println("returning the account balance....");
        return accountBalance;
    }

// IT industry

    //devops

    // development -->   testing --> deploying --> Use
    //   coder           tester      deployers     End User

    //MNC
    //body     + mind + intellect + soul + super soul
    // |          |        |        |       |
    //physical  <----------non-physical--------------->
    //10%                   90%
    //              |     |         |
    //          icchha    gyan      atma    param atma
    //          shakti    shakti    shakti  shakti

    // dancer - dancing - dance

    // coder  - coding - code

    // painter - painting - paint












// a dancer is lost, to create a dance

    // to increase the typing speed
    // typing tutor - download it  and practice 10 minutes everyday
    //1999 - i went to typing institute - manual typewriter
    //45

    // by stopping the thoughts
    // thousands of thoughts coming everyday
    // in the mind, 70,000 each day..

    // there are two Is

    // YourSelf --- you loose it...

    // Power OF NOW

    // 7 to 8 times ...
    // i found one secret in that book

    // i applied it..

    // how to stop the thoughts.....

    // YOU HAVE TO OBSERVE YOUR THOUGHTS SOURCE

    // FROM WHERE THESE THOUGHTS ARE COMING ????


    // in 2006 it was
    // super blessing

    //practicing Power of NOW





}







