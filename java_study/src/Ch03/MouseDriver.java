package Ch03;

//public이 붙은 클래스는 하나여야함
class Mouse{
	public String name;
	public int age;
	public int countOfTail;
	
	public void sing() {
		System.out.println(name+"찍찍!");
	}
}

public class MouseDriver{
	public static void main(String[] args) {
		Mouse mickey = new Mouse();
		
		mickey.name = "미키";
		mickey.age = 85;
		mickey.countOfTail = 1;
		
		mickey.sing();
		
		mickey = null;
		
		Mouse jerry = new Mouse();
		
		jerry.name = "제리";
		jerry.age = 73;
		jerry.countOfTail = 1;
		
		jerry.sing();
		
	}
}