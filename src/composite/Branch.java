package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件角色(Composite)：在组合中表示分支节点对象——有子节点，实现抽象构件 角色声明的接口；存储子部件。
 * 
 * @author yanbin
 * 
 */
public class Branch implements Root {

	private String name;
	private List<Root> branchs;

	public Branch(String name) {
		this.name = name;
		this.branchs = new ArrayList<Root>();
	}

	public boolean addNode(Root node) {
		return branchs.add(node);
	}

	public void display(Integer level) {
		String space = "";
		for (int i = 0; i < level; i++) {
			space += "-";
		}
		System.out.println(space + name);
		for (Root branch : branchs) {
			// 递归调用
			branch.display(level + 2);
		}
	}

	public List<Root> getNode() {
		return branchs;
	}

	public boolean removeNode(Root node) {
		return branchs.remove(node);
	}

}