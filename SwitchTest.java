import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {

        System.out.println("MENU"); //System.out -- monitor
        System.out.println("------");
        System.out.println("1. Pizza"); //1 is just to show
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Exit");
        Scanner scanner = new Scanner(System.in); // Keyboard
        int choice = scanner.nextInt();//accept value from the user

        switch (choice)
        {
            case 1:
                    System.out.println("You want pizza..");
                    System.out.println("pizza with toppings...");
                    System.out.println("pizza with cheese...");
                    break;
            case 2: System.out.println("You want Burger..");
                    System.out.println("Burger with cheese slice...");
                    break;
            case 3: System.out.println("You want Pasta..");
                    System.out.println("Pasta with masala...");
                    break;
            case 4: System.out.println("You want to exit..."); break;

            default:
                System.out.println("Choice is mismatched...");
        }

     /*   if(choice==1) //your choice is being verified here
            System.out.println("wow you want pizza...");
        else if(choice==2)
            System.out.println("Oh You want burger today...");
        else if (choice==3)
            System.out.println("great...pasta today...");
        else
            System.out.println("Ok ...no choice today....");
    */



    }
}
/*
 if condition is done
 switch statement
 for loop
 integrate with classes and objects
 */