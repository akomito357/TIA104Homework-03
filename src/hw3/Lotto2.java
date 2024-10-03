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
		numberList = new int[45];
	}

	public static void main(String[] args) {
		Lotto2 lotto = new Lotto2();
//		lotto.ngNumber = lotto.getNumber();
		lotto.getNumberList(lotto.ngNumber);
		lotto.printBetNumber(lotto.numberList);
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
				this.numberList[count] = i;
				count += 1;
				if (count % 6 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.println("總共有" + count + "個數字可選");
		System.out.println("");
	}
	
	public void printBetNumber(int[] list) {
		// the index of the total number list is 0 ~ 44
		int count = 0; 
		int[] betNumber = new int[6];
		
		while (count < 6) {			
			int chosenNum = (int)(Math.random() * list.length); // get index of the number list elements
			
			if (list[chosenNum] != 0) {
			// not 0 means it isn't a default value of array element, so keep testing it's repeat or not
				for (int i = 0; i <= betNumber.length - 1; i++) {
					if (betNumber[i] == list[chosenNum]) {
						break;
					} else if (i == 5) {
						betNumber[count] = list[chosenNum];
						count += 1;
					}
				}
			}
		}
		System.out.println("六個樂透號碼：");
		for (int i = 0; i <= 5; i++) {
			System.out.print(betNumber[i] + "\t");
		}
	}
	
}
