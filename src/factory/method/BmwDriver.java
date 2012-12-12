package factory.method;

/**
 * 具体工厂角色:BMW
 * 
 * @author yanbin
 * 
 */
public class BmwDriver implements Driver {

	public Car driverCar() {
		return new Bmw();
	}

}