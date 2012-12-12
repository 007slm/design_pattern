package composite;

import java.util.List;

/**
 * 树叶构件角色(leaf)：在组合中表示叶节点对象——没有子节点，实现抽象构件角色声 明的接口。
 * 
 * @author yanbin
 * 
 */
public class Leafage implements Root {

	private String name;

	public Leafage(String name) {
		this.name = name;
	}

	public boolean addNode(Root node) {
		return false;
	}

	public void display(Integer level) {
		String space = "";
		for (int i = 0; i < level; i++) {
			space += "-";
		}
		System.out.println(space + name);
	}

	public List<Root> getNode() {
		return null;
	}

	public boolean removeNode(Root node) {
		return false;
	}

}
