package flyweight.pure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 享元工厂角色：负责创建和管理享元角色。要想达到共享的目的，这个角色的实现是关 键！
 * 
 * @author yanbin
 * 
 */
public class FlyweightFactory {

	/** 用一个Map来存放所有的内蕴享元对象和外蕴享元对象 */
	private HashMap<String, Flyweight> flies = new HashMap<String, Flyweight>();

	/**
	 * 工厂方法：获取享元对象
	 * 
	 * @param data
	 * @return
	 */
	public Flyweight factory(String data) {
		if (flies.containsKey(data)) {// files.containsKey是如果此映射包含对于指定
			// 键的映射关系，则返回 true
			return flies.get(data);// 返回指定键所映射的值；如果对
			// 于该键来说，此映射不包含任何映射关系，则返回 null
		} else {
			Flyweight fly = new ConcreteFlyweight(data);
			flies.put(data, fly);
			return fly;
		}
	}

	/**
	 * 遍历所有的享元对象
	 */
	public void checkFlyweight() {
		int i = 0;
		System.out.println(this + ".checkFlyweight()");
		Iterator<Map.Entry<String, Flyweight>> iterator = flies.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Flyweight> e = iterator.next();
			System.out.println("item " + (++i) + " : " + e.getKey());
		}
	}

}