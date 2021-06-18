package com.gmail;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

// SMTP 서버 정보와 사용자 정보를 기반으로 Session 클래스의 인스턴스를 생성한다.
public class SMTPAuthenticator extends Authenticator {
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("codesendtest", "123qweASD!!!");
	}
}