package visitor;

/**
 * 元素角色（Element）：定义一个Accept 操作，它以一个访问者为参数。
 * 
 * @author yanbin
 * 
 */
public interface Element {

	public void accapt(Visitor visitor);

}
