package hw8;

import java.util.Objects;
import java.util.Set;

//請設計一個Train類別，並包含以下屬性：
//- 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
//- 目的地 dest，型別為String - 票價 price，型別為double
//• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
//需使用的集合裡
//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//- (118, “自強”, “高雄”, “台北”, 500)
//- (1288, “區間”, “新竹”, “基隆”, 400)
//- (122, “自強”, “台中”, “花蓮”, 600)
//- (1222, “區間”, “樹林”, 七堵, 300)
//- (1254, “區間”, “屏東”, “基隆”, 700)

public class Train implements Comparable<Train>{

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	private static Set<Train> hashTrains;
	
	public Train() {

	};
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Set<Train> getHashTrains(){
		return hashTrains;
	}
	
	public String toString() {
		return "Train " + number + 
				" / 車種 = " + type + 
				" / 出發地 = " + start + 
				" / 目的地 = " + dest + 
				" / 票價 = " + price;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Train others = (Train) obj;
		return number == others.number && Objects.equals(type , others.type);
		
//		if ((number == others.number) && (this.type.equals(others))) {
//			return true;
//		} else {
//			return false;
//		}
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = result * prime + number;
		result = result * prime + ((type == null) ? 0 : type.hashCode());
		
		return result;
	}
	
	
	public int compareTo(Train otherTrain) {
		// 物件本身 與 傳入物件 相比較，如果 return 正值，就表示 物件本身 比 傳入物件 大
		// 預設是由小到大排列，因為題目要求由大到小，所以正負反過來
		if (this.number > otherTrain.number) {
			return -1; 
		} else if (this.number < otherTrain.number) {
			return 1;
		} else {
			return 0;			
		}
	}
	
	
//	public static void main(String args[]) {
//		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
//		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
//		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
//		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
//		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
//		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
//		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
//		
//		Set<Train> hashTrains = new HashSet<>();
//		
//		hashTrains.add(t1);
//		hashTrains.add(t2);
//		hashTrains.add(t3);
//		hashTrains.add(t4);
//		hashTrains.add(t5);
//		hashTrains.add(t6);
//		hashTrains.add(t7);
//		
//	}

	
}
