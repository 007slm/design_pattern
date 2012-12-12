package strategy;

/**
 * 策略模式（Strategy）：属于对象行为型设计模式，主要是定义一系列的算法，把这些算法一个个封装成拥有共同接口的单独的类，并且使它们之间可以互换。<br>
 * 组成：算法使用环境(Context)角色；抽象策略(Strategy)角色；具体策略(Concrete Strategy)角色。
 * 
 * @author yanbin
 * 
 */
public class StrategyPattern {

	public static void main(String[] args) {

		Context context;

		// Three contexts following different strategies
		context = new Context(new FirstStrategy());
		context.execute();

		context = new Context(new SecondStrategy());
		context.execute();

		context = new Context(new ThirdStrategy());
		context.execute();

	}

}
