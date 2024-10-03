package hw3;
import java.util.Scanner;
import java.util.Arrays;
//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
//三角形定義：a+b>c, a-b<c
//(進階功能:加入直角三角形的判斷)

public class Triangle {
	private double[] lens;
	private boolean isTri;
	
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.setSideLength();
		tri.isTriangle(tri.getSideLength());
		tri.isRightTri(tri.isTri, tri.getSideLength());
	}
	
	public void setSideLength() {
		lens = new double[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input three numbers: ");
		for (int i = 0; i <= 2; i++) {
			lens[i] = sc.nextDouble();
		}
	}
	
	public double[] getSideLength() {
		return lens;
	}
	
	public void isTriangle(double[] len) {
		Arrays.sort(len);
		if (len[0] + len[1] > len[2] && len[2] - len[1] < len[0]) {
			isTri = true;
			if (len[0] == len[1] && len[1] == len[2]) {
				System.out.println("正三角形");
			} else if (len[0] == len[1] || len[1] == len[2] || len[0] == len[2]) {
				System.out.println("等腰三角形");
			} else {
				System.out.println("其它三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
	}
	
	public void isRightTri(boolean istri, double[] len) {
		Arrays.sort(len);
		if (istri) {
			if (len[0] * len[0] + len[1] * len[1] == len[2] * len[2]) {
				System.out.println("是直角三角形");
			} else {
				System.out.println("不是直角三角形");
			}
		}
	}
}
