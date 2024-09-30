package hw2;

public class Lotto {
	public static void main(String[] args) {
//		阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		
		int total = 0;
		System.out.println("可選擇的數字為：");
		for (int i = 1; i <= 49; i++) {
			if ((i / 10 != 4) && (i % 10 != 4)){
				System.out.print(i + " ");
				total += 1;
			}
		}
		System.out.println("");
		System.out.println("可選擇的數字共有：" + total + "個。");
	}

}
