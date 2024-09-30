package hw2;

public class OneToTenWhileLoop {

	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int i = 1;
		int sum = 1;
		while (i<=10) {
			sum = sum * i;
			i++;
		}
		System.out.println(sum);
	}
}
