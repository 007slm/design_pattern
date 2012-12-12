package flyweight.complex;

/**
 * 维护对所有享元对象的引用，而且还需要存储对应的外蕴状态。
 * 
 * @author yanbin
 * 
 */
public class Client {

	public static void main(String[] args) {
		FlyweightFactory ff = new FlyweightFactory();
		Flyweight ccfw = ff.factory("ubuntu");
		ccfw.func();
		ff.checkFlyweight();
	}

}