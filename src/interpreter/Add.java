package interpreter;

/**
 * 非终结符表达式角色：具体表达式。加
 * 
 * @author yanbin
 * 
 */
public class Add implements Expression {

	private Expression left, right;

	public Add(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public Integer interpret(Context ctx) {
		return left.interpret(ctx) + right.interpret(ctx);
	}

}