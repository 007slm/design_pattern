package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器：创建原型角色、拷贝原型角色就与客户程序分离开来<br>
 * 1、保存一个原型对象的清单，我们可以使用一个HashMap 来实现<br>
 * 2、原型管理器只需要一个就够了，所以可以使用单例模式来实现控制
 * 
 * @author yanbin
 * 
 */
public class PrototypeManager {

	private static PrototypeManager pm;

	private Map<String, Object> prototypes = null;

	private PrototypeManager() {
		prototypes = new HashMap<String, Object>();
	}

	// (饿汉单例)使用单例模式来得到原型管理器的唯一实例
	public static PrototypeManager getManager() {
		if (pm == null) {
			pm = new PrototypeManager();
		}
		return pm;
	}

	/**
	 * 添加原型
	 * 
	 * @param name
	 * @param prototype
	 */
	public void add(String name, Object prototype) {
		prototypes.put(name, prototype);
	}

	/**
	 * 删除原型
	 * 
	 * @param name
	 */
	public void delete(String name) {
		prototypes.remove(name);
	}

	/**
	 * 获取需要的原型
	 * 
	 * @param name
	 * @return
	 */
	public Prototype getPrototype(String name) {
		Prototype object = null;
		// 如果清单中包含需要的原型名称
		if (prototypes.containsKey(name)) {
			// 将清单中对应原型的复制品返回给客户
			Prototype p = (Prototype) prototypes.get(name);
			// 克隆
			object = (Prototype) p.clone();
		} else {
			// 清单中不存在需要的原型
			try {
				// 利用反射创建需要的势力
				object = (Prototype) Class.forName(name).newInstance();
				// 并将实例添加到原型清单中
				add(name, object);
			} catch (Exception e) {
				System.err.println("Class " + name + "没有定义!");
			}
		}
		return object;
	}

}
