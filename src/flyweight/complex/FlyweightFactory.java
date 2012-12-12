package flyweight.complex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlyweightFactory {

	private HashMap<String, Flyweight> flies = new HashMap<String, Flyweight>();

	/**
	 * 生产工厂
	 * 
	 * @param data
	 * @return
	 */
	public CompositeConcreteFlyweight factory(String data) {
		int len = data.length();
		CompositeConcreteFlyweight ccfw = new CompositeConcreteFlyweight();
		for (int i = 0; i < len; i++) {
			ccfw.add(String.valueOf(data.charAt(i)), this.innerFactory(String.valueOf(data.charAt(i))));
		}
		return ccfw;
	}

	private Flyweight innerFactory(String data) {
		if (flies.containsKey(data)) {
			return flies.get(data);
		} else {
			Flyweight fly = new ConcreteFlyweight(data);
			flies.put(data, fly);
			return fly;
		}
	}

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
