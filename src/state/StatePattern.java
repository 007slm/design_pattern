package state;

/**
 * 状态模式：允许一个对象在其内部状态改变时改变它 的行为。状态模式可以有效的替换充满在程序中的 if else
 * 语句：将不同条件下的行为封装在一个类里面，再给这些类一个统一的父类来约束他们。<br>
 * 组成：使用环境（Context）角色；状态（State）角色；具体状态（Concrete State）角色。<br>
 * 使用场景：一个对象的行为取决于它的状态, 并且它必须在运行时刻根据状态改变它的行为。一个操作中含有庞大的多分支的条件语句，且这些分支依赖于该对象的状态。
 * 状态模式和策略模式的区别：区分这两个模式的关键是看行为是 由状态驱动还是由一组算法驱动；策略模式用来处理算法变化，而状态模式则是处理状态变化。
 * 策略模式中，算法是否变化完全是由客户程序开决定的，而且往往一次只能选择一种算 法，不存在算法中途发生变化的情况。
 * 而状态模式如定义中所言，在它的生命周期中存在着状态的转变和行为得更改，而且状 态变化是一个线形的整体；对于客户程序来言，这种状态变化往往是透明的。
 * 
 * @author yanbin
 * 
 */
public class StatePattern {

	public static void main(String[] args) {
		// 顺行起点first
		State state = new FirstState();
		Context ctx = new Context(state);

		for (int i = 0; i < 6; i++) {
			state = ctx.getState();
			System.out.print(state);
			if (state == null) {
				break;
			}
			System.out.print("->");
			// 顺流
			ctx.nextStep();
		}
		System.out.println("");

		// 逆行起点third
		state = new ThirdState();
		ctx = new Context(state);
		for (int i = 0; i < 6; i++) {
			state = ctx.getState();

			System.out.print(state);
			if (state == null) {
				break;
			}
			System.out.print("->");
			// 逆流
			ctx.lastStep();
		}
	}

}
