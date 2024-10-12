package hwext;

public class Pencil extends Pen{
	
	public Pencil() {
		
	}
	
	public Pencil(String brand, double price) {
		super(brand, price);
	}

	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public double getPrice() {
		return price * 0.8;
	}
	
}
