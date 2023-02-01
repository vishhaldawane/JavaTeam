public class FourFunctionsTest {
    public static void main(String[] args) {
        MyCalculator calci = new MyCalculator();
        calci.addThem(50,4); //we are passing 100 and 20 via x and y
        calci.addThem(60,8);
        
        calci.subtractThem(500,50);
        calci.subtractThem(400,30);

        calci.multiplyThem(40,4);
        calci.divideThem(45,3);

    }
}
class MyCalculator
{
    //function taking NO arguments/values
    void doSomething() {
        System.out.println("simple functions...");
    }

    //function taking arguments/values
    void addThem(int a, int b)// these x and y are copied to a and b
    {
        int c = a+b;
        System.out.println("addition is done : "+c);
    }
    void subtractThem(int a, int b)// these x and y are copied to a and b
    {
        int c = a-b;
        System.out.println("subtraction is done : "+c);
    }
    void multiplyThem(int a, int b)// these x and y are copied to a and b
    {
        int c = a*b;
        System.out.println("product is done : "+c);
    }
    void divideThem(int a, int b)// these x and y are copied to a and b
    {
        int c = a/b;
        System.out.println("division is done : "+c);
    }

}
