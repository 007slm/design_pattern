package builder;

/**
 * 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建 过程可以创建不同的表示。将构造复杂对象的过程和组成对象的部件解耦。
 * 运用场景：本来只由一个小对象组成的逻辑，后来更改后需要多个小对象组成。 且不能把内部暴露客户程序。兼得可用性和安全 <br/>
 * 和抽象工厂的区别：了将构建复杂对象的过程和它的部件解耦.注意: 是解耦过程和部件。建造者多出一个指导者的角色。创建模式着重于逐步将组件装配
 * 成一个成品并向外提供成品，而抽象工厂模式着重于得到产品族中相关的多个产品对象<br>
 * 
 * 组成：抽象建造者角色，具体建造者角色，指导者角色，产品角色
 * 
 * @author yanbin
 * 
 */
public class BuilderPattern {

	public static void main(String[] args) {
		// 多态创建建造者（部件）
		Builder builder = new ConcreteBuilder();
		// 根据建造着实例化指导者 （构建过程）
		Director director = new Director(builder);
		// 利用指导者来创建
		director.construct();
		// 表现
		Product product = builder.getResult();
		System.out.println(product);
		System.out.println(product.getPartA());
		System.out.println(product.getPartB());
		System.out.println(product.getPartC());
	}

}
