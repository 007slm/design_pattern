package visitor;

/**
 * 访问者模式：表示一个作用于某对象结构中的各元 素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * 可以在不修改已有程序结构的前提下，通过 添加额外的“访问者”来完成对已有代码功能的提升。 适用于频繁修改需求，导致零散的类修改
 * 组成：访问者角色（Visitor）；具体访问者角色（Concrete Visitor）；元素角色（Element）；具体元素角色（Concrete
 * Element）；对象结构角色（Object Structure）；<br>
 * 使用场景：一个对象结构包含很多类对象，它们有不同的接口，而你想对这些对象实施一些依赖于其具体类的操作。
 * 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而你想避免让这些操 作“污染”这些对象的类。<br>
 * 当该对象结构被很多应用共享时，用Visitor模式让每个应用仅包含需要用到的操作。<br>
 * 定义对象结构的类很少改变，但经常需要在此结构上定义新的操作。
 * 
 * @author yanbin
 * 
 */
public class VisitorPattern {

	public static void main(String[] args) {
		Visitor ceo = new VisitorCEO();
		Visitor a = new VisitorA();
		Visitor b = new VisitorB();
		Element pa = new PartA();
		Element pb = new PartB();
		ObjectStructure os = new ObjectStructure();

		os.addVisitor(pa);
		os.addVisitor(pb);
		os.accapt(ceo);
		os.accapt(a);
		os.accapt(b);
	}

}
