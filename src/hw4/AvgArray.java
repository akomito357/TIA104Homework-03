package hw4;
//有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

public class AvgArray {
	private int[] arr = null;
	private double avg;
	
	public AvgArray(int[] arr_parm){
		this.arr = arr_parm;
	}

	public static void main(String[] args) {		
		int a[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		AvgArray nums = new AvgArray(a);
		nums.setArray(a);
		nums.calcAvg(nums.getArray());
		nums.printGreaterNums(nums.getArray(), nums.avg);
	}
	
	public void calcAvg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		this.avg = sum / arr.length;
		System.out.println("此陣列元素平均值：" + avg);
		System.out.println("===================");
	}
	
	public void printGreaterNums(int[] arr, double avg) {
		System.out.print("比平均值大的元素包括：");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				System.out.print(arr[i] + "\t");
			}
		}
	}
	
	public void setArray(int[] arr) {
		this.arr = arr;
	}
	
	public int[] getArray() {
		return arr;
	}
	
	
}
