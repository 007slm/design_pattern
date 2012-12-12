package prototype;

/**
 * 抽象原型角色<br>
 * 原型必须实现clone方法：<br>
 * 1、实现Cloneable接口，这个接口下是没有方法的，只有实现了这个接口，利用object的clone()才会返回拷贝，
 * 否则会抛出CloneNotSupportedException 。<br>
 * 2、写clone()方法：调用Object的clone()方法进行克隆。 <br>
 * 3、clone()是不会调用构造方法的
 * 
 * 
 * @author yanbin
 * 
 */
public class Prototype implements Cloneable {

	public Object clone() {
		Prototype p = null;
		try {
			p = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
