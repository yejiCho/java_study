package practice3;

class Food {
	
	private int kcal;
	private int price;
	private int kg;
	
	public Food(int kcal,int price, int kg) {
		this.kcal = kcal;
		this.price = price;
		this.kg = kg;
	}
	@Override
	public String toString() {
		return "Food kcal="+kcal+"price"+price+"kg"+kg+"/";
	}
}

class Melon extends Food{
	private String where;
	
	public Melon(int kcal,int price,int kg, String where) {
		super(kcal,price,kg);
		this.where = where;
	}
	
	@Override
	public String toString() {
		return super.toString() +"/melon" +where;
	}
}

public class whatFood {
	public static void main(String[] args) {
		Melon mel = new Melon(100,3000,3,"a");
		System.out.println(mel.toString());
	}
}
