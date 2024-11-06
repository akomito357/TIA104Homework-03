package hw9;

public class TestBank {

	public static void main(String[] args) throws InterruptedException {
		Bank bank = new Bank();
		Reciver bear = new Reciver("熊大", bank);
		Depositer mom = new Depositer("媽媽", bank);
		
		bear.start();
		mom.start();
				
		
	}
	
	
}
