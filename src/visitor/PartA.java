package visitor;

/**
 * 具体元素角色（Concrete Element）：实现由元素角色提供的Accept 操作。
 * 
 * @author yanbin
 * 
 */
public class PartA implements Element {

	String s = "PartA";

	public void accapt(Visitor visitor) {
		// 关键实现
		visitor.visit(this);
	}

	public String getName() {
		return s;
	}

}