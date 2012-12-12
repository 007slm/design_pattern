package flyweight.pure;

/**
 * 维护对所有享元对象的引用，而且还需要存储对应的外蕴状态。
 * 
 * @author yanbin
 * 
 */
public class Client {

	public static void main(String[] args) {
		Flyweight flyweight1, flyweight2, flyweight3;
		FlyweightFactory ff = new FlyweightFactory();

		flyweight1 = ff.factory("aaa");
		flyweight2 = ff.factory("bbb");
		// 如果存在，则不创建新的对象
		flyweight3 = ff.factory("aaa");

		flyweight1.func();
		flyweight2.func();
		flyweight3.func();

		ff.checkFlyweight();

	}

}