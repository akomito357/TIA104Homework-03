package hw7;
// 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)
// 承 WriteDogAndCat.java

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadDogAndCat {
	private File file = new File("C:\\data\\Object.ser");
	
	public void readObjects(File file) {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			System.out.println("Listen!!!!!!!" + "\n");
			try {
				while (true) {
					((Pet) ois.readObject()).speak();
				}
			} catch (EOFException e) {
				System.out.println("\n" + "All the pets have spoken.");
			}
			
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		ReadDogAndCat re = new ReadDogAndCat();
		re.readObjects(re.file);
	}
	
}
