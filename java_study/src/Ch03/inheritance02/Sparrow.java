package Ch03.inheritance02;

public class Sparrow extends Mammalia implements flyable{
	Sparrow(){
		myClass = "����";
	}
	
	@Override
	public void fly() {
		System.out.println(myClass+"flyyable");
	}
}
