//熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,
//所以只要看到熊大帳戶的餘額超過3000元,就會停止匯款給熊大;
//但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。
//如果帳戶餘額低於熊大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。
//假設媽媽一次匯款 2000 元,熊大一次提款1000元,
//寫一個Java程式模擬匯款10次與提款10次的情形。

package hw9;

public class Bank {

	private int balance = 0;
	
	public Bank(){

	}
	
	public Bank(int balance) {
		this.balance = balance;
	}
	
	synchronized public void recive(String name, int reciveMoney, int expectBalance) {
		while (balance <= reciveMoney && !Depositer.depositerFinished) {
			System.out.println(name + "看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款！");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		balance -= reciveMoney;
		System.out.println(name + "領了" + reciveMoney + "，帳戶共有：" + balance);
		
		while (balance <= expectBalance && !Depositer.depositerFinished) {
			System.out.println(name + "看到餘額在" + expectBalance +"以下，要求匯款");
			notify();
			System.out.println("媽媽被熊大要求匯款！");
			try {
				wait(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
	
	synchronized public void deposit(String name, int depositMoney, int expectBalance) {
		while (balance > expectBalance && !Reciver.reciverFinished) {
			System.out.println(name + "看到餘額在" + expectBalance + "以上，暫停匯款");
			try {
				wait(50); // adding timeoutMillis to avoid dead lock
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (!Reciver.reciverFinished) {
			balance += depositMoney;
			System.out.println(name + "存了" + depositMoney + "，帳戶共有：" + balance);
			
			notify();
			System.out.println("熊大被媽媽告知帳戶已有錢！");
		}
		
	}

}

class Reciver extends Thread {
	private Bank bank;
	public static boolean reciverFinished = false;
	
	public Reciver(String name, Bank bank) {
		super(name);
		this.bank = bank;
	}
	
	public void run() {
		int reciveMoney = 1000;
		
		for (int i = 1; i <= 10; i++) {			
			bank.recive(getName(), reciveMoney, 2000);

			if (i == 10 && !Depositer.depositerFinished) {
				System.out.println("領錢已經執行10次了！程式結束。");
			}
			
		}
		reciverFinished = true;
	}
	
}

class Depositer extends Thread {
	Bank bank;
	public static boolean depositerFinished = false;
	
	public Depositer(String name, Bank bank) {
		super(name);
		this.bank = bank;
	}
	
	public void run() {
		int depositMoney = 2000;
		
		for (int i = 1; i <= 10; i++) {
			bank.deposit(getName(), depositMoney, 3000);
			
			if (i == 10 && !Reciver.reciverFinished) {
				System.out.println("存錢已經執行10次了！程式結束");
			}
			
		}
		depositerFinished = true;
	}
}
