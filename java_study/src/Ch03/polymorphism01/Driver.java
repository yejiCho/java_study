package Ch03.polymorphism01;

public class Driver {
	public static void main(String[] args) {
		Penguin pororo = new Penguin();
		
		pororo.name = "�Ƿη�";
		pororo.habitat = "����";
		
		pororo.showName();
		pororo.showName("�ʺ�����");
		pororo.showHabitat();
		
		Animal pingu  = new Penguin();
		
		pingu.name = "�α�";
		pingu.showName();
	}
}
