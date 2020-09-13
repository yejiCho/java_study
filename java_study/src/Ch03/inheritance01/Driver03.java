package Ch03.inheritance01;

public class Driver03 {
	public static void main(String[] args) {
		Animal[] animals = new Animal[4];
		
		animals[0] = new Animal();
		animals[1] = new Mammalia();
		animals[2] = new Bird();
		animals[3] = new Whale();
		
		for(int index=0; index<animals.length; index++) {
			animals[index].showMe();
		}
	}
}
