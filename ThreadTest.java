public class ThreadTest {
    public static void main(String[] args) {
        Student x = new Student();
        x.start();

    }
}

interface Walkable
{
    void walk(); //just declared | no body | abstract and public
}

class Person implements Walkable
{
    public void start() { //NOT MANDATORY, NOT FROM ANY INTERFACE | exclusive
        System.out.println("Person is starting...wear your sport shoes.");
        walk();
        System.out.println("Person is stopping....remove your sport shoes.");
    }
    public void walk() { //MANDATORY to define HERE from Walkable
        System.out.println("Person is walking....");
    }
}

class Student extends Person {
    void gotoSchool() {
        System.out.println("Pack the school bag...");
        System.out.println("Wear the school uniform...");
        super.start();//invoke from nearest super class
    }
    public void walk() {
        System.out.println("Student is walking......");
    }
}