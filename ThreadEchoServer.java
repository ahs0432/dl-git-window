import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadEchoServer implements Runnable {
	private static  Socket cSckt;

	public ThreadEchoServer(Socket cSckt) {
		this.cSckt = cSckt;
	}

	public static void main(String[] args) {
		System.out.println("쓰레드 에코 서버 시작!");
		
		try(ServerSocket sSckt = new ServerSocket(9999)){
			while (true) {
				System.out.println("연결 대기 중 ....");
				Socket cSckt = sSckt.accept(); // 연결 승인
				System.out.println("클라이언트 연결됨!");

				ThreadEchoServer t = new ThreadEchoServer(cSckt);
				new Thread(t).start();
			}
		} catch(IOException e) {
		}
	}

	@Override
	public void run() {
		System.out.println("연결 Thread : " + Thread.currentThread());

		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(cSckt.getInputStream()));
				PrintWriter out = new PrintWriter(cSckt.getOutputStream(), true);
		){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(Thread.currentThread().getName() + "클라이언트로부터 받음 : " + line);
				out.println(line);
			}

		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
