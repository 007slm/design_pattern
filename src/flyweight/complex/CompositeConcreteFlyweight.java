package flyweight.complex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 复合享元角色：它所代表的对象是不可以共享的，并且可以分解成为多个单纯享元对象 的组合。
 * 
 * @author yanbin
 * 
 */
public class CompositeConcreteFlyweight implements Flyweight {

	private HashMap<String, Flyweight> flies = new HashMap<String, Flyweight>(10);

	/**
	 * 将享元对象添加进集合中
	 * 
	 * @param data
	 * @param fw
	 */
	public void add(String data, Flyweight fw) {
		flies.put(data, fw);
	}

	/**
	 * 迭代出享元对象集合，调用具体的对象的func()方法
	 */
	public void func() {
		Iterator<Map.Entry<String, Flyweight>> iterator = flies.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Flyweight> e = iterator.next();
			Flyweight fw = e.getValue();
			fw.func();
		}
	}

}