import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MultipleObjectReadingTest {
    public static void main(String[] args) {

        try {
            FileInputStream fin  = new FileInputStream("bank.many.data");
            System.out.println("file is ready for reading...");

            ObjectInputStream ois = new ObjectInputStream(fin);
            System.out.println("object input stream is ready to read objects....");

            System.out.println("trying to read the object...from the stream....");
            SavingsAccount savingsAccount1 = (SavingsAccount) ois.readObject();
            SavingsAccount savingsAccount2 = (SavingsAccount) ois.readObject();
            SavingsAccount savingsAccount3 = (SavingsAccount) ois.readObject();

            System.out.println("got the savings account....");

            System.out.println("savings account1 : "+savingsAccount1);
            System.out.println("savings account2 : "+savingsAccount2);
            System.out.println("savings account3 : "+savingsAccount3);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
