import java.util.ArrayList;

public class DiffObjectsInArrayListTest {
    public static void main(String[] args) {
        ArrayList myObjectsList = new ArrayList();

        myObjectsList.add(new Flight()); //diff type
        myObjectsList.add(new Student()); //diff type
        myObjectsList.add(new Account()); //diff type

        for(int i=0;i<myObjectsList.size();i++) {
            System.out.println("object is : "+myObjectsList.get(i));
        }

    }
}

class Flight {

}
class Student {

}
class Account {

}