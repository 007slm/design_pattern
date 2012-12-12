package command;

/**
 * 请求调用者：调用命令对象执行这个请求。
 * 
 * @author yanbin
 * 
 */
public class Invoker {
	private Command turnOffCommand;
	private Command turnOnCommand;

	public Command getTurnOffCommand() {
		return turnOffCommand;
	}

	public void setTurnOffCommand(Command turnOffCommand) {
		this.turnOffCommand = turnOffCommand;
	}

	public Command getTurnOnCommand() {
		return turnOnCommand;
	}

	public void setTurnOnCommand(Command turnOnCommand) {
		this.turnOnCommand = turnOnCommand;
	}

	public void turnUp() {
		turnOnCommand.execute();
	}

	public void turnDown() {
		turnOffCommand.execute();
	}
}
