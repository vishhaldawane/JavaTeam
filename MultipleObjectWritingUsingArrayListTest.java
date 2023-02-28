import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MultipleObjectWritingUsingArrayListTest {
    public static void main(String[] args) {

        SavingsAccount savingsAccountObj1 = new SavingsAccount(101,"Jack",10000);
        SavingsAccount savingsAccountObj2 = new SavingsAccount(102,"Jane",20000);
        SavingsAccount savingsAccountObj3 = new SavingsAccount(103,"Julie",30000);

        ArrayList<SavingsAccount> myAccountsList = new ArrayList();
        System.out.println("Array list is ready.....");

        myAccountsList.add(savingsAccountObj1);
        myAccountsList.add(savingsAccountObj2);
        myAccountsList.add(savingsAccountObj3);
        System.out.println("array list is added with 3 savings account objects....");


        System.out.println("Savings Account Objects ARE created...");

        try {
            FileOutputStream fout = new FileOutputStream("bank.many.data");
            System.out.println("File is ready for writing....");

            ObjectOutputStream oos = new ObjectOutputStream(fout); //passing fout here
            System.out.println("Object output stream is ready...");

            System.out.println("Trying to write (serialize) ARRAYLIST object....in the file");
              oos.writeObject(myAccountsList); //add the arraylist, which has 3 objects in it
            System.out.println("Serialization is successful....");

            oos.close();
            System.out.println("object stream is closed..");

            fout.close();
            System.out.println("file is closed...");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
