import java.util.Iterator;
import java.util.TreeSet;

/*

                             d  - data type - ButterMilk
                             |                Paneer Chilly/Chicken Chilly
                             |                Noodles
                   -----------------------    Fried Rice
                   |         |           |    Ice Cream
                   c         i           a    Egg         x is infinite here
                   |         |           |
                   |         |           |
               Container    Iterator     Algorithm
            Glass            Straw            drink() { }
            Plate/Bowl       Fork             eat() { }
            Bowl             Chop Sticks      eat() { }
            Plate            Spoon            eat() { }
            Cone             IceCreamStick    lick() { }
            EggContainer     pickup           access() { }
                           Stepping through
                           the Container

  the job of i        is to help z         to retrieve x from y
  the job of Iterator is to help Algorithm to retrieve data from Container
  the job
 */
public class TreeSetTest2 {
    public static void main(String[] args) {

        System.out.println("Begin of main....");

        System.out.println("Container is ready....eg. GLASS is ready");
        TreeSet c = new TreeSet();
       //   HashSet c = new HashSet();
       // ArrayList c = new ArrayList();
       // LinkedList c = new LinkedList();


        System.out.println("Adding content...eg. adding WATER in the GLASS");
        c.add("sandeep"); // 50 is added as an Object
        c.add("sonam"); // and so on
        c.add("sujan");
        c.add("om");
        c.add("narayan");
        c.add("passy");
        c.add("michael");
        c.add("dhawa");
        c.add("samriddha");
        c.add("zoom");
        c.add("ashok");
        c.add("jinash");
        c.add("shailesh");
        c.add("sanjeev");
        c.add("karma");

        System.out.println("content is added...adding WATER is DONE");

        System.out.println("accessing the iterator...getting the STRAW....");
        Iterator i = c.iterator();
        System.out.println("got the iterator..got the STRAW....");

        System.out.println("traversing through the iterator...");
        while(i.hasNext()) { //it checks for the number in the set
            String str=(String) i.next(); // it retrieves one number from the set
            System.out.println("str is : "+str);
        }
        System.out.println("End of main....");

    }
}
/*

  // 50 90 40 40 60 55 35 85 85 45 100

  binary tree - inverted tree [ root at top, branches in the bottom ]
   |
 there is a node/object which has its data + Left Child and Right Child
  ROOT+L+R
                          50 (root of the tree)
                          |
                     -----------
                     |L       |R
                     40       90
                     |          |
               ----------   -----------
               |L       |R  |L       |R
               35       45   60      100
                             |
                           ------
                           |     |
                           55    85


                           LEAF NODE =NO CHILDREN FURTHER


 */