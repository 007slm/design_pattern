package interpreter;

/**
 * 非终结符表达式角色：具体表达式。 除
 * 
 * @author yanbin
 * 
 */
public class Division implements Expression {

	private Expression left, right;

	public Division(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public Integer interpret(Context con) {
		try {
			return left.interpret(con) / right.interpret(con);
		} catch (ArithmeticException ae) {
			System.out.println("被除数为0！");
			return -11111;
		}
	}

}
