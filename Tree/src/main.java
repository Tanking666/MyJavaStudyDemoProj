import java.util.Random;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/7 15:08
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class main {
	public static void main(String[] args) {
		bTree bt = new bTree();
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			bt.add(r.nextInt(10));
		}
		node n = bt.find(5);
		System.out.println(n == null ? "null" : n);
	}
}
