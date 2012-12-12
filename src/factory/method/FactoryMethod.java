package factory.method;

/**
 * 工厂方法模式<br/>
 * 1、工厂方法模式去掉了简单工厂模式中工厂方法的静态属性，使得它可以被子类继承。<br/>
 * 2、组成：抽象工厂角色，工厂方法模式的核心。具体工厂角色、抽象产品角色、具体产品角色 。<br/>
 * 3、将多态发挥到淋漓尽致<br/>
 * 4、优点：用工厂方法统一管理工厂生产，不需要在一个工厂类中扩展代码。可扩展比较好。<br>
 * 5、缺点：数量成倍增长。当产品种类非常多时，会出现大 量的与之对应的工厂对象。
 * 6、使用情况：当客户程序不需要知道要使用对象的创建过程；客户程序使用的对象存在变动的可能，或者根本就不知道使用哪一个具体的对象。
 * 
 * 
 * @author yanbin
 * 
 */
public class FactoryMethod {

	/**
	 * 测试方法
	 */
	public static void main(String[] args) {
		// 利用抽象工厂，new一个具体工厂，获取具体的产品
		Driver driver = new BenzDriver();
		Car car = driver.driverCar();
		// 利用抽象的产品，根据具体产品进行生产
		car.driver();
	}

}