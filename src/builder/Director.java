package builder;

/**
 * 指导者角色（也叫上下文）：调用具体建造者角色以创建产品对象。指导者并没有产品类的具体知识， 真正拥有产品类的具体知识的是具体建造者对象。
 * 
 * @author yanbin
 * 
 */
public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	// 将部件partA partB partC最后组成复杂对象
	// 这里是将车轮 方向盘和发动机组装成汽车的过程
	public void construct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
	}

}