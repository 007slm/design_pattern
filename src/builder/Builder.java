package builder;

/**
 * 抽象建造者角色：这个角色用来规范产品对象的各个组成成分的建造，与业务无关。
 * 
 * @author yanbin
 * 
 */
public interface Builder {

	// 创建部件A 比如创建汽车车轮
	public void buildPartA();

	// 创建部件B 比如创建汽车方向盘
	public void buildPartB();

	// 创建部件C 比如创建汽车发动机
	public void buildPartC();

	// 返回最后组装成品结果 (返回最后装配好的汽车)
	// 成品的组装过程不在这里进行,而是转移到下面的Director类中进行.
	// 从而实现了解耦过程和部件
	public Product getResult();

}
