package hw5;
//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class RandAvg {
	
	public static void main(String[] args) {
		RandAvg rand = new RandAvg();
		rand.randAvg();
	}
	
	public void randAvg() {
		int[] randNums = new int[10];
		int sum = 0;
		System.out.println("本次亂數結果：");
		for (int i = 0; i < randNums.length; i++) {
			randNums[i] = (int)(Math.random() * 101);
			System.out.print(randNums[i] + " ");
			sum += randNums[i];
		}
		System.out.println("");
		System.out.print("本次平均為：" + (sum / randNums.length));
	}

}
