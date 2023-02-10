

public class InheritanceTest {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.farming();
        gf.walking();
        //gf.banking();

        //System.out.println("-------");

        Father f = new Father();
        f.farming();
        f.walking();
        f.banking();

    }
}
//every class has an implicit constructor provided by JPL
//and a programmer can override that implicit ctor
// implicit constructor does nothing

class GrandFather
{
       GrandFather() {
           System.out.println("GrandFather constructed..");
       }
       void farming() {
           System.out.println("GrandFather is farming...");
       }
       void walking() {
           System.out.println("GrandFather is walking....");
       }
}

class Father extends GrandFather
{
    Father() {
        System.out.println("Father is constructed...");
    }
    void banking() {
        System.out.println("father is banking....");
    }
}
