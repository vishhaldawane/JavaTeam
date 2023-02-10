class PersonTest {
    public static void main(String[] args) {


        Person thePerson = new Person();
        thePerson.talks();
        thePerson.walks();
        System.out.println("---------");

        Student theStudent = new Student();
        theStudent.talks();
        theStudent.walks();
        theStudent.study();
        theStudent.doHomeWork();

        System.out.println("-------------");

        Employee theEmpObj = new Employee();
        theEmpObj.talks();
        theEmpObj.walks();
        theEmpObj.doOfficeWork();
        theEmpObj.doHomeWork();
        theEmpObj.study();

    }
}

class Person
{
    char gender;
    String name;
    int age;

    Person() {
        //super();
        System.out.println("Person constructor...");
    }
    void talks() {
        System.out.println("person is talking...");
    }
    void walks() {
        System.out.println("person is walking....");
    }
}
class Student extends Person
{
    int rollNumber;
    char grade;
    float percentage;
    float totalMarks;
    String degreeType;

    Student() {
        //super();
        System.out.println("Student constructor....");
    }
    void study() {
        System.out.println("student is studying...");
    }
    void doHomeWork() {
        System.out.println("student is doing home work...");
    }
    void talks() {
        System.out.println("student is talking...");
    }
    void walks() {
        System.out.println("student is walking....");
    }
}

class Employee extends  Student
{
    int employeeNumber;
    String jobTitle;
    double salary;

    Employee() {
        //super();  // hidden first line of every constructor u write
        System.out.println("Employee constructor...");
    }
    void doOfficeWork() {
        System.out.println("employee is doing office work...");
    }
    void solveTheProblem() {
        System.out.println("employee is solving the problem....");
    }
    void talks() {
        System.out.println("employee is talking...");
    }
    void walks() {
        System.out.println("employee is walking....");
    }
    void study() {
        System.out.println("employee is studying...");
    }
    void doHomeWork() {
        System.out.println("employee is doing home work...");
    }
}





