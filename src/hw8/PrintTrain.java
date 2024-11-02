package hw8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// 請寫一隻程式，能印出不重複的Train物件
// 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
//• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
//• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

public class PrintTrain {
//	private static Set<Train> hashTrains;
	
	public void printTrainNoRep(Set<Train> set) {
		// 1. 請寫一隻程式，能印出不重複的Train物件
		// 練習Iterator取值法
		Iterator<Train> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------------");
		
		// 練習for-each寫法
		for (Train tr : set) {
			System.out.println(tr);
		}
		
		// Set不能用傳統for迴圈
	}
	
	public void printTrainByOrd(Train[] arr){
		// 2. 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		Arrays.sort(arr);
		
		// 練習傳統for取值
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------------------------------");

		// for each 取值
		for (Train tr : arr) {
			System.out.println(tr);
		}
	}
	
	public void printTrainNoRepByOrd(Set<Train> set) {
		// 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		
		// 練習Iterator取值法
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------------");
		
		// for each
		for (Train tr : set) {
			System.out.println(tr);
		}
		
	}
	

	public static void main(String args[]) {
		PrintTrain pt = new PrintTrain();
		
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		Set<Train> hashTrains = new HashSet<>();
		hashTrains.add(t1);
		hashTrains.add(t2);
		hashTrains.add(t3);
		hashTrains.add(t4);
		hashTrains.add(t5);
		hashTrains.add(t6);
		hashTrains.add(t7);
		pt.printTrainNoRep(hashTrains);
		
		System.out.println("=============================");
		
		Train[] trains = new Train[7];
		trains[0] = t1;
		trains[1] = t2;
		trains[2] = t3;
		trains[3] = t4;
		trains[4] = t5;
		trains[5] = t6;
		trains[6] = t7;
		pt.printTrainByOrd(trains);
		
		System.out.println("=============================");

		Set<Train> treeTrain = new TreeSet<>();
		treeTrain.add(t1);
		treeTrain.add(t2);
		treeTrain.add(t3);
		treeTrain.add(t4);
		treeTrain.add(t5);
		treeTrain.add(t6);
		treeTrain.add(t7);
		pt.printTrainNoRepByOrd(treeTrain);
		
		
		
		
		
		
//		Train tr = new Train();
//		tr.main(args);
//		
//		Set<Train> t = tr.getHashTrains();
//		System.out.println(t);
		
	}
}
