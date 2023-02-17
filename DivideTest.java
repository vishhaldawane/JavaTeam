import java.util.Scanner;  //jungle.wild.Tiger

public class DivideTest {
    public static void main(String[] args) {
        System.out.println("Begin of main");
        System.out.println("Starting  division");

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

       // if(denominator !=0 ) {
            division = numerator / denominator; //the actual division here
            System.out.println("division    is : " + division);
       // }
        //else {
          //  System.out.println("Cannot perform division...just a simple msg, not the error msg ");
            //throw new RuntimeException("hey cannot divide by zero...");
        //}
        System.out.println("End of division");
        System.out.println("End of main");

    }
}
