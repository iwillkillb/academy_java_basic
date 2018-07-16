package io.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 파일 입력을 받아서 파일로 출력하는 클래스
 * --------------------------
 * -- 입력 --
 * 1. node stream (문자(reader) 파일 : FileReader)
 * 2. filter stream (reader -> reader : BufferedReader)
 * 3. read 작업 : filter stream의 메소드 사용 : readLine()
 * 
 * -- 출력 --
 * 4. node stream (문자(writer) 파일 : FileWriter)
 * 5. filter stream (writer -> writer : PrintWriter)
 * 6. write 작업 : filter stream의 메소드 사용 : println();
 * 
 * -- 정리 --
 * 7. 입력 filter stream 닫기
 * 8. 출력 filter stream 닫기
 * 
 * @author PC38208
 *
 */
public class TextFileCopy2 {

	public static void main(String[] args) {
		// 1. input node stream
		FileReader fr = null;
		try {
			fr = new FileReader("out.txt");
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		BufferedReader br = null;
		// --- 입력 객체 선언, 초기화 끝 ---
		
		// 4. output node stream
		FileWriter fw = null;
		try {
			fw = new FileWriter("copied.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PrintWriter pw = null;
		// --- 출력 객체 선언, 초기화 끝 ---
		
		// 3. read 작업
		String input = null;
		
		try {
			// 2. input filter stream
			br = new BufferedReader(fr);
			// 5. output filter stream
			pw = new PrintWriter(fw);
			
			while ((input = br.readLine()) != null) {
				// 6. write 작업
				pw.println(input);
				System.out.println("파일에서 읽은 데이터 : " + input);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 7. input filter stream 닫기
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// 8. output filter stream 닫기
			pw.close();
			
		}
		System.out.println("파일 복사 완료");
	}

}
