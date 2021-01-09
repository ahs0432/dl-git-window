import java.io.BufferedReader; // 수신용 버퍼
import java.io.PrintWriter; // 송신용 버퍼
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.ServerSocket; // 서버용 소켓
import java.net.Socket; // 클라이언트용 소켓
import java.util.function.Supplier;
import java.util.stream.Stream;

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
//				Modern Style Code
//				순수 Lambda 함수 생성
				Supplier<String> sInput = () -> {
					try {
						return br.readLine();
					} catch (IOException e) {
						return null;
					}
				};

				Stream<String> stream = Stream.generate(sInput); // 스트림 객체 생성
				stream.map(s -> {
					System.out.println("클라이언트로부터 받음: " + s);
					out.println(s); // 송신
					return s;
//				}).allMatch(s -> {return s != null}); // s!=null과 같지 않을 경우 지속 반복
				}).allMatch(s -> s != null); // s!=null과 같지 않을 경우 지속 반복

//				Old Style Code
//				while((line = br.readLine()) != null) {
//					System.out.println("클라이언트로부터 받음 : " + line);
//					out.println(line);
//				}

			} catch(IOException e) {
				e.printStackTrace();
			}
		} catch(IOException e) {
		}
	}
}
