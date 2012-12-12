package iterator;

/**
 * 迭代器模式：又叫做游标（Cursor）模式。提供一种 方法访问一个容器（container）对象中各元素，而又不需暴露该对象的内部细节。
 * 组成：迭代器角色(Iterator)；具体迭代器角色(Concrete Iterator)；容器角色(Container)；具体容器角色(Concrete
 * Container)； 迭代器模式在客户与容器之间加入了迭代器角色。<br>
 * 迭代器模式抽象了具体迭代器角色， 使得客户程序更具一般性和重用性。这被称为多态迭代。<br>
 * 是由客户程序来控制遍历的进程，被称为外部迭代器；还有一种实现方式便是由 迭代器自身来控制迭代，被称为内部迭代器。
 * 
 * @author yanbin
 * 
 */
public class IteratorPattern {
	public static void main(String args[]) {
		BallContainer ballContainer = new BallContainer();
		ballContainer.appendBall(new Ball("red"));
		ballContainer.appendBall(new Ball("blue"));
		ballContainer.appendBall(new Ball("yellow"));
		Iterator ite = ballContainer.iterator();
		while (ite.hasNext()) {
			Ball ball = (Ball) ite.next();
			System.out.println(ball.getBallColor());
		}
	}
}
