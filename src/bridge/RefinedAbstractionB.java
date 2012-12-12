package bridge;

/**
 * 精确抽象角色：实现并扩充由抽象角色定义的接口。
 * 
 * @author yanbin
 * 
 */
public class RefinedAbstractionB extends Abstraction {

	/**
	 * 精确抽象，修正抽象
	 * 
	 * @param implementor
	 */
	public RefinedAbstractionB(Implementor implementor) {
		super(implementor);
	}

	public void correct() {
		System.out.println("correct method");
	}

	// 这里是直接通过实现部分的方法来实现一定的功能
	@Override
	public void operation() {
		getImplementor().operation();
	}

}
