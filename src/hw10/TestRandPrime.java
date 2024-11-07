package hw10;

public class TestRandPrime {
	public static void main(String args[]) {
		RandPrime rp = new RandPrime();
		rp.makeRandNum();
		
		for (int num : rp.getNumSet()) {
			if (rp.isPrime(num)) {
				System.out.println(num + "是質數");
			} else {
				System.out.println(num + "不是質數");
			}
		}
		
	}
}
