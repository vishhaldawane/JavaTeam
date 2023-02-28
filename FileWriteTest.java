import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTest {
    public static void main(String[] args) {

        try {
            System.out.println("trying to open a file in WRITE mode...");
            FileOutputStream fout = new FileOutputStream("fun.txt",true); //if the file is already present, it would overwrite it, that's risky
                                // so use true to prevent this over-write
            System.out.println("file is ready in WRITE mode");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter data  : ");
            String stringData= scanner.nextLine();

            System.out.println("string is converted into byte array");
            byte dataInArrayFormat[] = stringData.getBytes(); //convert string into byte array

            fout.write(dataInArrayFormat);
            System.out.println("DATA is written to the file.....congrats...");

            fout.close();
            System.out.println("file is closed...");

        } catch (FileNotFoundException e) {
            System.out.println("handler1 : "+e);
        } catch (IOException e) {
            System.out.println("handler2 : "+e);

        }


    }
}
