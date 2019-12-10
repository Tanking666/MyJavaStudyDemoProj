import redis.clients.jedis.Jedis;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/25 22:20
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class redisTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.1.114");
//		jedis.set("abc1", "ddd");
		jedis.lindex("kxy", 1);
		System.out.println(jedis.keys("*"));

	}
}
