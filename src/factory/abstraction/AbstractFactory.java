package factory.abstraction;

public class AbstractFactory {

	/**
	 * 抽象工厂模式<br>
	 * 1、Java 的反射机制与配置文件的巧妙结合突破了工厂代码扩展的限制。<br>
	 * 2、组成：抽象工厂角色：核心、具体工厂角色、抽象产品角色、具体产品角色 <br>
	 * 3、抽象工厂就相当于，把不同的工厂再抽象起来一个公用的工厂。<br>
	 * 4、工厂方法模式是用来创建一个产品的等级结构的，而抽象工厂模式是用来创建多个产品的等级结构
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 对象名，要在反射的时候输入名称，名称需要在SRC文件下的全路径
		AbstractDriver driver = AbstractDriver.getInstance("designPattern.factory.abstraction.BmwDriver");
		Car car = driver.driverCar();
		Bus bus = driver.driverBus();
		car.driver();
		bus.driver();
	}

}
