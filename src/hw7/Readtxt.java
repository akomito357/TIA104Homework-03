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
		int countWords2 = 0;
		int countLines = 0;

		
		try {
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String line;
			int i;
			while ((line = br.readLine()) != null) {
				countWords += line.length();
				countLines ++;
			}
//			while ((i = br.read()) != -1) {
//				countWords2 ++;
//			}
			
			
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sample.txt檔案共有" + fileSize + "個位元組，" + countWords + "個字元，" + countLines + "列資料。");
//		System.out.println("這次有" + countWords2 + "個字");
		
		
//		用readline()、read()、記事本、word算出來的字數都不一樣
		
	}
	
}
