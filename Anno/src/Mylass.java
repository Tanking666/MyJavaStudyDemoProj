/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/23 16:38
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */

public class Mylass {
	static void say(){
		System.out.println("this is my say");
	}

	@MyAnno
	public static void main(String[] args) {
		Mylass.say();
	}
}
