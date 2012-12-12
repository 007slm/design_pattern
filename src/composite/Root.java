package composite;

import java.util.List;

/**
 * 抽象构件角色(Component)：它为组合中的对象声明接口，也可以为共有接口实现缺省行为。
 * 
 * @author yanbin
 * 
 */

public interface Root {

	/**
	 * 添加节点
	 * 
	 * @param node
	 * @return
	 */
	public boolean addNode(Root node);

	/**
	 * 移除节点
	 * 
	 * @param node
	 * @return
	 */
	public boolean removeNode(Root node);

	/**
	 * 获取节点
	 * 
	 * @return
	 */
	public List<Root> getNode();

	/**
	 * 显示属性结构
	 * 
	 * @param level
	 */
	public void display(Integer level);

}
