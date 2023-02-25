import java.util.Scanner;

public class MenuTest {
    public static void main(String[] args) {
        int choice=0;

        do {
            System.out.println("------------------");
            System.out.println("B A N K   M E N U");
            System.out.println("------------------");
            System.out.println("1. Bank Login (Existing Users)       ");
            System.out.println("2. Register with the Bank (New Users)");
            System.out.println("3. Exit");
            System.out.println("------------------");
            System.out.println("Enter choice : ");
            Scanner scan1 = new Scanner(System.in);
            choice = scan1.nextInt();

            switch (choice) {
                case 1:
                        System.out.println("------------------");
                        System.out.println("L O G I N    H E R E");
                        System.out.println("------------------");
                        System.out.println("Enter username"); //have scanner here
                        Scanner scan3 = new Scanner(System.in);
                        String username =scan3.nextLine();

                        System.out.println("Enter password"); //have scanner here
                        Scanner scan4 = new Scanner(System.in);
                        String password =scan4.nextLine();

                        System.out.println("------------------");

                    break;
                case 2:
                    System.out.println("R E G I S T E R   H E R E ");
                    System.out.println("------------------");
                    System.out.println("Enter username"); //have scanner here
                    System.out.println("Enter password"); //have scanner here
                    System.out.println("Enter birthdate"); //have scanner here
                    System.out.println("Enter email"); //have scanner here
                    System.out.println("------------------");

                    break;
                case 3:
                    System.out.println("EXIT"); break;
                default:
                    System.out.println("Invalid choice");
            }

        } while(choice!=3);
    }
}
