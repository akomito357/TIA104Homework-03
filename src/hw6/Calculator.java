package hw6;
/*
請設計三個類別Calculator.java，CalException.java與CalTest.java，
在Calculator.java裡有個自訂方法為powerXY(int x, int y)，
功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
1. x與y同時為0，(產生自訂的CalException例外物件)
2. y為負值，而導致x的y次方結果不為整數
3. x與y皆正確情況下，會顯示運算後結果
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	protected int x;
	protected int y;
	
	public Calculator() throws CalException {
		setXY(inputXY());
	}
	
	public Calculator(int x, int y) throws CalException{
		int[] xy = {x, y};
		setXY(xy);
	}
	
	public int[] inputXY() throws InputMismatchException {
		int[] xy = new int[2];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入x的值：");
		xy[0] = sc.nextInt();
		System.out.println("請輸入y的值：");
		xy[1] = sc.nextInt();
		
		return xy;
	}
	
	
	public void setXY(int[] xy) throws CalException, InputMismatchException{ 
		if (xy[0] == 0 && xy[1] == 0) {
			throw new CalException("0的0次方沒有意義！");
		} else if (xy[1] < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		} else {
			this.x = xy[0];
			this.y = xy[1];
		}
	}

	
	public double powerXY(int x, int y) {
		double ans = Math.pow(x, y);
		return ans;
	}
	

	

}
