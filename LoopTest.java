import java.util.Scanner; //availing it for your use

public class LoopTest {
    public static void main(String[] args) {
        System.out.println("Begin main");
        int x=1; //initial value of the x, ie 1

        while(x<=100) { //check if x is lesser than or equals to 10
            System.out.println("this is a line...."+x);
            x++; //increase by 1
            //x+=5; // same as x=x+5;
        }
        System.out.println("End of main");

        int i=10;
        System.out.println("i "+i);
        i--; // i=i-1;   i++ means always ..i=i+1
        System.out.println("i "+i);

    }
}
