package Ch03.inheritance01;

public class Driver02 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal mammalia = new Mammalia();
		Animal bird = new Bird();
		Animal whale = new Whale();
		
		animal.showMe();
		mammalia.showMe();
		bird.showMe();
		whale.showMe();
	}
}
