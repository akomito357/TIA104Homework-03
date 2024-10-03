package hw3;
import java.util.Scanner;
//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息

public class GuessRandomNum {
	private int targetInt;
	
	public static void main(String[] args) {
		GuessRandomNum guess = new GuessRandomNum();
		guess.targetInt = guess.getNumber();
		guess.guessNumber(guess.targetInt);
	}
	
	public int getNumber() {
		int num = (int)(Math.random() * 10);
		return num;
	}
	
	public void guessNumber(int n) {
		System.out.println("開始猜數字吧！");
		Scanner sc = new Scanner(System.in);
		int guessNum;
		do {
			guessNum = sc.nextInt();
			if (guessNum == n) {
				System.out.println("答對了！答案就是" + n);
			} else {
				System.out.println("猜錯囉");
			}
		} while (guessNum != n);
				
	}
}
