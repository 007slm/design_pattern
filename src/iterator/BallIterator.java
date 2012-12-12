package iterator;

/**
 * 具体迭代器角色（Concrete Iterator）：具体迭代器角色要实现迭代器接口，并要记录 遍历中的当前位置。
 * 
 * @author yanbin
 * 
 */
public class BallIterator implements Iterator {

	private BallContainer ballContainer;// 指明操作谁
	private int index;

	public BallIterator(BallContainer ballContainer) {
		this.ballContainer = ballContainer;// 将操作的“盆”传入，参考上面的代码
		this.index = 0;
	}

	// 实现迭代器中所具有的方法
	public boolean hasNext() {
		if (index < ballContainer.getCount()) {
			return true;
		} else {
			return false;
		}
	}

	public Object next() {
		Ball ball = ballContainer.getBallAt(index);
		index++;
		return ball;
	}

}