package Ch03.polymorphism01;

public class Penguin extends Animal{
	public String habitat;
	
	public void showHabitat() {
		System.out.printf("%s�� %s�� ���\n",name,habitat);
	}
	
//	override : ������ | ����Ŭ������ �޼���� ���� �޼��� �̸�, ���� ���� ����Ʈ
	public void showName() {
		System.out.println("��� ���̸�?");
		
	}
//	overroad : �ߺ����� | ���� �޼��� �̸�, �ٸ� ���� ����Ʈ
	public void showName(String yourName) {
		System.out.printf("%s�ȳ�, ���� %s��� ��\n", yourName,name);
	}
}
