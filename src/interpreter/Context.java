package interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文环境角色：包含解释器之外的一些全局信息。
 * 
 * @author yanbin
 * 
 */
public class Context {

	private Map<Variable, Integer> valueMap = new HashMap<Variable, Integer>();

	public void addValue(Variable x, Integer y) {
		valueMap.put(x, y);
	}

	public Integer LookupValue(Variable x) {
		Integer i = valueMap.get(x);
		return i;
	}

}
