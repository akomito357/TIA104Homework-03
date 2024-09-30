package hw1;

public class CircleCaculator {
	public static void main(String[] args) {
		// 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周
		final double pi = 3.1415;
		
		int r = 5;
		double area = r * r * pi;
		double diameter = r * 2 * pi;
		
		System.out.printf("圓面積是 %.4f%n", area);
		System.out.printf("圓周長是 %.4f", diameter);
		
	}

}
