package command;

/**
 * 命令角色（抽象类或接口）：声明执行操作的接口。有java 接口或者抽象类来实现
 * 
 * @author yanbin
 * 
 */
public interface Command {

	/**
	 * 命令执行方法
	 */
	public void execute();

}
