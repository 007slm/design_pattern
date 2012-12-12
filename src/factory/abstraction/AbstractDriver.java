package factory.abstraction;

/**
 * 抽象工厂类。利用反射的机制获取产品对象
 * 
 * @author yanbin
 * 
 */
public abstract class AbstractDriver {

	public abstract Car driverCar();

	public abstract Bus driverBus();

	/**
	 * 利用反射获取抽象工厂
	 * 
	 * @param className
	 * @return
	 */
	public static AbstractDriver getInstance(String className) {
		AbstractDriver driver = null;
		try {
			driver = (AbstractDriver) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

}
