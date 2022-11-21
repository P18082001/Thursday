package oopsconcept;

class Animal {
	
	void eat() {
		System.out.println("the animal is eating" );
	}

	void sleep() {
		System.out.println("animal is  sleeping  ");
	}
}

class Bird extends Animal {


	void eat() {
		super.eat();
		System.out.println("the bird is fly in the sky" );
	}

	void sleep() {
		super.sleep();
		System.out.println("which is animal sleeping  " );
	}

	void fly() {
		System.out.println("which bird fly in sky ");
	}
}
class ThursdayLab1{
	public static void main(String[] args) {

		Animal a = new Animal();
		Bird bd = new Bird();
		a.eat();
		a.sleep();
		System.out.println("==============================");
		bd.fly();
		bd.eat();
		bd.sleep();
	}
}