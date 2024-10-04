package hw4;
//請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH

public class ReverseStr {
	private String str;
	
	public ReverseStr(String str) {
		this.str = str;
	}
	
	public ReverseStr() {
		this("Hello World");
	}
	
	public static void main(String[] args) {
		ReverseStr rev = new ReverseStr();
		rev.reverse(rev.str);
	}
	
	public void reverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
