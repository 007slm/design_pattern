package visitor;

/**
 * 具体元素角色（Concrete Element）：实现由元素角色提供的Accept 操作。
 * 
 * @author yanbin
 * 
 */
public class PartB implements Element {

	String s = "PartB";

	public void accapt(Visitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return s;
	}

}