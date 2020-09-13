package Ch03.inheritance02;

public class Bat extends Mammalia implements flyable{
	Bat(){
		myClass = "박쥐";
	}
	
	@Override
	public void fly() {
		System.out.println(myClass+"날수있는");
	}
}
