package command;

/**
 * 具体命令角色：将一个接收者对象绑定于一个动作；调用接收 者相应的操作，以实现命令角色声明的执行操作的接口。
 * 
 * @author yanbin
 * 
 */
public class TurnOnCommand implements Command {

	private Receiver receiver;

	public TurnOnCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	/**
	 * 执行命令
	 */
	public void execute() {
		receiver.turnOn();
	}

}
