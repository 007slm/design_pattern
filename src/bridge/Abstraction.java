package bridge;

/**
 * 抽象角色：它定义了抽象类的接口而且维护着一个指向实现 （Implementor）角色的引用。
 * 
 * @author yanbin
 * 
 */
public class Abstraction {

	/** 实现角色 */
	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	/**
	 * 操作方法，核心在这边，前端的接口实现调用后端的实现。
	 */
	public void operation() {
		implementor.operation();
	}

	/**
	 * 用于继承类来获取实现角色
	 * 
	 * @return
	 */
	protected Implementor getImplementor() {
		return implementor;
	}

}
