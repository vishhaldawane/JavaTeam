public class BankAccount {
    public static void main(String []args) {
        System.out.println("hello vishal is done");

        //following line would create teh object of WashingMachine

        /*

        WashingMachine washingMachineObj1 = new WashingMachine();
        washingMachineObj1.wash();
        washingMachineObj1.wash();
        washingMachineObj1.wash();
        washingMachineObj1.wash();
        washingMachineObj1.rinse();
        washingMachineObj1.spin();

        Joker jack = new Joker(); // here joker1 is just the object name
        jack.giggling();
        jack.giggling();
        jack.dance();
        jack.cycling();
        jack.jumpingOnTheNet();
        jack.giggling();
        jack.dance();


        //class   objectname = new  constructorFunction
        // |          |         |     |
         Tiger      tgrObj1  = new Tiger();
         tgrObj1.followInstructions();
         tgrObj1.jumpAcrossFireRing();
         tgrObj1.roar();
         //with intelliJ life is easier much better
        //because of intellsense

        */

        //single line comment

        /*
          multi line
          comment
          here
         */
        Cricketer dhoni = new Cricketer();
        dhoni.batting();
        dhoni.keeping();
        dhoni.balling();

    }
}

class Cricketer
{
    void hitSixer() {
        System.out.println("wow..the sixer...");
    }
    void hitFourRuns() {
        System.out.println("thats four runs...");
    }
    void batting() {
        System.out.println("nice batting...");
    }
    void balling() {
        System.out.println("balling....");
    }
    void keeping() {
        System.out.println("wicket keeping....");
    }
    void fielding() {
        System.out.println("fielding.....");
    }
    void catching() {
        System.out.println("catching.....");
    }
}

class Tiger
{
    void roar() {
        System.out.println("Tiger is roaring..");
    }
    void jumpAcrossFireRing() {
        System.out.println("tiger is jumping across fire ring...");
    }
    void followInstructions() {
        System.out.println("tiger is following some instructions...");
    }
}

//  godisnowhere
//  godIsNoWhere
//  godIsNowHere - camel case notation in java




class Joker
{
    void giggling() {
        System.out.println("Joker is giggling...in the circus...");
    }
    void cycling() {
        System.out.println("joker is cycling in the ring...");
    }
    void dance() {
        System.out.println("joker is dancing...");
    }
    void jumpingOnTheNet() {
        System.out.println("joker is jumping....onn the net...");
    }
}
class WashingMachine
{
   void wash() {
       System.out.println("washing machine is washing...cloths..");
   }
   void rinse() {
       System.out.println("washing machine is rinsing..the cloth..");
   }
   void spin() {
       System.out.println("washing machine is spinning..the tub..");
   }
}

/* in one .java file we can only have one public class*/












class Cat
{
    void  drinkMilk()
    {
        System.out.println("cat is drinking...");

    }

    char whatsTheGender()
    {
        return 'M';
    }
}

/*
    there are four types of functions


    x = findSquare(4)


 */
