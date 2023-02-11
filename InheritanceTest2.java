public class InheritanceTest2 {

    public static void main(String[] args) {
        //there is no heart object here...in the main method

        Human human = new Human();
        human.eat();
        human.thinking();
        human.giveBirth();
        human.heart.pumping(); //oh.... nested call,
        human.brain.analyze();
        human.brain.memorizing();
        System.out.println("-----------");
        Crocodile croco = new Crocodile();
        croco.eat();
        croco.swim();
        croco.layEggs();
        croco.heart.pumping();
        croco.brain.memorizing();
        croco.brain.analyze();
        System.out.println("------------");

        Snake snake = new Snake();
        snake.brain.memorizing();
        snake.heart.pumping();
        snake.throwVenom();

        System.out.println("------");

        Horse horse = new Horse();
        horse.brain.memorizing();
        horse.heart.pumping();
        horse.alwaysStands();

        System.out.println("------");
        Alligator alli = new Alligator();
        alli.brain.memorizing();
        alli.brain.analyze();
        alli.huntQuickly();

    }
}

class Animal
{
    //hasA
    Brain brain = new Brain(); //containment | composition
    Heart heart = new Heart(); //ohhh... where is this object being created?
    // its is inside the Human design, not in the main()

    void eat() { //drink, sleep, walk, talk
        System.out.println("mammal is eating...");
    }
}
class Mammal extends Animal //isA
{
   void giveBirth() {

   }
}
class Reptile extends Animal{
    void layEggs() {
        System.out.println("laying eggs...");
    }
}
class Human extends Mammal //isA
{
    void thinking() {
        System.out.println("Human is thinking...");
    }
}
class Horse extends Mammal
{
    void alwaysStands() {
        System.out.println("Horse always stands.....");
    }
}

class Crocodile extends Reptile {
    void swim() {
        System.out.println("crocodile is swimming...");
    }
}
class Alligator extends Crocodile { //isA
    void huntQuickly() {
        System.out.println("Alligator hunting quickly....");
    }
}

class Snake extends Reptile{
    void throwVenom() {
        System.out.println("Throwing venom....");
    }
}

class RattleSnake extends  Snake {
    void makesNoiseWhileCrawling() {
        System.out.println("making noise while crawling....");
    }
}
class Heart
{
    void pumping() {
        System.out.println("heart is pumping....");
    }
    void beating() {
        System.out.println("heart is beating...");
    }

}

class Brain
{
    void analyze() {
        System.out.println("brain is analyzing....");
    }
    void memorizing() {
        System.out.println("brain is memorizing....");
    }
}

class Bulb
{
    Filament filament = new Filament();
    int voltage;
    String lightColor;
    String type;
}

class Filament
{
    String metalType;
    int length;
    int strength;
    float cost;
    String madeBy;


}
/*
                    Association Principal
                            |
                ----------------------------------
                |       |           |           |
                isA    hasA         usesA       producesA

        Human isA Mammal?           YES
        does Human hasA Heart ?     YES

        is Bulb a Filament?
        does Bulb hasA Filament?


        wiring the things!!!


NLP practitioner
NEuro Linguistic

    speak, writing,
    |       |
    ear     eyes
 */


class Card
{
}
class DebitCard extends Card
{

}




