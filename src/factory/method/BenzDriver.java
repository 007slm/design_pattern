package factory.method;

/**
 * 具体工厂角色:Benz
 * 
 * @author yanbin
 * 
 */
public class BenzDriver implements Driver {

	public Car driverCar() {
		return new Benz();
	}

}