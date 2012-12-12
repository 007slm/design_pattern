package strategy;

/**
 * 具体策略(Concrete Strategy)角色：实现了抽象策略角色定义的接口。第一策略
 * 
 * @author yanbin
 * 
 */
public class FirstStrategy implements Strategy {

	public void execute() {
		System.out.println("Called FirstStrategy.execute()");
	}

}