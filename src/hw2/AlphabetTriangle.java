/*
 * 請設計一隻Java程式，輸出結果為以下：
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * FFFFFF
 */

package hw2;

public class AlphabetTriangle {
	public static void main(String[] args) {
		char alphabet = ' ';
		for (int i = 1; i <= 6; i++) {
			switch (i) {
				case 1:
					alphabet = 'A';
					break;
				case 2:
					alphabet = 'B';
					break;
				case 3:
					alphabet = 'C';
					break;
				case 4:
					alphabet = 'D';
					break;
				case 5:
					alphabet = 'E';
					break;
				case 6:
					alphabet = 'F';
					break;
			}
			for (int j = 1; i - j >= 0; j++) {
				System.out.print(alphabet);
			}
			if (i < 6) {
				System.out.println("");
			}
		}
	}
}
