package factory.abstraction;

/**
 * 具体工厂：产生Benz的产品
 * 
 * @author yanbin
 * 
 */
public class BenzDriver extends AbstractDriver {

	@Override
	public Bus driverBus() {
		return new BenzBus();
	}

	@Override
	public Car driverCar() {
		return new BenzCar();
	}
}
