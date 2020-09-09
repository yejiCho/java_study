package practice2;

// inheritance example
public class Dog extends Animal{
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
	}
}
