package memento;

/**
 * 备忘录管理者（Caretaker）角色：负责保存好备忘录。不能对备忘录的内容进行操作 或检查。
 * 
 * @author yanbin
 * 
 */
public class Caretaker {

	private MementoIF m;

	public void saveMemento(MementoIF m) {
		this.m = m;
	}

	public MementoIF getMemento() {
		return m;
	}

}
