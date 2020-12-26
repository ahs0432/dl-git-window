import java.io.BufferedReader; // 수신용 버퍼
import java.io.PrintWriter; // 송신용 버퍼
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket; // 클라이언트용 소켓
import java.net.InetAddress; // Get IP Address
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) {
		System.out.println("에코 클라이언트 시작!");
		try{
			InetAddress localAddr = InetAddress.getLocalHost(); // IP 주소 획득
			
			try(
			Socket cSckt = new Socket(localAddr, 9999); // 서버 호스트, 포트 정보
			BufferedReader br = new BufferedReader(new InputStreamReader(cSckt.getInputStream()));
			PrintWriter out = new PrintWriter(cSckt.getOutputStream(), true);
			){
	
				System.out.println("서버 연결됨! ");
				Scanner scv = new Scanner(System.in);
	
				while(true) {
					System.out.print("메시지 입력 : ");
					String line = scv.nextLine();
	
					if(line.equalsIgnoreCase("quit")){
						break;
					}

					out.println(line);
					System.out.println("서버 응답 : " + br.readLine());
				}
				scv.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} catch(IOException e) {
		}
	}
}
