package interpreter;

/**
 * 终结符表达式角色：具体表达式。
 * 
 * @author yanbin
 * 
 */
public class Variable implements Expression {

	public Integer interpret(Context ctx) {
		// this 为调用interpret 方法的Variable 对象
		return ctx.LookupValue(this);
	}

}