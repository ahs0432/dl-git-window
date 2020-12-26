import java.io.BufferedReader; // 수신용 버퍼
import java.io.PrintWriter; // 송신용 버퍼
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.ServerSocket; // 서버용 소켓
import java.net.Socket; // 클라이언트용 소켓

public class EchoServer {
	public static void main(String[] args) {
		System.out.println("에코 서버 시작!");
		
		try(ServerSocket sSckt = new ServerSocket(9999)){
			System.out.println("연결 대기 중 ....");
			Socket cSckt = sSckt.accept(); // 연결 승인
			System.out.println("클라이언트 연결됨!");

			try(
			BufferedReader br = new BufferedReader(new InputStreamReader(cSckt.getInputStream()));
			PrintWriter out = new PrintWriter(cSckt.getOutputStream(), true);
			){
				String line;
				
				while((line = br.readLine()) != null) {
					System.out.println("클라이언트로부터 받음 : " + line);
					out.println(line);
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		} catch(IOException e) {
		}
	}
}
