package hw7;
//請自行建立一個文字檔Sample.txt
//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readtxt {

	public static void main(String[] args) {
		String userDirectoryPath = System.getProperty("user.dir");

		System.out.println("Current Directory = \"" + userDirectoryPath + "\"" );
		File f1 = new File("./files/Sample.txt");
		long fileSize = f1.length();
		int countWords = 0;
//		int countWords2 = 0;
//		int countSpace = 0;
		int countLines = 0;

		
		try {
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String line;
			int i;
			boolean inline = false;
			while (((i  = br.read()) != -1)) {
				countWords ++;
				if (i == '\n') {
					countLines ++;
					// 如果是最後一行，沒有換行符號，這樣會少算一行，還是要給他++行數
					inline = false;
				} else {
					inline = true;
				}
			}
			
			if (inline) {
				countLines ++;
			}
			
			
			
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sample.txt檔案共有" + fileSize + "個位元組，" + countWords + "個字元，" + countLines + "列資料。");	
		
//		在windows系統中，換行符號是'/r/n'，一共兩個字元，所以換行符號會多算一倍。
		
	}
	
}
