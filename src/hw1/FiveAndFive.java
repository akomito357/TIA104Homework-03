package hw1;

public class FiveAndFive {

	public static void main(String[] args) {
//		請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		
		System.out.println(5 + 5);
		// 兩個5皆為10進位整數，可以直接相加
		// 5 + 5 = 10
		
		System.out.println(5 + '5');
		// 第一個5為整數
		// 第二個5為char型別，對照Unicode表為/u0035，以16進位轉換為10進位，16 * 3 + 5 = 53
		// 5 + 53 = 58
		
		System.out.println(5 + "5");
		// 第一個5為整數
		// 第二個5為String型別，因此此行程式是在做字串的相加，非數字計算，會直接將字本身並列印出
		// 因此印出55
	}
	
}
