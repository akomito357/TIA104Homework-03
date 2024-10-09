package hw5;

import java.util.Scanner;

public class StarSquare {
	int width, height;
	
	public static void main(String[] args) {
		StarSquare ss = new StarSquare();
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高：");
		ss.width = sc.nextInt();
		ss.height = sc.nextInt();
		ss.starSquare(ss.width, ss.height);
	}
	
	public void starSquare(int width, int height) {
		for (int h = 1; h <= height; h++) {
			for (int w = 1; w <= width; w++) {
				System.out.print("*");
			}
			if (h != height) {
				System.out.println("");
			}
		}
	}

}
