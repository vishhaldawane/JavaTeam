import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class SortTheArrayListTest {
    public static void main(String[] args) {
        SavingsAccount bankAccountObj1 = new SavingsAccount(141,"Sonam",50000);
        SavingsAccount bankAccountObj2 = new SavingsAccount(112,"Sandeep",60000);
        SavingsAccount bankAccountObj3 = new SavingsAccount(103,"Om",70000);
        SavingsAccount bankAccountObj4 = new SavingsAccount(104,"Sujan",80000);
        SavingsAccount bankAccountObj5 = new SavingsAccount(102,"Samriddha",90000);
        System.out.println("content is ready...");

        ArrayList<SavingsAccount> accountList  = new ArrayList(); //is it like a bag / sag / collection

        System.out.println("container is ready...");

        System.out.println("Adding content in the container...");

        System.out.println("adding 1st account");
        accountList.add(bankAccountObj1); // acno+acname+bal+dateofopening+pin+address+phone+pin+gender+type

        System.out.println("adding 2nd account");
        accountList.add(bankAccountObj2);

        System.out.println("adding 3rd account");
        accountList.add(bankAccountObj3);

        System.out.println("adding 4th account");
        accountList.add(bankAccountObj4);

        System.out.println("adding 5th account");
        accountList.add(bankAccountObj5);

        System.out.println("added content in the container...");

        System.out.println("TRYING to sort the account list...");
        Collections.sort(accountList); //this would work if SavingsAccount is implementing Comparable interface
        System.out.println("account list tis SORTED...");

        System.out.println("accessing the container....");
        Iterator accountIterator = accountList.iterator();
        System.out.println("got the iterator...");

        System.out.println("stepping through the iterator...to access each account..");

        while (accountIterator.hasNext()) {
            SavingsAccount savAccObjRef = (SavingsAccount) accountIterator.next();
            System.out.println("object is  : " + savAccObjRef);
        }



    }

}
