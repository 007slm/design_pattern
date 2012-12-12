package builder;

/**
 * 产品对象角色：建造中的复杂对象。它要包含那些定义组件的类，包括将这些组件装配成产 品的接口。 包括产品本身和装配方法<br>
 * 
 * @author yanbin
 * 
 */
public class Product {

	private PartA partA;

	private PartB partB;

	private PartC partC;

	/**
	 * 构造方法
	 * 
	 * @param partA
	 * @param partB
	 * @param partC
	 */
	public Product(PartA partA, PartB partB, PartC partC) {
		this.partA = partA;
		this.partB = partB;
		this.partC = partC;
	}

	public PartA getPartA() {
		return partA;
	}

	public void setPartA(PartA partA) {
		this.partA = partA;
	}

	public PartB getPartB() {
		return partB;
	}

	public void setPartB(PartB partB) {
		this.partB = partB;
	}

	public PartC getPartC() {
		return partC;
	}

	public void setPartC(PartC partC) {
		this.partC = partC;
	}

}
