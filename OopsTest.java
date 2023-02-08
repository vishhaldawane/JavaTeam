import java.awt.Frame;

public class OopsTest {
    public static void main(String[] args) {

        Frame myFrame1  = new Frame();
        Frame myFrame2  = new Frame();
        Frame myFrame3  = new Frame();

        myFrame1.setTitle("Java Team");
        myFrame1.setSize(400,300);
        myFrame1.setLocation(200,300);
        myFrame1.setVisible(true);

        myFrame2.setTitle("I Love Nepal");
        myFrame2.setSize(500,300);
        myFrame2.setLocation(400,500);
        myFrame2.setVisible(true);

        myFrame3.setTitle("I Love My Job");
        myFrame3.setSize(300,200);
        myFrame3.setLocation(400,700);
        myFrame3.setVisible(true);


        Joker j1 = new Joker();
        Joker j2 = new Joker();
        Joker j3 = new Joker();

        j1.giggling(); //using here

        String str = new String("Sandeep");
        System.out.println("name is : "+str);

        String changedName = str.toUpperCase();
        System.out.println("now the name is : "+changedName);
        System.out.println("str is : "+str.toLowerCase());
        System.out.println("str is : "+str.substring(3));
        System.out.println("str is : "+str.substring(3,1));
        //0 1 2 3 4 5 6
        //S a n d e e p
    }
}

class Joker // Sushmita is the developer of this class
{
    int age;
    String name;

    void giggling() { //coding/developing and of this function too
        System.out.println("giggling...");
        System.out.println("smiling...");
        System.out.println("kidding...");

    }
    void cycling() {
        System.out.println("cycling...");
    }
    void jumping() {
        System.out.println("jumping...");
    }
}
/*
    This is all about mindset
        state of the mind

    Suppose if you want to prepare
    biryani, pasta or any food item

    how do you start?

    Prepare the Biryani?

    how many people?
       2/3/5/10/12/25...



    what ingredients you need?
    0. for how many people?  --> 5 people
    0.1. so that how much kg? --> 1KG

    1. chicken - 1.5kg
    2. rice - 1 kg
    3. oil - 250ml
    4. spices - 100gm
    5. gas - amount of gas? - 14kg capacity?
                then u might need 0.5kg of gas

    6. pot - 5 ltr capacity

    7. yogurt - 250gm



    9. ginger garlic paste - 50gm

    10. water - 4/5 ltr

    11. lighter - working condition

    12. lemon juice - 1 lemon
    13. some veggies - 200gm for salad
    14. salt - half spoon
    15. proper utensils
    16. mint/coriander
    17. grinder
    18. dry fruits
    19. fried onions
    20. plates to serve
    21. spoon

    8. you should have a cook/chef/ procedure
            YES, i know how to make it
            is it a procedure?????

        ------------------

       {
        already the data is ready
        with its required quantity
        +
        and now the steps/actions() to perform

            boilWater() { }
            cookRice() { }
            cookChicken() { }
            addTheRiceOnCookedChicken() {}
            addTheDryFruits(){}
            addGingerGarlicPaste(){}
            addWater(){}
            lightTheGas(){}
            putPotOnTheGas(){}
            putOil(){}
            heatOil(){}
            addSpices(){}
       }

       1. fire the gas
       2. put the pot with water and start cooking
            the rice up to 75%
       3. ..
       4. ..
       5 ..
       6 ..
       7. ..
       8. ...


    how are you to going to start?


    POPS = procedure oriented programming system

        pops = procedure <--- data

                              cardType
                              balance
               withdraw()<--- amountToWithdraw
                     1000       cashLimit
                              creditLimit
                              billingCycle
                              dues
                              perDayWithdrawLimit

               changePin()<---pin

        top to bottom approach
         |
         think of the functions
         and then of the data

         shortDrive()

    -----------------------------

    OOPS = object oriented programming system

        oops = data <---procedure
               amount <-- withdraw()

        longDrive() ????

        bottom to top approach

        bind your data
        with concerned functions





        there are 5 oops concepts
        around this discussion

        OOPS concept
        ---------------

        1. Abstraction
                it is the "what is it?" of an object

                what is an ATM?

            hiding the data/functionality
            and providing
            the USAGE of our concern

            ATM -
                do we know how much cash
                is loaded in the ATM?
                how many people have hit the atm?
                170 per day on an average???
                2000 people per week
                20000 per month...
                0.5 million people in a year?

                data abstraction
                procedural abstraction

        2. Encapsulation
                it is the "how is it?" part of an object


        3. Polymorphism

        4. Inheritance

        5. Object communication

    are abstraction and encapsulation
    sides of the same coin?






 */