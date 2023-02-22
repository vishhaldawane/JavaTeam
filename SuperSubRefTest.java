
class Morning
{
	void yoga(Human x, Dog y) {
		System.out.println("wow what a fresh mornign....fresh air....");
		x.walk();
		x.think(); //have i completed my java assignments
		x.eating();
		x.sleeping();
		
		System.out.println("dog is completely in the different world...");
		y.walk();
		y.eating();
		y.bark();
		
		y.sleeping();
		
	}
	
	
	void walkingInGarden(Mammal x, Mammal y) {
		//System.out.println("wow what a fresh mornign....fresh air....");
		x.walk(); //have i completed my java assignments
		x.eating();
		//x.think();
		
		//System.out.println("dog is completely in the different world...");
		y.walk();
		y.eating();
		//y.bark();
		
	}
	
	void onlyAnialsAreWalking(Animal x, Animal y) {
		//System.out.println("wow what a fresh mornign....fresh air....");
		x.fear(); //have i completed my java assignments	
		y.fear();

	}
	
}
public class SuperSubRefTest {

	public static void main(String[] args) {

		Human human = new Human();
		Dog dog = new Dog();
				
		Morning morning = new Morning();
		
		//morning.yoga(human, dog);
		
		//morning.walkingInGarden(human, dog);
		
		morning.onlyAnialsAreWalking(human, dog);
		
	
		//walk.onlyWalking(dog,human);
		
		//walk.onlyAnialsAreWalking(human, dog);
		//walk.walking(human, dog);
		
		// A reference to a super class can point to the object of its child
		
		//but using this referefenceToSuper class we can only invoke
		//the methods of the "super class type" and not the exclusive methods
		//of the child object
		
		
		/*Human human = new Human();
		
		human.eating();		//2. inherited
		human.sleeping();
		human.fear();
		human.reProduction();
		
		human.giveBirth();
		human.walk();
		
		human.think();//1. exclusive
		*/
//		System.out.println("-------------");
		
		/*Dog dog = new Dog();
		
		dog.eating();		//2. inherited
		dog.sleeping();
		dog.fear();
		dog.reProduction();
		
		dog.giveBirth();
		dog.walk();
		
		dog.bark(); //1. exclusive
		*/
		
	//	System.out.println("----lets assign dog to a mammalRef-----");
		
		
		
//		Animal x = new Human();
		
//		Mammal x = new Human();

//		Human x = new Human();		
//		Dog   x = new Dog();
		
//		x.eating();
//		x.fear();
//		x.sleeping();
//		x.reProduction();
		
//		x.giveBirth();
//		x.walk();
		
//		x.think();
//		x.bark();

	}
}

class Animal
{
	void eating() {
		System.out.println("Animal is eating..");
	}
	void sleeping() {
		System.out.println("Animal is sleeping...");
	}
	void fear() {
		System.out.println("Animal is fearing...");
	}
	void reProduction() {
		System.out.println("Animal is reproducing....");
	}
}

class Mammal extends Animal
{
	void giveBirth() {
		System.out.println("Mammal is giving birth...");
	}
	void walk() {
		System.out.println("Mammal is walking....");
	}
}
class Human extends Mammal //1+2+4=7 methods in Human
{
	void think() {
		System.out.println("Human is thinking...");
	}
	
	//Human is overriding nearest parent's function
	void walk() {
		System.out.println("Human is walking with style...like an actor....");
	}
	void giveBirth() {
		System.out.println("human can give birth ...with a wise decision...");
	}
	
	//Human is overriding the grand parent's function
	void eating() {
		System.out.println("Human is eating..with an etiquette");
	}
	
	void sleeping() {
		System.out.println("Human is sleeping...at 11pm..");
	}
	void fear() {
		System.out.println("Human is fearing...God...");
	}
	void reProduction() {
		System.out.println("Human is reproducing...another Human....");
	}
}

class Dog extends Mammal
{
	void bark() {
		System.out.println("Dog is barking...");
	}

	@Override
	void giveBirth() {
		System.out.println("Dog is giving birth .....");
	}

	@Override
	void walk() {
		System.out.println("Dog is walking  .....");

	}

	@Override
	void eating() {
		System.out.println("Dog is eating Bone .....");
	}

	@Override
	void sleeping() {
		System.out.println("Dog is sleeping  mostly in day time .....");

	}

	@Override
	void fear() {
		System.out.println("Dog is fearing from Human .....");
	}

	@Override
	void reProduction() {
		System.out.println("Dog is reproducting another dog  .....");

	}
	
}