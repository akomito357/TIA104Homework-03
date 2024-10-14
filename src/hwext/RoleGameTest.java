package hwext;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
		saber.setAttackBehavior(new AttackSword());
		// 用 new 是因為要新增物件？ IAttackBehavior a = new AttackSword() 的感覺？
		// 此時(感覺)是以subclass AttackSword創建實體，並實作IAttackBehavior (???)
		saber.setDefendBehavior(new DefendBasic());
		saber.setMoveBehavior(new MoveRun());
		
		archer.setAttackBehavior(new AttackArrow());
		archer.setDefendBehavior(new DefendBasic());
		archer.setMoveBehavior(new MoveRun());
		
		saber.attack();
		saber.defend();
		saber.move();
		
		archer.attack();
		archer.move();
		archer.defend();
	}

}
