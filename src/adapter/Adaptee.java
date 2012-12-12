package adapter;

/**
 * 被适配的角色：这个角色有一个已存在并使用了的接口，而这个接口是需要我们 适配的
 * 
 * @author yanbin
 * 
 */
public class Adaptee {

	/**
	 * 示意方法，原本已经存在，已经实现的方法
	 */
	public void specificRequest() {
		// 具体的功能处理
		System.out.println("this is in Adaptee!");
	}

}
