package hw10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成

//(1)年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖

public class DateFormatter {

	// check format
	public boolean checkFormat(String input) {
		String regex = "^\\d{8}$";

		if (input.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}

	// convert
	public String dateformat(String option, String input) {
		DateFormat dfInput = new SimpleDateFormat("yyyyMMdd");
		Date parseInput = null;
		String convertDate = null;
		
		try {
			parseInput = dfInput.parse(input);
			System.out.println(parseInput);
		} catch(ParseException e) {
			System.out.println("輸入格式錯誤，請重新輸入！");
			return "error";
		}
		
		switch (option) {
		case "1":
			// 年/月/日
			DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd");
			convertDate = df1.format(parseInput);
			System.out.print("年/月/日：");
			return convertDate;
		case "2":
			// 月/日/年
			DateFormat df2 = new SimpleDateFormat("MM/dd/yyyy");
			convertDate = df2.format(parseInput);
			System.out.print("月/日/年：");
			return convertDate;
		case "3":
			// 日/月/年
			DateFormat df3 = new SimpleDateFormat("dd/MM/yyyy");
			convertDate = df3.format(parseInput);
			System.out.print("日/月/年");
			return convertDate;
		default:
			return "error";
		}

	}

}
