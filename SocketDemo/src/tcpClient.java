import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/15 0:08
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class tcpClient {

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1",8888);
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		byte[] arr = new byte[1024];
		int len = is.read(arr);
		System.out.println(new String(arr,0,len));
		os.write("this is Client Info".getBytes());
	}
}
