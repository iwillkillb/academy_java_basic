package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//import oracle.jdbc.OracleDriver;

/**
 * SCOTT계정의 EMP테이블의 내용을 조회하여
 * 데이터베이스 접속을 테스트하는 클래스
 * ----------------------------
 * 1. 드라이버 로드
 * 2. 커넥션 맺기
 * 3. 쿼리 준비
 * 4. 쿼리 실행
 * 5. 결과 처리
 * 6. 자원 해제
 * ----------------------------
 * @author PC38208
 *
 */
public class DriverLoadType5 {

	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 1. 드라이버 로드 : 방법 5 : 클래스를 바로 메모리에 로드
		Class.forName(DRIVER);
		
		// 2. 커넥션 맺기
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
		// 3. 쿼리 준비
		String sql = "SELECT e.EMPNO"
				   + "     , e.ENAME"
				   + "  FROM emp e"
				   + " ORDER BY e.ENAME";		
		Statement stmt = conn.createStatement();
		
		// 4. 쿼리 실행
		ResultSet result = stmt.executeQuery(sql);
		
		// 5. 결과 처리 : 반복수행(DQL 실행 결과는 보통 여러 행이기 때문)
		ResultSetMetaData meta = result.getMetaData();
		String empnoCol = meta.getColumnName(1);
		String enameCol = meta.getColumnName(2);
		System.out.printf("%7s | %7s \n", empnoCol, enameCol);
		System.out.println("-----------------");
		
		while (result.next()) { // 더 이상 행이 없을 때까지
			int empno = result.getInt(1);		// 1번 컬럼 값
			String ename = result.getString(2);	// 2번 컬럼 값
			System.out.printf("%7d | %7s \n", empno, ename);
		}
		
		// 6. 자원 해제 : 열었던 순서의 거꾸로.
		// 순서 : 오픈한 반대로이므로, result -> stmt -> conn
		if (result != null)
			result.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
	}

}
