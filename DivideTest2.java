import java.util.InputMismatchException;
import java.util.Scanner;

//java.lang's content is by default available to any program

public class DivideTest2 {
    public static void main(String[] args) {

        System.out.println("Begin of main");
        System.out.println("Starting  division");

        try {
            int numerator=0;
            int denominator=0;
            int division=0;

            Scanner scan1 = new Scanner(System.in);//System.in means keyboard
            Scanner scan2 = new Scanner(System.in);//System.in means keyboard

            System.out.println("Enter value for numerator   : ");
            numerator=scan1.nextInt(); //waits for the user input (int value)

            System.out.println("Enter value for denominator : ");
            denominator=scan2.nextInt();//waits for the user input (int value)

            System.out.println("numerator   is : "+numerator);
            System.out.println("denominator is : "+denominator);

//reading, solving assignments, attending java lecture, ppt
            // pdf,  java video, java audio, interact in whatsapp

            division = numerator / denominator; //the actual division here
            System.out.println("==> division    is : " + division);
        }
        catch(ArithmeticException e) { //for division problem
            System.out.println("<== hey cannot divide by zero...");
        }
        catch(InputMismatchException e) { // keyboard value mismatched
            System.out.println("Please supply integer value...");
        }
        catch(RuntimeException e) { //any unknown runtime issue
            System.out.println("some runtime problem..."+e);
        }
        catch(Exception e) {
            System.out.println("some exception occurred..."+e);
        }
        catch(Throwable e) {
            System.out.println("some throwable occurred..."+e);
        }
        finally { //OPTIONAL BLOCK if catch is mentioned: finally block runs regardless of any exception occurred
            System.out.println("<==> finally : End of division");
        }

        System.out.println("End of main");

    }
}
