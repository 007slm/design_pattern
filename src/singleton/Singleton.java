package singleton;

/**
 * 单例模式<br/>
 * 1、将构造函数变为私有的。彻底断开了使用构造函数来得到类的实例的通道<br/>
 * 2、提供一个自己的对象以及访问这个对象的静态方法。<br/>
 * 
 * 1、有状态的单例：是可变的单例对象。多个单态对象在一起就可以作为一个状态仓库一样向外提供服务<br/>
 * 2、没有状态的单例对象也就是不变单例对象<br/>
 * 
 * @author yanbin
 * 
 */
// 1、饿汉式：
public class Singleton {

	// 在自己内部定义自己一个实例，注意这是private 只供内部调用
	private static Singleton instance = new Singleton();

	// 如上面所述，将构造函数设置为私有
	private Singleton() {
	}

	// 静态工厂方法，提供了一个供外部访问得到对象的静态方法
	public static Singleton getInstance() {
		return instance;
	}

}

// 2、懒汉式：
class Singleton_2 {

	// 定义一个对象的私有静态变量
	private static Singleton_2 instance = null;

	// 设置为私有的构造函数
	private Singleton_2() {
	}

	// 静态工厂方法，并运用同步
	public static synchronized Singleton_2 getInstance() {
		// 这个方法比上面有所改进
		if (instance == null) {
			// 实例化
			instance = new Singleton_2();
		}
		return instance;
	}

}
/**
 * 两种方式比较：<br/>
 * 第二种对静态工厂方法进行了同步处理，原因很明显--为了防止多线程环境中产生多个实例
 * 第二种方式中将类对自己的实例化延迟到第一次被引用的时候。而在第一种方式中则是在类被加载的时候实例化。
 * 第二种方式由于使用了同步处理，在反应速度上要比第一种慢一些 <br/>
 * 两种实现方式均失去了多态性，不允许被继承
 */

/**
 * 单例模式邪恶论<br/>
 * 当系统中的单例类被拷贝运行在多个虚拟机下的时候，在每一个虚拟机下都可以创建一个实例对象,分布式系统中，由于中间件屏蔽掉了分布式
 * 系统在物理上的差异，所以对你来说，想知道具体哪个虚拟机下运行着哪个单例对象是很困难的。
 */

