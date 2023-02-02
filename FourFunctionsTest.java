public class FourFunctionsTest {
    public static void main(String[] args) {
        MyCalculator calci = new MyCalculator();
        calci.addThem(50,4); //we are passing 100 and 20 via x and y
        calci.addThem(60,8);

        calci.subtractThem(500,50);
        calci.subtractThem(400,30);

        calci.multiplyThem(40,4);
        calci.divideThem(45,3);

        int x=100;
        int y=20;
        calci.addThem(x,y);

    }
}
class MyCalculator
{

    //function taking NO arguments/values
    void doSomething() {
        System.out.println("\nsimple functions...");
    }

    //a function performs a specific task
    //it is re-usable code

    //function taking arguments/values
    void addThem(int a, int b)// these x and y are copied to a and b
    {
        int c = a+b;
        System.out.println("\naddition of "+a+" and "+b+" is  : "+c);
    }
    void subtractThem(int a, int b)// these x and y are copied to a and b
    {
        int c = a-b;
        System.out.println("\nsubtraction of "+a+" and "+b+" is : "+c);
    }
    void multiplyThem(int a, int b)// these x and y are copied to a and b
    {
        int c = a*b;
        System.out.println("\nproduct of "+a+" and "+b+" is : "+c);
    }
    void divideThem(int a, int b)// these x and y are copied to a and b
    {
        int c = a/b;
        System.out.println("\ndivision of "+a+" and "+b+" is : "+c);
    }

}
