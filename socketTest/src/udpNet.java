import java.io.IOException;
import java.net.*;
import java.util.Date;
import java.util.Scanner;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/14 22:04
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class udpNet {

	private String name;
	public int port;

	private void startServer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter your name::");
		this.name = sc.next();
		String str;
		new Thread() {
			@Override
			public void run() {
				DatagramSocket rSocket = null;
				DatagramPacket rPacket;
				try {
					rSocket = new DatagramSocket(port);
				} catch (SocketException e) {
					e.printStackTrace();
				}
				while (true) {
					try {
						rPacket = new DatagramPacket(new byte[1024], 1024);
						rSocket.receive(rPacket);
						byte[] arr = rPacket.getData();
						int len = rPacket.getLength();
						System.out.println(new String(arr, 0, len));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();

		while (true) {
			System.out.print("::");
			str = sc.next();
			sendString(str);
		}

	}

	private void sendString(String str) {
		try {
			str = this.name + "@" + new Date() + "=>" + str;
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), this.port);
			socket.send(packet);
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		udpNet un = new udpNet();
		un.port = 8888;
		un.startServer();

	}
}
