package hw1;

public class TimeConversion {
	public static void main(String[] args) {
		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int secs = 256559;
		
		int days = secs / (60 * 60 * 24);
		secs -= days * 60 * 60 * 24;
		
		int hours = secs / (60 * 60);
		secs -= hours * 60 * 60;
		
		int mins = secs / 60;
		secs -= mins * 60;
		
		System.out.println("共" + days + "天" + hours + "小時" + mins + "分" + secs + "秒");
	}
}
