package hw7; // 這隻程式是老師提供的

public class Dog implements Pet{
//	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
