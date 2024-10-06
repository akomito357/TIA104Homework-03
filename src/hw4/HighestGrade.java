package hw4;
//班上有8位同學,他們進行了6次考試結果如下:
//請算出每位同學考最高分的次數



public class HighestGrade {
		
	public static void main(String[] args) {
		HighestGrade hg = new HighestGrade();
		int[][] eachTest= {{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95}, 
				{100, 70, 79, 90, 75, 70, 79, 90}, 
				{77, 95, 70, 89, 60, 75, 85, 89}, 
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}};
		hg.countHighest(eachTest);
	}

	public void countHighest(int[][] tests) {
		int[] stu = new int[8]; // 存放每個學生最高分的次數
		for (int i = 0; i < tests.length; i++) {
			int highestGrade = 0;
			int highestStu = 0;
			for (int j = 0; j < tests[i].length; j++) {
				if (tests[i][j] > highestGrade) {
					highestGrade = tests[i][j];
					highestStu = j;
				}
			}
			stu[highestStu]++;
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.println((i + 1) + "號學生總共考" + stu[i] + "次最高分");
		}
	}
	
}
