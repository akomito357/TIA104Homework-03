package hwext;
//建立父類別Pen
//• (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計) 
//• (2) 建構子設計：一個無參數與一個根據屬性而設計
//• (3) 定義Getter/Setter方法
//• (4) 宣告一個抽象方法write()
//• 建立兩個子類別Pencil與InkBrush繼承Pen父類別

public abstract class Pen {

	protected String brand;
	protected double price;
	
	// 無參數建構子
	public Pen() {
		
	}
	
	// 有參數建構子
	public Pen(String brand, double price) {
		setBrand(brand);
		setPrice(price);
	}
	
	// getter
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	// setter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("價格需大於0！");
		}
	}
	
	// 抽象方法
	public abstract void write();
	
	
}
