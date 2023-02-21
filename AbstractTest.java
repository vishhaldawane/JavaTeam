public class AbstractTest {
    public static void main(String[] args) {
        //u cannot create object of abstract classes
        //but u can create object of the interpretations
       // e.g
      //  GeometricalShape geometricalShape = new GeometricalShape();

      Circle circle = new Circle(100);
      circle.calculateArea();

      Rectangle rectangle = new Rectangle(50,60);
      rectangle.calculateArea();

      Triangle triangle = new Triangle(40,80);
      triangle.calculateArea();

     // Fish fish = new Fish(); //not possible, because in reality such Fish doesnot exist
        //its a symmetry for all the school of fish

        SwordFish swordFish = new SwordFish();
        WhaleFish whaleFish = new WhaleFish();
        Shark shark = new Shark();

        swordFish.breathing();
        swordFish.swim();

        whaleFish.breathing();
        whaleFish.swim();

        shark.breathing();
        shark.swim();

    }
}
//Function types based on argument and return
//1. function without argument without return
//2. function with    argument without return
//3. function with    argument with    return
//4. function without argument with return

//NOW LETS LEARN FUNCTIONS BASED ON INHERITANCE

//1. EXCLUSIVE FUNCTION
//2. INHERITED FUNCTION
//3. OVERRIDDEN FUNCTION
//4. IMPLEMENTED FUNCTION - MANDATORY

class Doctor {
    void diagnose() { } //1. exclusive function
    void oathToCureThePatient() { //2. inherited to all children

    }
}
class Surgeon extends Doctor {
    void surgery() { //1. exclusive function

    }
    //3. over-riding by the child
    void diagnose() { //originally belongs to Doctor, but child has done overriding

    }
}

//u are creating an "abstract idea" as a super class
//u can put "some RULES" in this super class so that the "child can follow it"
//it becomes "mandatory" for the child to follow "these RULES"
//and that is the "ULIMATE" purpose of abstract classes

//Geometrical is symmetry and not a real shape
abstract class GeometricalShape //abstract image drawn by me
{   //an abstract function always resides in an abstract class
    abstract void calculateArea();  // is this function inherited to the children? YES
       // System.out.println("lets calculate area of any image..");
     //how to calculate area of an image which is incomplete????
        //or the image is partial or unknown to you?
}

//and child class is an interpretation of that abstract idea
class Circle extends GeometricalShape //1st interpretation - FloatingIce
{
    int radius; //each circle has a radius

    public Circle(int radius) { //constructor to set the radius
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("calculating area of a circle....");
        float area = 3.14f * radius * radius; //real time calculation
        System.out.println("area of a circle is : "+area);
    }
    //PI *r *r
}
class Rectangle extends GeometricalShape //2nd interpretation - Face
{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        System.out.println("calculating area of a rectangle....");
        float area = length * breadth;
        System.out.println("area of rectangle is : "+area);

    }
    //l*b
}
class Triangle extends GeometricalShape//2nd interpretation - Plasma
{
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea() {
        System.out.println("calculating area of a triangle....");
        float area = 0.5f * base * height; //assuming right angled triangle
        System.out.println("area of a triangle is : "+area);
    }
    //1.5 * b* h  for right angled triangle
}

abstract class Fish
{
    //observe below - function "body" is missing!!!!! no curly brackets there
    abstract void swim(); //a rule for all the school of fish to follow
    abstract void breathing();
}
class SwordFish extends Fish{
    void swim(){ //function is interpreted here as how a sword fish swims
        System.out.println("sword fish is swimming like piercing a sword in the stream...");
    }
    void breathing() {
        System.out.println("swordfish is breathing via gills.....");
    }
}
class WhaleFish extends Fish {
    void swim() { //now interpret how a whale swim
        System.out.println("whale is swimming in a relaxed aggression....");
    }
    void breathing() {
        System.out.println("whale is breathing via gills...via coming at the sea surface..");
    }
}
class Shark extends Fish {
    void swim() {
        System.out.println("shark is swimming like a top-tail exposed in the air.....");
    }
    void breathing() {
        System.out.println("shark is breathing via gills..in rapid way......");
    }
}