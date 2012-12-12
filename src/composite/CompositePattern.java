package composite;

/**
 * 组合模式：将对象以树形结构组织起来，以达成“部分－整体”的层次结构， 使得客户端对单个对象和组合对象的使用具有一致性。
 * 组成：抽象构件角色；树叶构件角色；树枝构件角色<br>
 * 组合模式中必须提供对子对象的管理方法，不然无法完成对子对象的添加删除等等操作，一种方式是在Component 里面声明所有的用来管理子类对象的方法，以达到
 * Component 接口的最大化（透明性）。另一种方式就是只在Composite 里面声明所有的用来管理子类对象的方法（安全性）。<br>
 * 优点：1、使客户端调用简单，客户端可以一致的使用组合结构或其中单个对象，用户就不必关心 自己处理的是单个对象还是整个组合结构，这就简化了客户端代码。
 * 2、更容易在组合体内加入对象部件. 客户端不必因为加入了新的对象部件而更改代码。这 一点符合开闭原则的要求<br>
 * 缺点：组合模式不容易限制组合中的构件。
 * 
 * @author yanbin
 * 
 */
public class CompositePattern {

	/**
	 * 测试制造一个属性的菜单
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 构造一个文件目录
		// 每次NEW一个枝点都会创建一个List，用来保存以下添加的子节点
		Root root1 = new Branch("c:\\"); // 这个就是跟节点了
		Root win1 = new Branch("windows");
		Root sys1 = new Branch("system");
		Root sys2 = new Branch("system2");
		Root hw1 = new Leafage("HelloWorld.java");
		root1.addNode(win1);
		root1.addNode(sys1);
		win1.addNode(hw1);
		win1.addNode(sys2);
		root1.display(0);
	}

}
