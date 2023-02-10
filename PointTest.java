public class PointTest {

    public static void main(String[] args) {
        Point2D  p1 = new Point2D(100,200);
        p1.showPoint2D();
        System.out.println("-------------");

        Point3D p2 = new Point3D(50,60,70);
        p2.showPoint3D();

        System.out.println("----------");

        ColoredPoint3D p3 = new ColoredPoint3D(500,700,800,"Green");
        p3.printColoredPoint3D();
    }
}
class Point2D
{
    int x;  int y;

    Point2D(int x, int y) {
        this.x=x;   this.y=y;
    }
    void showPoint2D() {
        System.out.println("x "+x); System.out.println("y "+y);
    }
}

class Point3D extends Point2D
{
   int z; // x and y already present here

    public Point3D(int x, int y, int z) {
        super(x, y); //1.reusing the already written code from the parent
                    //2.calling the constructor of the nearest super class
        this.z = z; //take care of your z too
    }
    void showPoint3D() {
        super.showPoint2D(); //1. reusing the already written code from the parent
                        //2. calling the function of the nearest super class
        System.out.println("z : "+z);
    }
}

class ColoredPoint3D extends Point3D
{
    String color; // x y z is already here

    public ColoredPoint3D(int x, int y, int z, String color) {
        super(x, y, z); //REUSE
        this.color = color;
    }
    void printColoredPoint3D() {
        super.showPoint3D(); //REUSE
        System.out.println("color : "+color);
    }
}


/*
  2d -- x and y
  3d -- x, y and z
 */