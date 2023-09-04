package com.acorn.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
	
	public Client() throws IOException {
		// File 객체 생성처럼
		// Socket 객체를 생성되면 네트워크 스트림(채널)이 생성   
		Socket socket = new Socket("localhost", 10001);
		System.out.println("클라이언트: 연결 성공");

		
		// I/O 버퍼: 데이터 저장소
		// 입력버퍼에서 읽어오는 처리
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
		BufferedReader socketInDataRepo = new BufferedReader(isr);
		// 출력버퍼에 쓰기 처리
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
		PrintWriter socketOutDataRepo = new PrintWriter(osw, true);
		
		String message = socketInDataRepo.readLine();
		System.out.println("From Server To Client: " + message);
		
		socketOutDataRepo.println("첫 연결입니다. 반갑습니다!!!");
		
		socket.close();
		System.out.println("클라이언트: 소켓 종료");
	}
	
	public static void main(String[] args) {
		try {
			new Client();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
