package hw6;

import java.util.InputMismatchException;

public class CalTest {
	
	public static void main(String[] args) {
		
		while (true){
			try {
				Calculator c1 = new Calculator();
				System.out.println(c1.x + "的" + c1.y + "次方等於" + Math.round(c1.powerXY(c1.x, c1.y)));
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("輸入的格式不正確");
			}
		}
		
	}

}
