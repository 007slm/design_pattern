package memento;

/**
 * 备忘发起（Originator）角色：“备忘发起角色”创建一个备忘录，用以记录当前时刻它 的内部状态。在需要时使用备忘录恢复内部状态。
 * 
 * @author yanbin
 * 
 */
public class Originator {

	// 这个是要保存的状态
	private int state = 90;
	// 保持一个“备忘录管理者角色”的对象
	private Caretaker c = new Caretaker();

	// 读取备忘录角色以恢复以前的状态
	public void getMemento() {
		Memento memento = (Memento) c.getMemento();
		state = memento.getState();
		System.out.println("the state is " + state + " now");
	}

	// 创建一个备忘录角色，并将当前状态属性存入，托给“备忘录管理者角色”存放。
	public void createMemento() {
		c.saveMemento(new Memento(state));
	}

	// 这是其他的业务方法
	// 他们也许会改变属性状态的值
	public void modifyState(int m) {
		state = m;
		System.out.println("the state is " + state + " now");
	}

	/**
	 * 作为私有内部类的备忘录角色，它实现了窄接口，可以看到在第二种方法中宽接口已经不再需要<br>
	 * 注意：里面的属性和方法都是私有的
	 * 
	 * @author yanbin
	 * 
	 */
	private class Memento implements MementoIF {

		// 这个state状态是对于备份这个类独有的。所以不会被随便改变
		private int state;

		private Memento(int state) {
			this.state = state;
		}

		private int getState() {
			return state;
		}

	}

}
