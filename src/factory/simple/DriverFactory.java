package factory.simple;

/**
 * 工厂类角色：开车工厂
 * 
 * @author yanbin
 * 
 */
public class DriverFactory {

	/**
	 * 工厂方法：注意返回类型为抽象产品角色
	 * 
	 * @param car
	 * @return
	 * @throws Exception
	 */
	public static Car driverCar(String car) throws Exception {
		// 判断逻辑，返回具体的产品角色给Client
		if (car.equalsIgnoreCase("Benz")) { // equalsIgnoreCase:String类的方法，两个字符串比较，不考虑大小写
			return new Benz();
		}
		if (car.equalsIgnoreCase("Bmw")) {
			return new Bmw();
		}
		if (car.equalsIgnoreCase("Audo")) {
			return new Audo();
		}
		throw new Exception();
	}

}
