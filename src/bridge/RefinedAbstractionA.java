package bridge;

/**
 * 精确抽象角色：实现并扩充由抽象角色定义的接口。
 * 
 * @author yanbin
 * 
 */
public class RefinedAbstractionA extends Abstraction {

	/**
	 * 精确抽象，修正抽象
	 * 
	 * @param implementor
	 */
	public RefinedAbstractionA(Implementor implementor) {
		super(implementor);
	}

	public void correct() {
		System.out.println("correct method");
	}

}
