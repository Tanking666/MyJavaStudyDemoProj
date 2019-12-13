import java.util.List;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/7 14:59
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public interface tree {
	void add(node n);

	void add(int num);

	void del(node n);

	void del(int i);

	node find(node n);

	node find(int nodeNum);

	List<node> getSubNode(node root);

}
