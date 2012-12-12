package responsibility;

/**
 * 具体处理类
 * 
 * @author yanbin
 * 
 */
public class HandlerImplTwo implements Handler {

	private Handler handler = new HandlerImplThree();

	public String dealWith(Long testObject) {
		if (testObject > 8) {
			return "大于8跳出了！";
		}
		return handler.dealWith(testObject);
	}

}
