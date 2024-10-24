package hw7;
//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	public void copyFile(File origFile, File targetFile) throws IOException {
		
		FileInputStream fr = new FileInputStream(origFile);
		FileOutputStream wr = new FileOutputStream(targetFile);
		int cha;
		
		int i = 0;
		byte ch[] = new byte[(int)origFile.length()];
		while ((cha = fr.read()) != -1) {
			wr.write(cha);
			ch[i++] = (byte) cha;
		}
		
		System.out.flush();
		
		wr.close();
		fr.close();

	}
	
//	public static void main(String[] args) throws IOException {
//		CopyFile cf = new CopyFile();
//		File f1 = new File("01.png");
//		File f2 = new File("02.png");
//		
//		cf.copyFile(f1, f2);
//	}
	
}
