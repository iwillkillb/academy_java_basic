package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.mapper.EmpMapper;
import mybatis.emp.vo.Emp;

/**
 * 직원정보 1건을 데이터베이스 테이블 emp에 삽입하는 클래스
 * @author PC38208
 *
 */
public class MybatisEmpInsertTest2 {

	public static void main(String[] args) {
		// 0. sqlSession Factory 생성
		SqlSessionFactory factory = getFactory();
		
		// 1. sqlSession 얻기
		/*
		 * DML 작업을 할 때는 세션을 오픈할 때 자바 애플리케이션에서 commit이 이루어지도록 해야 함.
		 * JDBC는 기본 auto-commit이므로 신경쓰지 않아도 되지만,
		 * mybatis는 non-auto-commit이라 변경해야 한다.
		 * 아래의 매개변수를 true로 해야 자동커밋 활성화.
		 */
		SqlSession session = factory.openSession(true);
		
		try {
			// 2. 세션 객체를 통해서 쿼리 실행
			//insert의 parameter로 넘길 emp객체.
			Emp emp = new Emp();
			emp.setEmpno(3333);
			emp.setEname("허균");
			emp.setJob("소설가");
			
			// 매퍼 인터페이스 객체를 선언
			EmpMapper mapper;
			
			// insert 수행 -> emp 객체 전달
			mapper = session.getMapper(EmpMapper.class);
			
			// 매퍼 인터페이스 객체를 통하여 메소드 호출
			int addCnt = mapper.insert(emp);

			System.out.println("삽입된 행 개수 : " + addCnt);
			
		} finally {
			// 3. sqlSession 닫기
			session.close();
		}
		
	}

}
