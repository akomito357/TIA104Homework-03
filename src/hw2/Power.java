package hw2;

public class Power {

	public static void main(String[] args) {
//		請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i);
			if (i < 10) {
				System.out.print(" ");
			}
		}
	}
}
