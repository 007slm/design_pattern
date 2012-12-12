package interpreter;

/**
 * 解释器模式：定义语言的文法，并且建立一个解释器来解释该语言中的句子。它属于类的行为模式。
 * 组成：抽象表达式角色；终结符表达式角色；非终结符表达式角色；上下文环境角色；客户角色。
 * 优点：解释器模式提供了一个简单的方式来执行语法，而且容易修改或者扩展语法。<br>
 * 缺点：解释器模式对于复杂文法难以维护。
 * 
 * @author yanbin
 * 
 */
public class InterpreterPattern {

	private static Expression exp;
	private static Context ctx;

	public static void main(String[] args) {
		ctx = new Context();
		// 设置变量、常量
		Variable a = new Variable();
		Variable b = new Variable();
		Constant c = new Constant(2);
		// 为变量赋值
		ctx.addValue(a, 6);
		ctx.addValue(b, 7);
		// 运算，对句子的结构由我们自己来分析，构造
		exp = new Division(new Multiply(a, b), new Add(new Subtract(a, b), c));
		System.out.println("运算结果为：" + exp.interpret(ctx));
	}

}
