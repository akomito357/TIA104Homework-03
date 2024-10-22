package hw7;
//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class WriteRanNum {
	private Set<Integer> ranNum;

	public static void main(String[] args) {
		WriteRanNum wrn = new WriteRanNum();
		wrn.getRanNum();
		wrn.writeFile();
	}

	public void getRanNum() {
		ranNum = new TreeSet<>();

		while (ranNum.size() < 10) {
			ranNum.add((int) (Math.random() * 1000 + 1));
		}
	}

	public void writeFile() {
		try {
			Iterator iter = ranNum.iterator();

			FileOutputStream fos = new FileOutputStream("./files/Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);

			ps.print("這次產生的10個隨機數字是：");
			while (iter.hasNext()) {
				ps.print(iter.next());
				if (iter.hasNext()) {
					ps.print(", ");
				}
			}
			ps.println("");

			ps.close();
			bos.close();
			fos.close();
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
