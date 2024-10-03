package hw3;
import java.util.Scanner;
/*
 * 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,
 * 但這次他想要依心情決定討厭哪個數字,
 * 請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
 * (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
*/

public class Lotto2 {
	int ngNumber;
	int[] numberList;
	
	public Lotto2() {
		ngNumber = getNumber();
	}

	public static void main(String[] args) {
		Lotto2 lotto = new Lotto2();
//		lotto.ngNumber = lotto.getNumber();
		lotto.getNumberList(lotto.ngNumber);
		
		
	}
	
	public int getNumber() {
		System.out.println("阿文，請輸入你今天想討厭哪個數字QQ：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	public void getNumberList(int num) {
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if ((i >= 10 && i % 10 != num && i / 10 != num) || (i < 10 && i % 10 != num)){
				System.out.print(i + "\t");
				count += 1;
				if (count % 6 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.println("總共有" + count + "個數字可選");
	}
	
}
