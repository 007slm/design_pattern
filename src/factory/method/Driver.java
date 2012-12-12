package factory.method;

/**
 * 抽象工厂角色。统一管理实现的工厂
 * 
 * @author yanbin
 * 
 */
public interface Driver {

	/**
	 * 用于不同的工厂，获取不同的产品
	 * 
	 * @return
	 */
	public Car driverCar();

}
