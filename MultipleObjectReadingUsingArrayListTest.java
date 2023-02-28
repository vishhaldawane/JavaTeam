import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class MultipleObjectReadingUsingArrayListTest {
    public static void main(String[] args) {

        try {
            FileInputStream fin  = new FileInputStream("bank.many.data");
            System.out.println("file is ready for reading...");

            ObjectInputStream ois = new ObjectInputStream(fin);
            System.out.println("object input stream is ready to read objects....");

            System.out.println("trying to read the ARRAYLIST...from the stream....");
            ArrayList<SavingsAccount> myList = (ArrayList<SavingsAccount>) ois.readObject();

            Iterator<SavingsAccount> iterator = myList.iterator();
            while(iterator.hasNext()) {
                SavingsAccount x = iterator.next();
                System.out.println("savings account is : "+x);
            }
            System.out.println("got the savings account....");

            ois.close();
            fin.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
