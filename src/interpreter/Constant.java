package interpreter;

/**
 * 终结符表达式角色：具体表达式。 <br>
 * a) 实现与文法中的终结符相关联的解释操作 <br>
 * b) 而且句子中的每个终结符需要该类的一个实例与之对应
 * 
 * @author yanbin
 * 
 */
public class Constant implements Expression {

	private Integer i;

	public Constant(Integer i) {
		this.i = i;
	}

	public Integer interpret(Context ctx) {
		return i;
	}

}
