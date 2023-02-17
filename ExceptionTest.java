public class ExceptionTest {
    public static void main(String[] args) {
        int kmsToComplete=10;
        int kmsCompleted=0;

        System.out.println("Car starting the journey");

        System.out.println("Car completed 1 km");kmsCompleted=1;
        System.out.println("Car completed 2 km");kmsCompleted=2;
        System.out.println("Car completed 3 km");kmsCompleted=3;
        System.out.println("Car completed 4 km");kmsCompleted=4;

        if(kmsToComplete < kmsCompleted) //10< 4
            throw new RuntimeException("Ohh car is punctured....");
        else
            System.out.println("Lets get the stepney to replace the punctured wheel...");

        System.out.println("Car completed 5 km");kmsCompleted=5;
        System.out.println("Car completed 6 km");kmsCompleted=6;
        System.out.println("Car completed 7 km");kmsCompleted=7;

        if(kmsToComplete < kmsCompleted) //10<7
            throw new RuntimeException("Ohh fuel is finished....");
        else {
            System.out.println("Lets get a help of the reserved fuel, or reach a nearest gas station..pump...");
        }
        System.out.println("Car completed 8 km");kmsCompleted=8;
        System.out.println("Car completed 9 km");kmsCompleted=9;

        if(kmsToComplete < kmsCompleted) //10<9
            throw new RuntimeException("Ohh police caught me due to over speeding....");


        System.out.println("Car completed 10 km");kmsCompleted=10;

        System.out.println("Car completed the journey");


    }
}
/*

        Exception
        |
        the "abnormal condition or a situation"
        of your "java program" in which
        the program "might be terminated"
        or "abruptly stopped"

        Exception ==> Handling

        Handling can be done in old style or new style
                                    |           |
                                if condition   try{} catch{} finally{} block
                                    |
                            there can be
                            the jungle of if


        grandmother's traditional way of handling your health

        eat the fruit first, before your meal

        fruit is alkaline
        meal is acidic


 */