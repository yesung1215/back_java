package socketSelt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSelf2 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(1215);
			System.out.println("서비스가 시작되었습니다! 연결 대기 중...");
			
			socket = serverSocket.accept();
			System.out.println("서버에 연결완료!");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inMessage = in.readLine();
				System.out.println("클라이언트>>" + inMessage);
				
				System.out.println("서버에서 클라이언트로 메세지 전송>>");
				String outMessage = sc.nextLine();
				out.write(outMessage + "\n");
				out.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				
				if(socket != null) {
					socket.close();
				}
				
				if(in != null) {
					in.close();
				}
				
				if(out != null) {
					out.close();
				}
				
				if(sc != null) {
					sc.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
