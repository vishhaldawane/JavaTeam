import java.awt.*;

public class MyMessageTest {
    public static void main(String[] args) {


        MyMessage msg1 = new MyMessage("Ping",100); //3. step
        MyMessage msg2 = new MyMessage("\tPong",100); //3. step
        MyMessage msg3 = new MyMessage("\t\tPang",100); //3. step
        MyMessage msg4 = new MyMessage("\t\t\tPung",100); //3. step
        MyMessage msg5 = new MyMessage("\t\t\t\tPingo",100); //3. step


        msg1.start(); //dont call your logic directly... invoke start()
        msg2.start(); //start() -> run() -> showMessage();
        msg3.start();
        msg4.start();
        msg5.start();


    }
}

class MyMessage extends Thread //1st step - inherit from java.lang.Thread
{
    String message;
    int delayIn;

    public MyMessage(String message, int delayIn) {
        this.message = message;
        this.delayIn=delayIn;
    }
    public void run() { //2. override the public void run() method
        showMessage(); //call your logic which should participate in threading
    }
    public void showMessage() {
        for(int i=1;i<=30;i++) {
            System.out.println("["+message+"]"+i);
            try {
                Thread.sleep(delayIn);//3 seconds
            } catch (InterruptedException e) {
                System.out.println("some problem..."+e);
            }
        }
    }
}