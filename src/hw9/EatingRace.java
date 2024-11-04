package hw9;

import java.util.Random;

//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
//每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//參考範例：CounterRunnable.java
//需留意主執行緒執行順序

public class EatingRace implements Runnable{
	
//	private String name;
	
	public EatingRace() {
		
	};
	
//	public EatingRace(String name) {
//		this.name = name;
//	}

	public void run() {
		int goal = 10;
		Random rand = new Random();
		int ranMin = 500;
		int ranMax = 3000;
		
		for (int i = 1; i <= goal; i++) {
			System.out.println(Thread.currentThread().getName() + "吃第" + i + "碗飯");
			if (i == goal) {
				System.out.println(Thread.currentThread().getName() + "吃完了！");
			}

			int stopSec = rand.nextInt(ranMax - ranMin) + ranMin;			
			try {
				Thread.sleep(stopSec);
			} catch (InterruptedException e){
				e.printStackTrace();
			}	
		}
	}
	
	
	public static void main(String args[]) {
		EatingRace r1 = new EatingRace();
		Thread t1 = new Thread(r1, "饅頭人");
		EatingRace r2 = new EatingRace();
		Thread t2 = new Thread(r2, "詹姆士");
		
		System.out.println("-----大胃王快食比賽開始！-----");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print("-----大胃王快食比賽結束！-----");
	}
	
}
