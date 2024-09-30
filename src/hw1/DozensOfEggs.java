package hw1;

public class DozensOfEggs {
	public static void main(String[] args) {
		// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int egg = 200;
		
		int dozens = egg / 12;
		int remain = egg % 12;
		
		System.out.println(egg + " 顆蛋共是 " + dozens + " 打 " + remain + " 顆");
	}

}
