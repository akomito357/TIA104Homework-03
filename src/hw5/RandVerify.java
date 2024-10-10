package hw5;
/*
身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法genAuthCode()，
當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合
*/

public class RandVerify {
	
	public static void main(String[] args) {
		RandVerify code1 = new RandVerify();
		String authCode = code1.genAuthCode();
		System.out.println("本次隨機產生的驗證碼為：" + "\n" + authCode);
	}
	
	public String genAuthCode() {
		// ASCII code: 0~9 = 48~57, A~Z = 65~90, a~z = 97~122
		// random 48~122
		char[] codeArray = new char[8];
		int ranInt = 0;
		
		for (int i = 0; i < codeArray.length;) {
			ranInt = (int)(Math.random() * 75 + 48);
			if ((ranInt >= 48 && ranInt <= 57) || (ranInt >= 65 && ranInt <= 90) || (ranInt >= 97 && ranInt <=122)) {
				codeArray[i] = (char)ranInt;
				i++;
			}
		}
		
		String code = new String(codeArray);
		return code;
	}

}
