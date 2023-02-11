public class ShapeTest {

    public static void main(String[] args) {
        Square square = new Square(5);
        square.findArea();

        Rectangle rect = new Rectangle(45,90);
        rect.findArea();
    }
}

class Square
{
    int side;
    float area;

    public Square(int side) {
        this.side = side;
    }
    void findArea() {
        area = side * side;
        System.out.println("area of square : "+area);
    }
}

class Rectangle extends Square //now there are 3 fields inside this class
{
    int side2;  // + side + area is already from the Square

    public Rectangle(int side, int side2) {
        super(side); //reuse teh code of the super class
        this.side2 = side2;
    }
    void findArea() { //overriding - redefining the findArea() to suite Rectangle's business
        area = side * side2;
        System.out.println("area of rectangle : "+area);
    }
}




//  Is Sachin Tendulkar an object or a class?

// Is "Sachin Tendulkar" an object or a class?

//neither the object nor the class

// he is a livingbeing, animal, mammal, human, person, cricketer


class Cricketer
{
    int rank;
    String cricketerName;
    String country;
    long score;
    int numberOfFourRuns;
    int numberOfSixRuns;


}

//  Cricketer cricketer1 = new Cricketer(1,"Sachin Tendulkar","Ind",10000,500,300);

class God
{
    String name;
    String property;
    String modeOfTransportation;
}



// God theGod1 = new God("Krishna","King","Chariot");
// God theGod2 = new God("Jesus","Priest","....");
// God theGod = new God("Buddha","Prince","Chariot");
// God theGod = new God("Mohd. Paigambar","Messenger","...");


class Krishna
{

}
// Krishna k1 = new Krishna();
// Krishna k2 = new Krishna();










/*
class Person  {
    //gender , age, name
}

class Student extends Person { //isA
    //int rollnumber

}*/

/*

                            Person
                               |
                            Teacher
                                |isA
                     ---------------------------------------------
                       |isA                | isA           |
                   ScienceTeacher       HistoryTeacher  JavaTeacher


                            Machine
                                |
                        ------------------------------------------
                        |  isA             |  isA           |isA
                  WashingMachine    AirconditioningMachine Ovan

 */
/*
class Person
{
    //gender age name
}
class Teacher extends Person
{

    //String schoolName;
    //int numberOfStudents;

}

class ScienceTeacher extends  Teacher
{

    //String phy, chem, biology

}
class HistoryTeacher extends Teacher
{

}
*/













