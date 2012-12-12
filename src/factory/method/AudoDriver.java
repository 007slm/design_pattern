package factory.method;

/**
 * 具体工厂角色:Audo
 * 
 * @author yanbin
 * 
 */
public class AudoDriver implements Driver {

	public Car driverCar() {
		return new Audo();
	}

}