package hw10;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//請設計一隻程式，用亂數產生5個介於1～100之間的整數，
//而輸出結果可以判斷出這5個整數為是否為質數 (提示：Math類別)

public class RandPrime {
	private Set<Integer> numSet = new HashSet<>();

	public RandPrime() {
		
	}
	
	public Set<Integer> getNumSet(){
		return numSet;
	}
	
	public void makeRandNum(){
		int randMin = 1;
		int randMax = 100;
		Random rand = new Random();
		
		while (numSet.size() < 5) {
			int randNum = rand.nextInt(randMax - randMin + 1) + randMin;
			numSet.add(randNum);
		}
	}
	
	public boolean isPrime(int num) {
		// if it's less than 2, return false. (because 1 is not a prime).
		if (num < 2) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
			
		return true;
	}
	
	


}
