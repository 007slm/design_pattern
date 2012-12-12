package command;

/**
 * 具体命令对象
 * 
 * @author yanbin
 * 
 */
public class TurnOffCommand implements Command {

	private Receiver receiver;

	public TurnOffCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	/**
	 * 执行命令
	 */
	public void execute() {
		receiver.turnOff();
	}

}
