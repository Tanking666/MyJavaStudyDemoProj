import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/14 22:44
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class udpServer {
	private int port = 8888;

	private void send(String str) {
		try {
			DatagramSocket ds = new DatagramSocket();
			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), this.port);
			ds.send(dp);
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		udpServer us = new udpServer();

		Scanner sc = new Scanner(System.in);
		String str;
		while (true) {
			System.out.print("::");
			str = sc.next();
			us.send(str);
		}
	}
}
