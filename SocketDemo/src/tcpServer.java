import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/15 0:08
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class tcpServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888);
		Socket socket = serverSocket.accept();
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		os.write("this is Server info".getBytes());
		byte[] arr = new byte[1024];
		int len = is.read(arr);
		System.out.println(new String(arr, 0, len));

	}

}
