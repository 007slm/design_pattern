package prototype;

/**
 * 客户角色
 * 
 * @author yanbin
 * 
 */
public class Client {

	public void test() {
		Prototype p = PrototypeManager.getManager().getPrototype("prototype.ConcretePrototype");
		Prototype pClone = PrototypeManager.getManager().getPrototype("prototype.ConcretePrototype");
		System.out.println(p);
		System.out.println(pClone);
	}

}
