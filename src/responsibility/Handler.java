package responsibility;

/**
 * 抽象处理器
 * 
 * @author yanbin
 * 
 */
public interface Handler {

	/**
	 * 实现的抽象处理方法
	 * 
	 * @param testObject
	 * @return
	 */
	public String dealWith(Long testObject);

}
