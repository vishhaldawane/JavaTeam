public class FourFunctionsTest {
    public static void main(String[] args) {
        int x=100; //store it to a variable called as x
        float y=80; // same into y
        float z = x + y; // add these x and y into z

        System.out.println("x is "+x);
        System.out.println("y is "+y);
        System.out.println("z is "+z);// 180

        z =  x-y; // 100-80 = 20
        System.out.println("now z is "+z);

        z = x * y; // 100*80 = 8000
        System.out.println("now z is "+z);

        z =  x / y; // 100/80 = 1  int/float yeild float
        System.out.println("now z is "+z);

    }
}
