package com.chat.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

// 웹 소켓의 호스트 주소 설정
@ServerEndpoint("/chat_module_test")    // @ServerEndpoint는 클라이언트에서 서버로 접속 할 주소로 지정합니다.
public class Chat  {
	
	// 접속 유저 session 을 구분하는 Set에 저장
	// 멀티 쓰레드 환경에서 사용하기 위한 Set을 동기화 해줌
	// Collections.synchronizedSet 메소드는 Set을 동기화된 Set으로 리턴
	private static Set<Session> clients = Collections.synchronizedSet(new HashSet<Session>());
	
	@OnOpen	  // @OnOpen은 클라이언트에서 서버로 접속할 때의 처리입니다.
	public void onOpen(Session session) {
		// 채팅방에 접속을 하면 세션이 생김
		// 현재 접속하고 있는 세션은 set에 저장
		System.out.println("채팅방에 접속을 할 때마다 onOpen이 호출되면서 세션이 생성된다.");
		System.out.println(session);
		clients.add(session);
	}
	
	@OnMessage    // @OnMessage에서는 클라이언트로 부터 메시지가 도착했을때 처리입니다.
	public void onMessage(Session session, String message) throws IOException {
		System.out.println(message);
		synchronized (clients) {
			// 하나의 일 처리를 수행하는동안 사용자의 변경이 일어나면 안된다.
	        // 즉 NullPointer를 방지하기 위해 동기화 처리를 해준다.
			// 동기화 시켜줌
			for(Session client : clients) {
				// clients에 있는 세션을 하나 씩 가지고 옴
				// 만약 자신의 접속한 세션이 아닌 세션에서 메시지를 보내면 그것을 나에게 보내줌 
				if(!client.equals(session)) {
					//메시지를 전달하는 메소드
					client.getBasicRemote().sendText(message);
				}
			}
		}
	}
	
	@OnClose   // @OnClose는 접속이 끊겼을때 처리입니다.
	public void onClose(Session session) {
		// 채팅방을 종료 할때 세션을 지워 줌 
		// 지우지 않으면 채팅방이 소멸이 안됨
		clients.remove(session);
	}
    

}
