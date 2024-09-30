package hw1;

public class CompoundInterest {
	public static void main(String[] args) {
		
/*		某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
 *		金加利息共有多少錢
 *		複利公式：FV ＝ PV×（1 ＋ R）n 次方（FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數）
 */
	
		int pv = 1500000;
		double interest = 0.02;
		int periods = 10;
		
		double fv = pv * Math.pow(1 + interest, periods);
		System.out.println("本利共為：" + fv + "元");
	}

}
