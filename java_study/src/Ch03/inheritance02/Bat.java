package Ch03.inheritance02;

public class Bat extends Mammalia implements flyable{
	Bat(){
		myClass = "����";
	}
	
	@Override
	public void fly() {
		System.out.println(myClass+"�����ִ�");
	}
}
