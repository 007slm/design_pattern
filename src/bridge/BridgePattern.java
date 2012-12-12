package bridge;

/**
 * 桥梁模式：将抽象部分与它的实现部分分离，使它 们都可以独立地变化。 抽象和实现是组合的关系。<br>
 * 也就是说，实现部分是被抽象部分调用，以用来完成（实现） 抽象部分的功能。 组成：抽象角色；
 * 
 * @author yanbin
 * 
 */
public class BridgePattern {

	public static void main(String[] args) {
		Implementor implementorA = new ConcreteImplementorA();
		Abstraction abstractionA = new RefinedAbstractionA(implementorA);

		Implementor implementorB = new ConcreteImplementorB();
		Abstraction abstractionB = new RefinedAbstractionA(implementorB);

		implementorA.operation();
		implementorB.operation();
		abstractionA.operation();
		abstractionB.operation();
	}

}
