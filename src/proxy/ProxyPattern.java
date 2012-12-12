package proxy;

/**
 * 代理模式：（Proxy Pattern 和 Surrogate Pattern）：为其他对象提供一种代理以控制对这个对象的访问。
 * 8种代理模式：远程（Remote）代理：为一个位于不同的地址空间的对象提供一个局域代表对象。
 * 虚拟（Virtual）代理：根据需要将一个资源消耗很大或者比较复杂的对象延迟的真正需 要时才创建。<br>
 * 保护（Protect or Access）代理：控制对一个对象的访问权限。<br>
 * 智能引用（Smart Reference）代理：提供比对目标对象额外的服务。<br>
 * 组成：抽象主题角色；代理主题角色；真实主题角色。
 * 
 * @author yanbin
 * 
 */
public class ProxyPattern {

	public static void main(String[] args) {
		// 不需要执行额外方法的
		ITalk people = new PeopleTalk("湖海散人", "18");
		people.talk("No ProXY Test");
		System.out.println("-----------------------------");
		// 需要执行额外方法的
		TalkProxy talker = new TalkProxy(people);
		talker.talk("ProXY Test", "七里香");
	}

}
