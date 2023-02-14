public class AssociationTest1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        CarKey myCarKey = new CarKey();
        myCar.startTheCar(myCarKey);
    }
}

class Vehicle {

}
class Car extends Vehicle{//isA
    PetrolEngine engine = new PetrolEngine();//hasA

    void startTheCar(CarKey ck) { //passing Object as an argument
        ck.startIt();
        System.out.println("Starting the car with the START button / Car KEY");
        engine.ignite();
        drive(); //internally calling the drive here...
        stopTheCar(); // internally calling stopTheCar();
        ck.stopIt();
    }
    void drive() {
        for(int i=1;i<=10;i++) {
            System.out.println("Driving for ..."+i+" miles");
        }
    }
    void stopTheCar() {
        System.out.println("Stopping the car....");
    }
}
class Key //But every Key is not a CarKey
{

}
class CarKey extends Key //every CarKey is a Key
{
    void lockTheCar() {
        System.out.println("locking the car...");
    }
    void unlockTheCar() {
        System.out.println("Unlocking the car...");
    }
    void startIt() {
        System.out.println("starting the car....with the key...");
    }
    void stopIt() {
        System.out.println("stopping the car....with the key...");
    }
}

class Engine {

}
class PetrolEngine extends Engine {
    void firePiston() {
        System.out.println("firing the piston....");
    }
    void ignite() { //ignite() is calling firePiston()
        firePiston();
        System.out.println("igniting the engine....");
    }
}




//implements used in interfaces