package builder;

/**
 * 具体建造者角色：担任这个角色的是于应用程序紧密相关的类，它们在指导者的调用下 创建产品实例。这个角色在实现抽象建造者角色提供的方法的前提下，达到完成产品组
 * 装，提供成品的功能。
 * 
 * @author yanbin
 * 
 */
public class ConcreteBuilder implements Builder {

	private PartA partA;
	private PartB partB;
	private PartC partC;

	public void buildPartA() {
		System.out.println("build partA");
		partA = new PartA();
	}

	public void buildPartB() {
		System.out.println("build partB");
		partB = new PartB();
	}

	public void buildPartC() {
		System.out.println("build partC");
		partC = new PartC();
	}

	public Product getResult() {
		Product product = new Product(partA, partB, partC);
		return product;
	}

}
