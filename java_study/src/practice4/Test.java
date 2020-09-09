package practice4;

public class Test {
	public void sayNick(String nick) {
		if ("fool".equals(nick)) {
			return;
		}
		System.out.println("ho"+nick);
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.sayNick("fool");
		test.sayNick("ge");
	}
}
