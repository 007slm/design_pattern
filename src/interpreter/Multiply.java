package interpreter;

/**
 * 非终结符表达式角色：具体表达式。乘
 * 
 * @author yanbin
 * 
 */
public class Multiply implements Expression {

	private Expression left, right;

	public Multiply(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public Integer interpret(Context con) {
		return left.interpret(con) * right.interpret(con);
	}

}