public class InterfaceTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.listens();
        person.talks();
        person.sing();

        System.out.println("--------------------");
        Student student = new Student();
        student.listens();
        student.talks();
        student.study(); //my students are studying after their whole day job, to get a new job
        student.solveProblems();
        student.sing();

        System.out.println("--------");
        Employee employee = new Employee();
        employee.listens();
        employee.sign();
        employee.talks();
        employee.study();
        employee.work();
        employee.getSalary();
        employee.sing();
        employee.solveProblems();
    }
}

interface Listening {
    void listens();
}
interface Talking {
    void talks();
}

interface Studying {
    void study();
}
interface ProblemSolving {
    void solveProblems();
}

interface  Working {
    void work();
}
interface GettingPaid
{
    void getSalary();
}
interface SigningIn
{
    void sign();
}

interface Singing {
    void sing();
}

class Person implements Listening, Talking, Singing { //must override since the direct child

    @Override
    public void listens() { //MANDATORY
        System.out.println("person is listening...");
    }

    @Override
    public void talks() { //MANDATORY
        System.out.println("person is talking...");
    }

    @Override
    public void sing() {//MANDATORY
        System.out.println("Person is singing....");
    }
}
class Student extends  Person implements Studying, ProblemSolving {
    @Override
    public void study() {//MANDATORY
        System.out.println("student is studying...");
    }

    @Override
    public void solveProblems() {//MANDATORY
        System.out.println("student is solving java problems...to get a dream job");

    } //student may or may not override

    @Override
    public void listens() {//NOT-MANDATORY
        System.out.println("student is listening...");
    }

    @Override
    public void talks() {//NOT-MANDATORY
        System.out.println("student is talking...");
    }

    @Override
    public void sing() {//NOT-MANDATORY
        System.out.println("student is singing.....");
    }
}
class Employee extends Student implements Working, GettingPaid, SigningIn {

    @Override
    public void work() { //MANDATORY
        System.out.println("Employee is working...if u love your job, then enjoy it...");
    }

    @Override
    public void getSalary() {//MANDATORY
        System.out.println("getting salary.....");
    }

    @Override
    public void sign() {//MANDATORY
        System.out.println("Employee is signing-in in the office...");
    }

    @Override
    public void study() {//NOT-MANDATORY
        System.out.println("Employee is studying ...");
    }

    @Override
    public void solveProblems() {//NOT-MANDATORY
        System.out.println("Employee is solving problem... ...");
    }

    @Override
    public void listens() {//NOT-MANDATORY
        System.out.println("Employee is listening... ...");
    }

    @Override
    public void talks() {//NOT-MANDATORY
        System.out.println("Employee is talking ...");
    }

    @Override
    public void sing() {//NOT-MANDATORY
        System.out.println("Employee is singing ...");
    }
}
