package templet;

/**
 * 继承模板的子类
 * 
 * @author yanbin
 * 
 */
public class BDriver extends DriveCar {

	@Override
	public void openDoor() {
		System.out.println("B师傅是撬开门的！");
	}

	@Override
	public void touchPower() {
		System.out.println("B师傅开到了160迈！");
	}

}
