package com.security;

import javax.crypto.*;
import javax.crypto.spec.*;
import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

public class AES256_str {
	
	private static String key = "key"; // 대칭키 생성

	
	// 암호화
	public static String Encrypt(String text) throws Exception {

		byte[] keyBytes= new byte[16];
	    byte[] b= key.getBytes("UTF-8");	// 대칭키를 바이트 배열로 변환, 키 값 중에서 16byte를 뽑아와서 keyBytes에 채워넣는다.
	    int len= b.length;

	    if (len > keyBytes.length) {		//입력받은 keyBytes의 길이가 실제 암호화 할 대상 key 길이보다 큰 경우, 암호화 키 길이에 맞게 조정
	    	len = keyBytes.length;
	    }

	    System.arraycopy(b, 0, keyBytes, 0, len);	// byte[] 형태의 데이터를 자르거나 연접하기 위해 사용하는 메소드 (복사하고자 하는 소스, 어디부터 읽어올지, 복사할 소스, 복사본에서 어디부터 읽어올지, 원본에서 복사본으로 데이터를 읽어서 쓸 데이터 길이)

	    SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");  // SecretkeySpec 함수를 통해 암호화에 사용할 비밀키 설정
	    // AES 알고리즘을 적용하여 키 생성
	    IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);

	    // AES256 으로 암호화
	    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	    cipher.init(Cipher.ENCRYPT_MODE,keySpec,ivSpec);

	    byte[] results = cipher.doFinal(text.getBytes("UTF-8"));	// 암호문을 바이트 배열로 받기
	    BASE64Encoder encoder = new BASE64Encoder();

	    return encoder.encode(results);								// 바이트 배열을 문자열로 변환하여 리턴
	   }
	
	
	
	
		// 복호화
		public static String Decrypt(String text) throws Exception {

			byte[] keyBytes= new byte[16];		// 배열 생성
		    byte[] b= key.getBytes("UTF-8");	// 대칭키를 바이트 배열로 변환, 키 값 중에서 16byte를 뽑아와서 keyBytes에 채워넣는다.
		    int len= b.length;

		    if (len > keyBytes.length) {        // 입력받은 keyBytes의 길이가 실제 복호화 할 대상 key 길이보다 큰 경우, 암호화 키 길이에 맞게 조정
		    	len = keyBytes.length;
		    }

		    System.arraycopy(b, 0, keyBytes, 0, len);

		    SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");  // SecretkeySpec 함수를 통해 복호화에 사용할 비밀키 설정
		    // AES 알고리즘을 적용하여 키 생성
		    IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);

		    // AES256 으로 복호화
		    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		    cipher.init(Cipher.DECRYPT_MODE,keySpec,ivSpec);

		    BASE64Decoder decoder = new BASE64Decoder();
		    byte [] results = cipher.doFinal(decoder.decodeBuffer(text));	// 복호화 된 결과를 바이트 배열로 받기

		    return new String(results,"UTF-8"); 		// 복호화된 바이트 배열을 문자열로 변환하여 리턴
		}
		
}
