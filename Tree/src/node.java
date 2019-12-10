/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/7 15:03
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class node {
	private int num;
	private node lNode;
	private node rNode;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public node getlNode() {
		return lNode;
	}

	public void setlNode(node lNode) {
		this.lNode = lNode;
	}

	public node getrNode() {
		return rNode;
	}

	public void setrNode(node rNode) {
		this.rNode = rNode;
	}

	public node(int i) {
		this.num = i;
	}

	@Override
	public String toString() {
		return "node{" +
				"num=" + num +
				", lNode=" + (lNode == null ? "null" : String.valueOf(lNode.getNum())) +
				", rNode=" + (rNode == null ? "null" : String.valueOf(rNode.getNum())) +
				'}';
	}
}
