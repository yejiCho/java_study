package Ch03.inheritance01;

public class Driver01 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Mammalia mammalia = new Mammalia();
		Bird bird = new Bird();
		Whale whale = new Whale();
		
		animal.showMe();
		mammalia.showMe();
		bird.showMe();
		whale.showMe();
	}
}
