package strategy;

/**
 * 算法使用环境(Context)角色：算法被引用到这里和一些其它的与环境有关的操作一起 来完成任务。
 * 
 * @author yanbin
 * 
 */
// Configured with a ConcreteStrategy object and maintains a reference to a
// Strategy object
public class Context {

	Strategy strategy;

	// Constructor
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void execute() {
		this.strategy.execute();
	}

}