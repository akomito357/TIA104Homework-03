package hw10;

import java.util.Scanner;

public class TestDateFormatter {

	public static void main(String[] args) {
		DateFormatter df = new DateFormatter();
		String input = null;
		boolean checkResult = false;
		String convertDate = null;
		Scanner sc = new Scanner(System.in);

		// 1. check format
		while (!checkResult) {
			System.out.print("請輸入日期（年月日，例如20241127）：");
			input = sc.next();

			checkResult = df.checkFormat(input);
			if (checkResult) {
				break;
			}
			System.out.println("日期格式不正確，請再輸入一次！");

		}

		// 2. convert
		do {
			System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年：");
			String option = sc.next();
			convertDate = df.dateformat(option);

			if (convertDate.equals("error")) {
				System.out.println("輸入不正確，請重新輸入選項！");
			}

		} while (convertDate.equals("error"));
		
		System.out.println(convertDate);
	}

}
