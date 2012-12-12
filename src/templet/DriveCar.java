package templet;

/**
 * 抽象模板类
 * 
 * @author yanbin
 * 
 */
public abstract class DriveCar {

	/**
	 * 开门
	 */
	public void openDoor() {
		System.out.println("模板共性，打开车门");
	}

	/**
	 * 开起电源
	 */
	public void startPower() {
		System.out.println("模板共性，开启电源");
	}

	/**
	 * 关门
	 */
	public void closeDoor() {
		System.out.println("模板共性，关闭车门");
	}

	/**
	 * 加油门
	 */
	public abstract void touchPower();

	/**
	 * 模板方法，流程控制
	 */
	public void run() {
		openDoor();
		closeDoor();
		startPower();
		touchPower();
	}

}
