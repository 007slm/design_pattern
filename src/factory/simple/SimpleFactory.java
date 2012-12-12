package factory.simple;

/**
 * 静态工厂模式，简单工厂模式<br/>
 * 1、存在的目的很简单：定义一个用于创建对象的接口。<br/>
 * 2、组成： 工厂类角色，核心 ；抽象产品角色 和 具体产品角色 。<br/>
 * 3、从开闭原则（对扩展开放；对修改封闭）<br/>
 * 4、缺点，在每增加一个具体产品就要修改工厂类。这样虽然可以扩展，但是不利于扩展
 * 
 * @author yanbin
 * 
 */
public class SimpleFactory {

	/**
	 * 测试方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Car car = DriverFactory.driverCar("Benz");
			car.driver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}