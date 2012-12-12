package flyweight.complex;

/**
 * 具体享元角色：实现抽象角色规定的方法。如果存在内蕴状态，就负责为内蕴状态提供 存储空间。
 * 
 * @author yanbin
 * 
 */
public class ConcreteFlyweight implements Flyweight {

	private String data = null;

	public ConcreteFlyweight(String data) {
		this.data = data;
	}

	public void func() {
		System.out.println(this + ".func() : " + data);
	}

}