public class IfElseWithLogicalOperator {

    public static void main(String[] args) {
            int age=8;
            int qualifiedAge=18;
            int maxHumanAge=120;
            System.out.println("Begin with main");
            //operand1 >= operand2

            // if the age is in the range of 1 to 120 == its valid human age

            // if the age is in the range of 18 to 120 ==its valid for voting

            // if its below 0 or above 120 == its invalid human age
//700

            if(age < 0 | age > maxHumanAge)
                System.out.println("Invalid human age");
            else
                    if (age >= qualifiedAge && age <= maxHumanAge)
                    {
                        System.out.println("You can vote");
                        System.out.println("You should have voting Id");
                    } else
                    {
                        System.out.println("You can not vote");
                        System.out.println("You should not have voting Id");
                    }


            System.out.println("some thing here...");

            System.out.println("End of main");
    }
}

