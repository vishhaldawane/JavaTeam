/*

        1. write a class that extends java.lang.Thread class
        2. override its run() method()
        3. create object of these threads
        4. **do not call the run() from your side***
            rather call the super class function known as
            start() [ this function is present in Thread class ]
            |
            run() <-- your run method is invoked by their start()


 */
public class ThreadTest2 {
    public static void main(String[] args) {
        System.out.println("Begin main....");

        Bike bike1 = new Bike("Narayan"); //3
        Bike bike2= new Bike("Sandeep"); //3
        Bike bike3 = new Bike("Sujan"); //3

        MyBike myBike = new MyBike("HotWheels Toy Bike");
        Thread thread = new Thread(myBike); //myBike is Runnable

        thread.start(); // thread is aware where is the myBike [ see line 23]
        bike1.start(); //inter-thread communication has to happen if you want to control the output
        bike2.start();
        bike3.start();

        Car car = new Car(); //3
        Train train = new Train(); //3
        Aircraft aircraft = new Aircraft(); //3
        Boat boat = new Boat();//3

//3chefs making pizza
        //1st chef has to talk to other 3 chefs
        //1st chef making the base of the pizza




        /*car.start();
        train.start();
        aircraft.start();
        boat.start();*/

        System.out.println("End of main.....");
    }
}

class Toy
{

}
class MyBike extends Toy implements Runnable { // a toy bike of a kid also want to become a thread

    String str;

    MyBike(String s) {
        str = s;
    }
    public void run() {
        for(int i=1;i<=100;i++) {
            System.out.println(str+" My Toy Bike is also running....");
//            try {
//                Thread.sleep(3);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

class Bike extends Thread { //1 isA

    String rider; //hasA

    Bike(String str) { // constructor is setting the rider
        rider = str;
    }

    public void run() {//2
        for (int i=1;i<=100;i++) {
            System.out.println(rider+" on Bike, is running...." + i);
//            try {
//                Thread.sleep(3);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

class Car extends Thread {
    public void run() {//2
        for (int i=1;i<=100;i++) {
            System.out.println("\tCar is running...." + i);
        }
    }
}

class Train extends Thread {
    public void run() {//2
        for (int i=1;i<=300;i++) {
            System.out.println("\t\tTrain is running..(railing).." + i);
        }
    }
}

class Aircraft extends Thread {
    public void run() {//2
        for (int i=1;i<=700;i++) {
            System.out.println("\t\t\tAircraft is running.(flying)..." + i);
        }
    }
}

class Boat extends Thread {
    public void run() {//2
        for (int i=1;i<=150;i++) {
            System.out.println("\t\t\t\tBoat is running.(sailing)..." + i);
        }
    }
}