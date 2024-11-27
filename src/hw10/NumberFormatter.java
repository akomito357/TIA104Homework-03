package hw10;
//請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示

//(1)千分位(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖 
//(提示： TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
//補充 (依此類推)：
//輸入12345，千分位為12,345，輸入123，千分位為123
//輸入0.75，百分比為75%，輸入1，結果為100%

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFormatter {
	
	public boolean checkFormat(String input) {
		String regexInt = "[0-9]+";
		String regexDouble = "[0-9]+.[0-9]+";
		
		Pattern ptInt = Pattern.compile(regexInt);
		Pattern ptDouble = Pattern.compile(regexDouble);
		
		Matcher matchInt = ptInt.matcher(input);
		Matcher matchDouble = ptDouble.matcher(input);
		
		if (matchInt.matches()) {
			return true;
		} else if (matchDouble.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public String formatOption(String option, double inputNum) {
		switch (option) {
		case "1":
			// 千分位轉換
			Format df1 = new DecimalFormat("#,###");
			return df1.format(inputNum);
		case "2":
			// 百分比轉換
			Format df2 = new DecimalFormat("#.##%");
			return df2.format(inputNum);
		case "3":
			// 科學記號
			Format df3 = new DecimalFormat("#.#E00");
			return df3.format(inputNum);
		default:
			System.out.print("輸入錯誤！");
			return "error";
		}
		

	}

}
