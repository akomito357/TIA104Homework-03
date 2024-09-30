package hw1;

public class TestNineNine {

	public static void forAndWhile() {
		// for loop + while loop
		int j = 1;
		for(int i = 1; i <= 9; i++) {
			while(j <= 9) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
				j++;
			}
			j = 1;
			System.out.println("");
		}		
	}
	
	public static void forAndDoWhile() {
		// for and do...while loop
		int j = 1;
		for(int i = 1; i <= 9; i++) {
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while(j <= 9);
			j = 1;
			System.out.println("");
		}
	}
	
	public static void whileAndDoWhile() {
		// while loop + do...while loop
		int i = 1, j = 1;
		while (i <= 9) {
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			j = 1;
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		forAndWhile();
		System.out.println("===============================================");
		forAndDoWhile();
		System.out.println("===============================================");
		whileAndDoWhile();
	}
}
