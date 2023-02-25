import java.util.*;

public class ArrayListOfAccountsTest {
    public static void main(String[] args) {

        SavingsAccount bankAccountObj1 = new SavingsAccount(141,"Sonam",50000);
        SavingsAccount bankAccountObj2 = new SavingsAccount(112,"Sandeep",60000);
        SavingsAccount bankAccountObj3 = new SavingsAccount(103,"Om",70000);
        SavingsAccount bankAccountObj4 = new SavingsAccount(104,"Sujan",80000);
        SavingsAccount bankAccountObj5 = new SavingsAccount(102,"Samriddha",90000);
        System.out.println("content is ready...");

        //ArrayList<SavingsAccount> accountList  = new ArrayList(); //is it like a bag / sag / collection
       // LinkedList<SavingsAccount> accountList  = new LinkedList(); //is it like a bag / sag / collection
       // HashSet<SavingsAccount> accountList  = new HashSet(); //is it like a bag / sag / collection

        TreeSet<SavingsAccount> accountList  = new TreeSet(); //is it like a bag / sag / collection

        System.out.println("container is ready...");

        System.out.println("Adding content in the container...");

        System.out.println("adding 1st account");
        accountList.add(bankAccountObj1); // acno+acname+bal+dateofopening+pin+address+phone+pin+gender+type

        System.out.println("adding 2nd account");
        accountList.add(bankAccountObj2);

   //     accountList.add(90);
        System.out.println("adding 3rd account");
        accountList.add(bankAccountObj3);

        System.out.println("adding 4th account");
        accountList.add(bankAccountObj4);

       // accountList.add("Silly string...");

        System.out.println("adding 5th account");
        accountList.add(bankAccountObj5);

    //    accountList.add(45.5f);
        System.out.println("added content in the container...");

        System.out.println("accessing the container....");
        Iterator accountIterator = accountList.iterator();
        System.out.println("got the iterator...");

        System.out.println("stepping through the iterator...to access each account..");
        try {
            while (accountIterator.hasNext()) {
                SavingsAccount savAccObjRef = (SavingsAccount) accountIterator.next();
                System.out.println("object is  : " + savAccObjRef);
            }
        }
        catch (ClassCastException e) {
            System.out.println("cannot convert..something..."+e);
        }


    }
}
//bankAccountObj1, bankAccountObj2, bankAccountObj3, bankAccountObj4, bankAccountObj5
//          50                60              70              80          90

/*


                        70
                        |
                   ------------
                   |          |
                   L          R 60
                                 |
                             ---------
                                     |
                                    70
                                     |
                                --------------
                                            |
                                            80
                                            |
                                         ---------
                                                |
                                                90



 */
//bankAccountObj1.compareTo(bankAccountObj3)

class SavingsAccount implements Comparable<SavingsAccount>
{
    private int accountNumber;
    private String accountHolder;
    private double accountBalance; //we will take this as our ROOT value

    @Override
    public int compareTo(SavingsAccount o) { //each bankAccountObj2,3,4,5 are passed during each call of add method
        //return accountHolder.compareTo(o.accountHolder);
        //   return Integer.compare(accountNumber,o.accountNumber);
        System.out.println("-> comparing "+accountBalance+" with "+o.accountBalance);
          return Double.compare(accountBalance, o.accountBalance);
    }


    public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
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