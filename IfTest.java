
public class IfTest {
    public static void main(String[] args) {
        int age=8;
        int qualifiedAge=18;
        int maxHumanAge=120;
        System.out.println("Begin with main");
        //operand1 >= operand2

        if(age < 0)
            System.out.println("Invalid human age");
        else
        {
            if (age > maxHumanAge)
                System.out.println("Usually human age should not exceed 120");
            else
            {
                if (age >= qualifiedAge)
                {
                    System.out.println("You can vote");
                    System.out.println("You should have voting Id");
                } else
                {
                    System.out.println("You can not vote");
                    System.out.println("You should not have voting Id");
                }
            }
        }
        System.out.println("some thing here...");

        System.out.println("End of main");
    }
}

