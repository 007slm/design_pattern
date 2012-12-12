package iterator;

/**
 * 迭代器角色(Iterator)：迭代器角色负责定义访问和遍历元素的接口。
 * 
 * @author yanbin
 * 
 */
public interface Iterator {

	public abstract boolean hasNext();

	public abstract Object next();

}
