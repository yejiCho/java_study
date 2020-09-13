package Ch03.inheritance02;

public class Whale extends Mammalia implements swimmable{
	Whale(){
		myClass = "°í·¡";
	}
	@Override
	public void swim() {
		System.out.println(myClass + "swimm");
	}
}
