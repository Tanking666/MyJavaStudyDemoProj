import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/14 22:45
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class udpClient {

	private int port;

	private void receive(DatagramSocket ds) {
		try {
			DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
			ds.receive(dp);
			byte bt[] = dp.getData();
			System.out.println(new String(bt,0,dp.getLength()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		udpClient uc = new udpClient();
		DatagramSocket ds = new DatagramSocket(8888);
		while (true) {
			uc.receive(ds);
		}
	}
}
