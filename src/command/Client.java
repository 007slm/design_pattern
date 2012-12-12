package command;

import java.util.Scanner;

/**
 * 客户角色：创建一个具体命令对象（并可以设定它的接收者）。
 * 
 * @author yanbin
 * 
 */
public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command turnOn = new TurnOnCommand(receiver);
		Command trunOff = new TurnOffCommand(receiver);

		Invoker invoker = new Invoker();
		invoker.setTurnOnCommand(turnOn);
		invoker.setTurnOffCommand(trunOff);

		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		try {
			if ("ON".equals(input)) {
				invoker.turnUp();
			} else if ("OFF".equals(input)) {
				invoker.turnDown();
			} else {
				System.out.println("Argument \"ON\" or \"OFF\" is required.");
			}
		} catch (Exception e) {
			System.out.println("Arguments required.");
		}
	}
}
