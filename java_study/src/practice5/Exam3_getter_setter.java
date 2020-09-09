package practice5;

class Student{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class Exam3_getter_setter {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("test");
		s.setAge(20);
		
		String name = s.getName();
		System.out.println(name);
		int age = s.getAge();
		System.out.println(age);
	}
}
