public class WashingMachineTest {

    public static void main(String[] args) {

        WashingMachine washMach = new WashingMachine();
        washMach.washing();
    }
}

class WashingMachine
{
    void washing()
    {
        System.out.println("washing the cloth for 15 mnts...");
        rinse(); //nested call, washing is invoking rinse()
        spin(); // once rinse is over...lets call spin()
    }
    void rinse() {
        System.out.println("rinsing the cloth for 7 mnts...");
    }
    void spin() {
        System.out.println("spinning the cloth for 3 mnts..");
    }
}