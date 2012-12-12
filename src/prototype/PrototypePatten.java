package prototype;

/**
 * 原型模式（clone）：属于对象创建模式，用原型实例指定创建对象的种类， 并且通过拷贝这些原型创建新的对象。<br>
 * 组成：客户角色，抽象原型角色，具体原型角色。原型管理器。<br>
 * 原型模式和工厂模式很类似：可以说原型模式就是在工厂模式的基础上加入了克 隆方法。<br>
 * 使用 clone 方法产生对象和new 一个对象的区别：原型模式使用clone 能够动态的抽取当前对象运行时的状态并且克隆到新的对象中，新
 * 对象就可以在此基础上进行操作而不损坏原有对象；而new 只能得到一个刚初始化的对象， 而在实际应用中，这往往是不够的。<br>
 * 原型模式主要的缺陷：就是每个原型必须含有clone 方法，在 已有类的基础上来添加clone 操作是比较困难的；而且当内部包括一些不支持copy 或者循
 * 环引用的对象时，实现就更加困难了。<br>
 * 由于 clone 方法在java 实现中有着一定的弊端和风险，所以clone 方法是不建议使用的。
 * 
 * @author yanbin
 * 
 */
public class PrototypePatten {

	public static void main(String[] args) {
		Client client = new Client();
		client.test();
	}

}
