package interpreter;

/**
 * 抽象表达式角色：声明一个抽象的解释操作，这个接口为所有具体表达式角色（抽象语法树中的节点）都要实现的。
 * 
 * @author yanbin
 * 
 */
public interface Expression {

	/**
	 * 抽象解释方法
	 * 
	 * @param ctx
	 * @return
	 */
	public Integer interpret(Context ctx);

}
