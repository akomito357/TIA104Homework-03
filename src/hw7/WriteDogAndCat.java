package hw7;
//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteDogAndCat {
	private File file = new File("C:\\data\\Object.ser");
	
	public Object[] setObjects() {
		// check if data folder is exist 
		File folder = new File("C:\\data");
		if (! folder.exists()) {
			folder.mkdir();
		}
		
		// set objects
		Object[] pets = new Object[4];
		pets[0] = new Dog("dog1");
		pets[1] = new Dog("doooooooooog2");
		pets[2] = new Cat("cat1");
		pets[3] = new Cat("cat2");
		
		return pets;
	}
	
	public void outputObjects(File file, Object[] obj) {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			for (int i = 0; i < obj.length; i++) {
				oos.writeObject(obj[i]);
			}
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		WriteDogAndCat wr = new WriteDogAndCat();
		Object[] pets = wr.setObjects();
		wr.outputObjects(wr.file, pets);
	}
	
}
