package responsibility;

/**
 * 具体处理类
 * 
 * @author yanbin
 * 
 */
public class HandlerImplThree implements Handler {

	public String dealWith(Long testObject) {
		if (testObject > 3) {
			return "大于3退出了！";
		}
		return "全部通过了！";
	}

}
