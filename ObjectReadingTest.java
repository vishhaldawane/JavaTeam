import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadingTest {
    public static void main(String[] args) {

        try {
            FileInputStream fin  = new FileInputStream("bank.data");
            System.out.println("file is ready for reading...");

            ObjectInputStream ois = new ObjectInputStream(fin);
            System.out.println("object input stream is ready to read objects....");

            System.out.println("trying to read the object...from the stream....");
            SavingsAccount savingsAccount = (SavingsAccount) ois.readObject();
            System.out.println("got the savings account....");

            System.out.println("savings account : "+savingsAccount);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
