package iterator;

import java.util.ArrayList;

/**
 * 具体容器角色（Concrete Container）：具体容器角色实现创建具体迭代器角色的接口 ——这个具体迭代器角色于该容器的结构相关。
 * 
 * @author yanbin
 * 
 */
public class BallContainer implements Container {

	private ArrayList<Ball> balls;

	public BallContainer() {
		balls = new ArrayList<Ball>();
	}

	public Ball getBallAt(int index) {
		return balls.get(index);
	}

	public void appendBall(Ball ball) {
		balls.add(ball);
	}

	public int getCount() {
		return balls.size();
	}

	public ArrayList<Ball> getBalls() {
		return this.balls;
	}

	public Iterator iterator() {
		return new BallIterator(this);
	}

}
