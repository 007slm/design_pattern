package adapter;

/**
 * 定义Client 使用的接口。与特定领域相关。<br>
 * Target 与 Adaptee 没有任何关系；Adaptee和Target中的方法既可以相同，也可以不同
 * 
 * @author yanbin
 * 
 */
public interface Target {

	/**
	 * 示意方法，客户端请求处理的方法
	 */
	public void request();

}
