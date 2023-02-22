public class RefTest {
    public static void main(String[] args) {
        Doctor x = new Doctor();
        Surgeon y = new Surgeon();
        HeartSurgeon z = new HeartSurgeon();

        x.diagnose(); //x is to SuperClass Type, it knows x.Doctor.diagnose() to be called
        x.prescribe(); //same here
        x.chargeFees(); //same here

        System.out.println("---------------------");
        y.diagnose(); //y is to ChildClass Type, it knows y.Surgeon.diagnose() to be called
        y.prescribe(); //same
        y.chargeFees(); //same

        System.out.println("---------------------");
        z.diagnose(); //z is to Child'sChildType, it knows z.HeartSurgeon.diagnose() to be called
        z.prescribe(); //same
        z.chargeFees(); //same

        System.out.println("====================================");

        Doctor doctorRef = new Surgeon(); //    left  = right
                                        //    Doctor  = alsoADoctor (Surgeon)

        //Binding of a function with a reference are done in two phases 1. at compile time, 2. at runtime
        doctorRef.diagnose(); // doctorRef is to SuperClass Type, it knows doctorRef.Doctor.diagnose() to be called
                            //but at the second phase, it finds a Surgeon's object present at the right
                            //hand side of the = sign, hence it binds' Surgeon's diagnose() method

        doctorRef.prescribe();
        doctorRef.chargeFees();
        doctorRef.doSurgery();
        System.out.println("---------");

        doctorRef = new HeartSurgeon();

        doctorRef.diagnose();
        doctorRef.prescribe();
        doctorRef.chargeFees();

        Surgeon refToSurgeon = new HeartSurgeon();

        refToSurgeon.diagnose();
        refToSurgeon.prescribe();
        refToSurgeon.doSurgery();
        //refToSurgeon.doHeartSurgery();

    }
}


class Doctor {                          //Doctor is always a Doctor
    void diagnose()   {   System.out.println("Doctor: diagnose()"); }             //not more than that
    void prescribe()  {   System.out.println("Doctor: prescribe()");}
    void chargeFees() {   System.out.println("Doctor: chargeFees()");}
}

class Surgeon extends  Doctor {                          //Doctor is always a Doctor
    void diagnose()   {   System.out.println("Surgeon: diagnose()"); }  //overriding           //not more than that
    void prescribe()  {   System.out.println("Surgeon: prescribe()");}//overriding
    void chargeFees() {   System.out.println("Surgeon: chargeFees()");}//overriding

    void doSurgery()  {   System.out.println("Surgeon: doSurgery()"); } //exclusive
}
class HeartSurgeon extends  Surgeon {                          //Doctor is always a Doctor
    void diagnose()   {   System.out.println("HeartSurgeon: diagnose()"); } //overriding            //not more than that
    void prescribe()  {   System.out.println("HeartSurgeon: prescribe()");}//overriding
    void chargeFees() {   System.out.println("HeartSurgeon: chargeFees()");}//overriding

    void doSurgery()  {   System.out.println("HeartSurgeon: doSurgery()"); } //overriding

    void doHeartSurgery() { System.out.println("HeartSurgeon: doHeartSurgery()");  } //exclusive
}




//the "supreclassRef = child class object" concept is universal
//and applicable to below 3 lines too

//general super class - general child
//abstract super class - and its children
//interface handle - and its children

