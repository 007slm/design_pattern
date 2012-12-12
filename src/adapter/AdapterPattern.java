package adapter;

/**
 * 适配器模式（转换器）：将一个类的接口转换成客户希望的另外 一个接口。原本由于接口不兼容而不能一起工作的那些类可以一起工作。<br>
 * 组成：目标角色；被适配角色；适配器角色<br>
 * 与代理模式的区别：在于代理模式应用的情况是不改变接口命名的， 而且是对已有接口功能的一种控制；而适配器模式则强调接口转换。
 * 
 * @author yanbin
 * 
 */
public class AdapterPattern {

	public static void main(String[] args) {
		// 将调用适配器，转换到调用被适配的接口
		Target target = new Adapter(new Adaptee());
		target.request();
	}

}
