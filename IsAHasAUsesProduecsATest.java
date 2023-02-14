public class IsAHasAUsesProduecsATest {
    public static void main(String[] args) {
        System.out.println("Begin the main...");
        //if you observe this below object, we are not discussing the tub, washing tub
        WashingMachine myWashingMachine = new WashingMachine("Whirlpool",9.0f);
        float bill1 = myWashingMachine.wash(10,2.0f,3);
        System.out.println("The Bill is : $"+bill1);

        float bill2 = myWashingMachine.wash(5,1.0f,2);
        System.out.println("The Bill is : $"+bill2);

        float bill3 = myWashingMachine.wash(3,0.5f,1);
        System.out.println("The Bill is : $"+bill3);

        float totalBill = bill1 + bill2 + bill3;

        System.out.println("Total bill : "+totalBill);

        float bill4 = myWashingMachine.wash(3);
        System.out.println("4th Bill is  : "+bill4);

        System.out.println("End of main...");
    }

}
class Machine{ //(1) parent of WashingMachine

}
class WashingMachine extends Machine //(2)  isA
{
    String washingMachineBrand;
    float washingCapacity;

    //observe the below object is inside washing machine
    WashingTub washTubObj = new WashingTub(); //hasA

    WashingMachine(String wmb, float wc){
        washingMachineBrand = wmb;
        washingCapacity = wc;
    }
    //int cloth - means number of clothes - 3 jeans / 5 shirts / 8 = 3 jeans + 5 shirts
    //float washingPowder- quantity of the washing powder 1.0 scoop, 2.0 scoop, 3.0 scoop
    //int waterLevel - Very High=4, High=3, Medium=2, Low=1,

    float wash() {
        System.out.println("washing nothing....");
        return 0;
    }

    float wash(int waterLevel) {
        System.out.println("washing with water level..."+waterLevel);
        return 1.0f;
    }

    //function with argument AND WITH return value
    //producesA        usesA            usesA        usesA
    float wash(int cloth, float washingPowder, int waterLevel) { // how many clothes
        System.out.println("---- The washing program is set ---");
        System.out.println("Number of cloths to wash : "+cloth);
        System.out.println("Washing powder quantity  : "+washingPowder+" scoop");
        System.out.println("Water level for washing  : "+waterLevel);
        //lets assume the general weight of each cloth is 0.5 kg
        // then lets calculate total weight of all the cloths
        float totalWeightOfAllCloths = 0.5f * cloth; //10
        if(totalWeightOfAllCloths > washingCapacity) {
            System.out.println("Cannot wash...overloaded the capacity...");
        }
        else {
            for (int i = 1; i <= 15; i++) {
                System.out.println(washingMachineBrand + " machine is washing the cloths.." + i);
            }
            rinse(); //one function of the class is calling another function
        }
        //washing machine uses electricity, water, detergent
        return 2.0f; //returning $2.0 as a bill of each wash program
    }
    void rinse() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t"+washingMachineBrand + " machine is rinsing the cloth.."+i);
        }
        spin();
    }
    void spin() {
        for(int i=1;i<=5;i++) {
            System.out.println("\t\t"+washingMachineBrand + " machine is spinning the cloth.."+i);
        }
    }
}

class Tub //parent for WashingTub
{

}
class WashingTub extends Tub {

    void rotateClockWiseHalfTurn() {
        System.out.println("rotating clock wise half turn");
    }
    void rotateAntiClockWiseHalfTurn() {
        System.out.println("rotating anti clock wise half turn");

    }
    void fullSpinClockWise() {
        System.out.println("rotating clock wise with full speed");
    }

}

/*

            Machine (1)
              |
        ---------------
        |isA
    WashingMachine(2)
            WashingTub washTub = new WashingTub(); (3)

 */