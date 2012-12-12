package adapter;

/**
 * 适配器角色：这个适配器模式的核心。它将被适配角色已有的接口转换为目标 角色希望的接口。 <br>
 * 分类：将适配器模式分为类适配器模式和对象适配器模式。 区别在于被适配的角色通过继承完成的还是通过组合来完成的。（不提倡继承）
 * 
 * @author yanbin
 * 
 */
public class Adapter implements Target {

	/**
	 * 持有需要被适配的接口对象
	 */
	private Adaptee adaptee;

	/**
	 * 构造方法，传入需要被适配的对象
	 * 
	 * @param adaptee
	 *            需要被适配的对象
	 */
	public Adapter(Adaptee adaptee) { // 组合的方式
		this.adaptee = adaptee;
	}

	/**
	 * 其实本质上，重新写一个方法 来调用需要适配的方法
	 */
	public void request() {
		System.out.println("this is in Adapter!");
		// 可能转调已经实现了的方法，进行适配
		adaptee.specificRequest();
	}

}
