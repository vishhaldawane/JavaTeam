import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadTest {
    public static void main(String[] args) {

        //1st step to open the file in READ mode
        try {
            System.out.println("trying to open a file in read mode");
            FileInputStream fin = new FileInputStream("/Users/apple/king.txt");
        //   FileInputStream fin = new FileInputStream("ImHere.txt");
         //   FileInputStream fin = new FileInputStream("Nepal.txt");

            System.out.println("file is open now...lets see its content...");

            //H
            byte b =(byte) fin.read(); //lets read the first letter, it is read as int

            while(b!=-1) { //-1 means if the end of file (EOF) reached or not
                System.out.print((char)b); //print that letter
                b =(byte) fin.read(); //read second letter onwards...
               // Thread.sleep(3);
            }
            System.out.println("=========");

            System.out.println("trying to close the file...");
            fin.close();
            System.out.println("file is closed...");

        }
        catch(FileNotFoundException e) {
            System.out.println("handler1 : "+e);
        } catch (IOException e) {
            System.out.println("handler2 : "+e);
          //  e.printStackTrace(); //prints the complete cause
        } /*catch (InterruptedException e) {
            System.out.println("handler3 : "+e);
        }*/

    }

}

