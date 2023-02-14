public class HotDrinkTest {
    public static void main(String[] args) {

        Milk milkObj = new Milk("Cow",100,"OffWhite",35.0f,5);
        Sugar sugarObj = new Sugar("BrownSugar","Brown",10);
        Coffee coffeeObj = new Coffee(20,"Nescafe","BrownBlack","Dark","Starbucks");

        System.out.println("Milk details   : "+milkObj.toString());
        System.out.println("Sugar details  : "+sugarObj.toString());
        System.out.println("Coffee details : "+coffeeObj.toString());

        Water waterObj = new Water(100,45.0f,"Mineral","Bisleri");
        Chef chef = new Chef();
        //Cup cup = new Cup(); //old way
        Cup myCup = chef.makeHotDrink(waterObj,milkObj,coffeeObj,sugarObj);
        System.out.println("Cup details : "+myCup.content);
    }
}

class Water
{
    int quantity;
    float temperature;
    String type;
    String brand;

    public Water(int quantity, float temperature, String type, String brand) {
        this.quantity = quantity;
        this.temperature = temperature;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Water{" +
                "quantity=" + quantity +
                ", temperature=" + temperature +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public float getTemperature() {
        return temperature;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }
}
class Person
{
        //gender age name
}
class Chef extends Person{ //isA
                    //passing three objects in order to make coffee
 //producesA          usesA           usesA       usesA
    Cup makeHotDrink(Milk milk, Coffee coffee, Sugar sugar) {
        System.out.println("chef is making coffee...");

        Cup myCup = new Cup("Large",200,"Black","Paper");

        System.out.println("taken the cup..."+myCup.getType());
        System.out.println("add the boiled milk in the cup...temperature : "+milk.getTemperature());
        System.out.println("add teh coffee in the cup...qty "+coffee.getQuantity());
        System.out.println("add teh sugar in the cup...qty "+sugar.getQuantity());
        System.out.println("stir it with a spoon...");
        System.out.println("coffee is done....");
        myCup.content="My Nescafe is ready...";
        return myCup; //producesA an object as a return value
    }

    Cup makeHotDrink(Water water,Milk milk, Coffee coffee, Sugar sugar) {
        System.out.println("chef is making coffee...");

        Cup myCup = new Cup("Large",200,"Black","Paper");

        System.out.println("taken the cup..."+myCup.getType());
       // System.out.println("add the boiled milk in the cup...temperature : "+milk.getTemperature());
        System.out.println("adding the water qty : "+water.quantity);
        System.out.println("add teh coffee in the cup...qty "+coffee.getQuantity());
        System.out.println("add teh sugar in the cup...qty "+sugar.getQuantity());
        System.out.println("stir it with a spoon...");
        System.out.println("black coffee is done....");
        myCup.content="My Nescafe is ready...";
        return myCup; //producesA an object as a return value
    }

    Cup makeHotDrink(Milk milk, Coffee coffee) {
        System.out.println("chef is making coffee...");

        Cup myCup = new Cup("Large",200,"Black","Paper");

        System.out.println("taken the cup..."+myCup.getType());
        System.out.println("add the boiled milk in the cup...temperature : "+milk.getTemperature());
        System.out.println("add teh coffee in the cup...qty "+coffee.getQuantity());
        System.out.println("stir it with a spoon...");
        System.out.println("coffee is done....");
        myCup.content="My Nescafe is ready without sugar...";
        return myCup; //producesA an object as a return value
    }

    Cup makeHotDrink(Milk milk) {
        System.out.println("chef is making coffee...");

        Cup myCup = new Cup("Large",200,"Black","Paper");

        System.out.println("taken the cup..."+myCup.getType());
        System.out.println("add the boiled milk in the cup...temperature : "+milk.getTemperature());
        System.out.println("Boiled milk is done....");
        myCup.content="My Nescafe is ready without sugar...";
        return myCup; //producesA an object as a return value
    }

    Cup makeHotDrink(Milk milk,  Sugar sugar) {
        System.out.println("chef is making coffee...");

        Cup myCup = new Cup("Large",200,"Black","Paper");

        System.out.println("taken the cup..."+myCup.getType());
        System.out.println("add the boiled milk in the cup...temperature : "+milk.getTemperature());
        System.out.println("add teh sugar in the cup...qty "+sugar.getQuantity());
        System.out.println("stir it with a spoon...");
        System.out.println("Hot Milk with Sugar is done....");
        myCup.content="My Hot Milk is ready...";
        return myCup; //producesA an object as a return value
    }
}
class Cup
{
    String size;
    int capacity;
    String color;
    String type;
    String content;

    public Cup(String size, int capacity, String color, String type) {
        this.size = size;
        this.capacity = capacity;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "size='" + size + '\'' +
                ", capacity=" + capacity +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
class Milk
{
    String type;
    int quantity;
    String color;
    float temperature;
    int fatLevel;

    public Milk(String type, int quantity, String color, float temperature, int fatLevel) {
        this.type = type;
        this.quantity = quantity;
        this.color = color;
        this.temperature = temperature;
        this.fatLevel = fatLevel;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                ", temperature=" + temperature +
                ", fatLevel=" + fatLevel +
                '}';
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public float getTemperature() {
        return temperature;
    }

    public int getFatLevel() {
        return fatLevel;
    }
}
//thought
class Sugar
{
    String type;
    String color;
    int quantity; //considered in grams here

    public Sugar(String type, String color, int quantity) {
        this.type = type;
        this.color = color;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sugar{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Coffee
{
    int quantity;
    String type;
    String color;
    String taste;
    String brand;

    public Coffee(int quantity, String type, String color, String taste, String brand) {
        this.quantity = quantity;
        this.type = type;
        this.color = color;
        this.taste = taste;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "quantity=" + quantity +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }

    public String getBrand() {
        return brand;
    }
}
//what u require to make a coffee
// Milk, Sugar, Coffee, Cup, Spoon,

// activities
//1. boil the milk, color, quantity?, type?, temperature?, fatLevel(5,10)
//2. take the cup
//3. pour the coffee in the cup quantity? type?, color? taste? brand?
//4. pour the milk in the cup! size? capacity?, color, type,
//5. add the sugar in the cup, quantity? type? color?
//6. stir with spoon in that cup
//7. coffee is ready
//8. enjoy it
