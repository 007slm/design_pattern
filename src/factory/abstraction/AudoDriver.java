package factory.abstraction;

/**
 * 具体工厂：Audo
 * 
 * @author yanbin
 * 
 */
public class AudoDriver extends AbstractDriver {

	@Override
	public Bus driverBus() {
		return new AudoBus();
	}

	@Override
	public Car driverCar() {
		return new AudoCar();
	}

}
