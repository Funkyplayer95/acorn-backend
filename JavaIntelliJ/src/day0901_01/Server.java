package com.acorn.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
	
	public Server() throws IOException {
		ServerSocket serverSocket = new ServerSocket(10001);
		System.out.println("서버: 10001포트가 오픈");
		
		// 클라이언트에서 서버로 오는 응답대기: 연결요청이 있을 때까지 실행 중지
		// File 객체 생성으로 파일 스트림을 생성하듯
		// Socket 객체를 생성하면 네트워크 스트림이 생성   
		Socket socket = serverSocket.accept();
		// getInetAddress: 클라이언트의 IP주소
		System.out.println("서버: 클라이언트: " + socket.getInetAddress() + " 연결됨.");
		// getInetAddress: 클라이언트의 포트
		System.out.println("서버: 클라이언트: " + socket.getPort() + " 연결됨.");
		
		// I/O 버퍼: 데이터 저장소
		// 입력버퍼에서 읽어오는 처리
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
		BufferedReader socketInDataRepo = new BufferedReader(isr);
		// 출력버퍼에 쓰기 처리
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
		PrintWriter socketOutDataRepo = new PrintWriter(osw, true);
		
		// 출력 버퍼: 클라이언트에게 메시지 보내기
		socketOutDataRepo.println("당신의 연결을 환영합니다!!!");
		
		String message = socketInDataRepo.readLine();
		System.out.println("From Client To Server: " + message);
		
		serverSocket.close();
		System.out.println("서버: 소켓 종료");
	}
	
	public static void main(String[] args) {
		try {
			new Server();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
