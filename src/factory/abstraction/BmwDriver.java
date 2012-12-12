package factory.abstraction;

/**
 * 具体工厂：生产bmw
 * 
 * @author yanbin
 * 
 */
public class BmwDriver extends AbstractDriver {

	@Override
	public Bus driverBus() {
		return new BmwBus();
	}

	@Override
	public Car driverCar() {
		return new BmwCar();
	}
}
