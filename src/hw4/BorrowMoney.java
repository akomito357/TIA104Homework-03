package hw4;
import java.util.Scanner;
//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數
// {{25, 2500}, {32, 800}, {8, 500}, {19, 1000}, {27, 1200}}

public class BorrowMoney {
	int borrow;
	
	public static void main(String[] args) {
		int[][] colls = {{25, 2500}, {32, 800}, {8, 500}, {19, 1000}, {27, 1200}};
		BorrowMoney bm = new BorrowMoney();
		bm.borrowMoney();
		bm.printColls(bm.borrow, colls);
	}
	
	public void borrowMoney() {
		System.out.println("請輸入想借的金額：");
		Scanner sc = new Scanner(System.in);
		int borrow = sc.nextInt();
		this.borrow = borrow;
	}
	
	public void printColls(int borrow, int[][]colls) {
		int totalColls = 0;
		System.out.print("員工編號：");
		for (int i = 0; i < colls.length; i++) {
			if (colls[i][1] >= borrow) {
				System.out.print(colls[i][0] + " ");
				totalColls ++;
			}
		}
		if (totalColls > 0) {
			System.out.print("，共" + totalColls + "人可借！");
		} else {
			System.out.print("無，共" + totalColls + "人可借！");
		}
		
	}
	
	
	
	
}
