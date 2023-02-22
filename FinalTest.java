public class FinalTest {

    public static void main(String[] args) {
        final float PI=3.14f; //22/7
        System.out.println("PI : "+PI);

       // PI=3.19f;
        System.out.println("PI : "+PI);

        Car myCar = new Car("BMW","NC355");
        System.out.println("My car details : "+myCar);
     //   myCar.setNumberPlate("NY5454"); //overwrite a new value
        System.out.println("My car details : "+myCar);
    //    myCar.setNumberPlate("WD1254");
        System.out.println("My car details : "+myCar);


    }
}

class Car
{
    final String model;
    final String numberPlate;

    public Car(String model, String numberPlate) {
        this.model = model;
        this.numberPlate = numberPlate; //constructor can set the value , since it is called only once
    }

    public String getModel() {
        return model;
    }

   /* public void setModel(String model) {
        this.model = model;
    }*/

    public String getNumberPlate() {
        return numberPlate;
    }

    /*public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }*/

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                '}';
    }
}