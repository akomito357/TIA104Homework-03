package hw10;

import java.util.Scanner;

public class TestNumberFormatter {

	public static void main(String[] args) {	
		NumberFormatter nfm = new NumberFormatter();
		Scanner sc = new Scanner(System.in);
		boolean isNum = false;
		String input = null;
		String formatInput = null;
		String option = null;
		
		// 1. 輸入數字並檢驗是否符合格式
		while (!isNum) {
			System.out.println("請輸入數字：");
			input = sc.next();
			isNum = nfm.checkFormat(input);
			
			if (isNum) {
				break;
			}
			
			System.out.println("數字格式不正確，請再輸入一次！");
		}
		
		// 2. 詢問欲格式化的格式
		double inputValue = Double.parseDouble(input);
		do {
			System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號：");
			option = sc.next();

			formatInput = nfm.formatOption(option, inputValue);			
			if (!formatInput.equals("error")) {
				break;
			}
			System.out.println("請輸入 1、2、3 之一的選項");
			
		} while(formatInput.equals("error"));
		
		
		// 3. 印出轉換
		switch (option) {
		case "1":
			System.out.print("千分位數字：");
			break;
		case "2":
			System.out.print("百分比：");
			break;
		case "3":
			System.out.print("科學記號數字：");
			break;
		default:
			System.out.println();
		} 
			
		System.out.print(formatInput);
		
	}
	
}
