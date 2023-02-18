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

    Lets understand the hierarchy of exceptions

                        Object
                            |
                         Throwable
                            |
                   --------------------
                   |                |
                Error           Exception (checked)
                                    | handle it in the catch block
                       -------------------------
                       |
                 RuntimeException (unchecked)
                    |
      --------------------------
      |                 |    |
  NullPointerException  |  ArithmeticException
                        |
                 IndexOutOfBoundsException
                        |
             -------------------------------
             |                          |
   StringIndexOutOfBoundsException    ArrayIndexOutOfBoundsException

      checked   = checked by the compiler
      unchecked = not checked by the compiler

        if you are going for a longDrive() - 300 kms

      checked           vs              unchecked
      |                                  |
   before drive                         flatTyre (runtime)
   - check "spare wheel" state          exceed speed limit
   - fuel up to date                    check post of police
   - weather condition                  highway ticket
   - tyre pressure                      sudden weather change
   - check engine oil                   engine failure
   - check brake state                  sudden lane change
   - check your car's rear light        accident
   - check audio system
                                        - status of the fog
   - check GPS



             if you are going for a shortDrive() - 3 kms


              setting up for a  physical book library

      checked                               unchecked
      |                                     |
    set up automated                     manually driven
    fire extinguisher                    fire extinguisher
     (detects the fire/smoke)           ( a fire marshall is
                                            required )


    Java has hundreds and thousands of classes
    scattered all over across various directories [ packages ]
    - they are ready made classes for us
    - they are known as API - application programming interfaces


    if you want to make your own exception, ie user defined / custom exception

    then decide which type of exception you want to make

                    checked         or      unchecked?


 ready made->        Doctor                  Engineer
                    Exception               RuntimeException

    class Surgeon extends Doctor        class MechanicalEngineer extends Engineer
    {                                   {

    }                                   }

                                        class InsufficientBalanceException extends
                                                RuntimeException
                                        {

                                        }


 */