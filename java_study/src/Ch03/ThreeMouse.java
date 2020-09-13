package Ch03;

public class ThreeMouse {
	public static void main(String[] args) {
		
		Mouse mickeys = new Mouse();
		
		mickeys.name = "mickey";
		mickeys.age = 85;
		
		mickeys.sing();
		
		mickeys = null;

		Mouse jerrys = new Mouse();
		
		jerrys.name = "jerry";
		jerrys.age = 73;
		
		jerrys.sing();
		
		jerrys = null;
		
		Mouse mitymouse = new Mouse();
		
		mitymouse.name = "mitymouse";
		mitymouse.age = 71;
		
		mitymouse.sing();
	}
	
}
