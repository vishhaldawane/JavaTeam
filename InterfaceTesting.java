public class InterfaceTesting {
    public static void main(String[] args) {

      //  Chalk c = new Chalk();
      //  c.write();

        System.out.println("---------");

        Writeable w = new Pen();
        w.write();

        System.out.println("-------");

        w = new FountainPen();
        w.write();

        System.out.println("------");

        w = new Chalk();
        w.write();
    }
}

interface Writeable
{
    void write();
}
class Pen implements Writeable //isA
{
    public void startWriting() { //1. exclusive
        System.out.println("Get the paper...and the pad");
        write();
    }
    public void write() { //4. [inherited from parent+overridden+mandatory] implemented
        System.out.println("writing......with gel pen.......");
    }
}

class FountainPen extends Pen //isA
{
    // is overriding mandatory in java inheritance???
    public void write() {
        System.out.println("writing on paper with fountain pen...");
    }
}

class Stone
{

}
class Chalk extends Stone implements Writeable
{
    public void write() {
        System.out.println("Writing on black slate/board using the chalk...");
    }
}

//A inheritance of derivation        vs   B inheritance of implementation

class Savings {
    void withdraw() { /*bal=bal-amt*/ }
}
class Fixed extends Savings {
    //overriding of fun is not mandatory - derivation
    void withdraw() { /*bal=bal-amt + check maturityDate*/ }
}

abstract class CreditAccount {
    abstract void checkCreditLimit(); //declared
}
class CitiBankCreditAccount extends  CreditAccount { // inheritance of implementation
    void dontCheckCreditLimit() { //mandatory
        //checking the credit limit logic....
    }
    void checkCreditLimit() {

    }
}
class CoralCard extends CitiBankCreditAccount {
    void checkKaroYaNaKaroCreditLimit() { //may override if it has its own functionality
        //checking the credit limit logic..as per coral..
    }
}