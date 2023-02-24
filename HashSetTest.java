import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//Array List and LinkedList can have duplicate objects
//TreeSet and HashSet can only have unique objects

public class HashSetTest {
    public static void main(String[] args) {

        HashSet vegSet = new HashSet();

        vegSet.add(new Carrot());
        vegSet.add(new Brinjal());
        vegSet.add(new CauliFlower());
        vegSet.add(new BottleGourd());
        vegSet.add(new Pumpkin());
        vegSet.add(new BitterGourd());
        vegSet.add(new Tomato());

       Iterator vegIterator = vegSet.iterator();

       while(vegIterator.hasNext()) {
           Object obj = vegIterator.next();
           System.out.println("veg : "+obj);
       }

    }
}

class Carrot { }
class Brinjal { }
class Pumpkin {}
class Tomato { }
class CauliFlower { }
class Cucumber { }
class Beans { }
class BottleGourd { }
class BitterGourd { }
