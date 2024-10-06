package hw4;
import java.util.Scanner;
//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

public class DayCalc {
//	private int[] date;
	private int year, month, day;
	private boolean isLeap;
	
	public static final int[] DAYS_IN_EACH_MON = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 

	public static void main(String args[]) {
		DayCalc dc = new DayCalc();
		dc.setDate();
		dc.printDays(dc.month, dc.day);
	}
	
	// setDate but not by Array!
	public void setDate() {
		boolean setYear = false, setMonth = false, setDay = false;
		int dayOfTheMonth = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請依序輸入年、月、日：");
		
		// set year
		do {
			this.year = sc.nextInt();
			isLeap = isLeap(this.year);
			setYear = true;
		} while (!setYear);
		
		// set month
		do {
			this.month = sc.nextInt();
			if (this.month <= 12 && this.month >= 1) {
				if ((this.month < 8 && this.month % 2 == 1) || (this.month >=8 && this.month % 2 == 0)) {
					dayOfTheMonth = 31;
				} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
					dayOfTheMonth = 30;
				} else  if (this.month == 2 && isLeap) {
					dayOfTheMonth = 29;
				} else {
					dayOfTheMonth = 28;
				}
				setMonth = true;
			} else {
				System.out.println("月份需在1～12之間，請重新輸入月份：");
			}
		} while (!setMonth);
		
		// set day
		do {
			this.day = sc.nextInt();
			// 檢驗日數是否合理
			if (this.day <= dayOfTheMonth && this.day >= 1) {
				setDay = true;
			} else {
				System.out.println("日期不符，請重新輸入日（不需重新輸入年月）：");
			}
		} while (!setDay);
	}
	
	public void printDays(int month, int day) {
		int totalDays = 0;
		for (int i = 0; i < month - 1; i++) {
			totalDays += DAYS_IN_EACH_MON[i];
		}
		totalDays += day;
		if (month > 2 && isLeap){
			totalDays++;
		}
		System.out.println("輸入的日期為該年第" + totalDays +"天");
	}
	
	public boolean isLeap(int year){// 檢查閏年
//		公元年份非4的倍數，為365天平年。
//		公元年份為4的倍數但非100的倍數，為366天閏年。
//		公元年份為100的倍數但非400的倍數（1700年、1800年及1900年）為平年。
//		公元年份為400的倍數（1600年及2000年）為閏年。
		boolean isLeap;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeap = true;
				} else {
					isLeap = false;
				}
			} else {
				isLeap = true;
			}
		} else {
			isLeap = false;
		}
		return isLeap;
	}
	
}
