package responsibility;

/**
 * 具体处理角色
 * 
 * @author yanbin
 * 
 */
public class HandlerImplOne implements Handler {

	private Handler handler = new HandlerImplTwo();

	/**
	 * 递归调用
	 */
	public String dealWith(Long testObject) {
		if (testObject > 10) {
			return "大于10跳出！";
		}
		return handler.dealWith(testObject);
	}

}
