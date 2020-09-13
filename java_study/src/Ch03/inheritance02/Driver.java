package Ch03.inheritance02;

public class Driver {
	public static void main(String[] args) {
		
		flyable nalnari1 = new Bat();
		nalnari1.fly();
		
		flyable nalnari2 = new Sparrow();
		nalnari2.fly();
		
	}
}
