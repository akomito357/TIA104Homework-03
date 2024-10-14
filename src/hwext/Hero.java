package hwext;

public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
	public IAttackBehavior attackBehavior;
	public IDefendBehavior defendBehavior;
	public IMoveBehavior moveBehavior;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public void setAttackBehavior(IAttackBehavior attackBehavior) {
		this.attackBehavior = attackBehavior;
	}
	
	public void setDefendBehavior(IDefendBehavior DefendBehavior) {
		this.defendBehavior = DefendBehavior;
	}
	
	public void setMoveBehavior(IMoveBehavior MoveBehavior) {
		this.moveBehavior = MoveBehavior;
	}
	
	public void attack() {
		attackBehavior.attack();
		// 以介面 IAttackBehavior 作為各攻擊方式的型別(?)，剛好也是這邊 attackBehavior 屬性變數的型別，代表此時等同於呼叫各攻擊方式類別裡的attack
		// 如ArrowMan的情況，此時此方法執行的會是AttackArrow.attack()，因為 AttackArrow 類別作為實作 IAttackBehavior 介面的類別，可以被傳入此方法。
		// 並且又執行了類別裡面的attack()方法
		// 就像是把所有攻擊方法都貼上IattackBehavior標籤，歸類為攻擊模式，並且都可以塞進 attackBehavior 裡。
		// 例如想讓人物使用火球術，也可以製作一個 FireBall 方法，實作IAttackBehavior介面，就可以塞進attackBehavior攻擊招式中。
	}
	
	public void move() {
		moveBehavior.move();
	}
	
	public void defend() {
		defendBehavior.defend();
	}
	
}
