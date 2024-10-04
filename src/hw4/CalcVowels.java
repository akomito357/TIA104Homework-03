package hw4;
//有個字串陣列如下 (八大行星):
//{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)


public class CalcVowels {
	public static final String[] vowels = {"a", "e", "i", "o", "u"};
	public static final char[] vowelsChar = {'a', 'e', 'i', 'o', 'u'};
	
	public static void main(String[] args) {
		CalcVowels plants = new CalcVowels();
		String[] strArr = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		plants.countVowels(strArr);
//		plants.countVowelsChar(strArr);
	}
	
	public void countVowels(String[] arr) {
		int totalVowels = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				String[] plant = arr[i].split("");
				for (int k = 0; k < vowels.length; k++) {
					if (plant[j].equals(vowels[k])) {
						totalVowels += 1;
					}
				}
			}
		}
		System.out.println("一共有" + totalVowels + "個母音");
	}
	
//	好像下面這個方法也可以……？使用char比對，母音陣列使用vowelsChar
	public void countVowelsChar(String[] arr) { 
		int totalVowels = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				for (int k = 0; k < vowels.length; k++) {				
					if ((arr[i].charAt(j)) == vowelsChar[k]) {
						totalVowels += 1;
					}
				}
			}
		}
		System.out.println("一共有" + totalVowels + "個母音");
	}
	
}
