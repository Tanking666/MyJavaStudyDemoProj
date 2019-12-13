import java.util.List;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/7 15:07
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class bTree implements tree {

	private node root;

	@Override
	public void add(node n) {
		node tNode = root;
		if (tNode != null) {
			for (; ; ) {
				if (n.getNum() > tNode.getNum()) {
					if (tNode.getrNode() == null) {
						tNode.setrNode(n);
						break;
					} else {
						tNode = tNode.getrNode();
						continue;
					}
				} else if (n.getNum() < tNode.getNum()) {
					if (tNode.getlNode() == null) {
						tNode.setlNode(n);
						break;
					} else {
						tNode = tNode.getlNode();
						continue;
					}
				} else {
					System.out.println("the num exist!!");
					break;
				}
			}
		} else {
			this.root = n;
		}
	}

	@Override
	public void add(int num) {
		add(new node(num));
	}

	@Override
	public void del(node n) {
		//1.删除叶节点
		//3.删除左或者右子节点根
		//2.删除左右子节点根
		node tNode = find(n.getNum());
		if (tNode.getlNode() == null && tNode.getrNode() == null) {

		}
	}

	@Override
	public void del(int i) {
		del(new node(i));
	}

	@Override
	public node find(node n) {
		node tNode = root;
		if (tNode != null) {
			for (; ; ) {
				if (n.getNum() > tNode.getNum()) {
					if (tNode.getrNode() != null) {
						tNode = tNode.getrNode();
						continue;
					} else {
						break;
					}
				} else if (n.getNum() < tNode.getNum()) {
					if (tNode.getlNode() != null) {
						tNode = tNode.getlNode();
						continue;
					} else {
						break;
					}
				} else {
					return tNode;
				}
			}
		}
		return null;
	}


	@Override
	public node find(int nodeNum) {
		return find(new node(nodeNum));
	}

	@Override
	public List<node> getSubNode(node root) {
		return null;
	}

}
