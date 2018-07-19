package mybatis.emp.mapper;

import java.util.List;
import java.util.Map;

import mybatis.emp.vo.Emp;

/**
 * EmpMapper.xml에 정의되어있는 각 쿼리 아이디를 메소드로 맵핑하는 메소드
 * @author PC38208
 *
 */
public interface EmpMapper {
	/**
	 * @return Emp테이블의 전체 목록 Map으로 리턴
	 */
	public abstract List<Map<String, Object>> selectAll();
	
	/**
	 * @param empno : 조회할 직원 사번
	 * @return 직원 1명의 상세정보
	 */
	public abstract Emp selectOne(int empno);
	
	/**
	 * @param emp : 추가할 직원의 정보가 담긴 emp 객체
	 * @return : 추가에 성공한 행의 개수
	 */
	public abstract int insert(Emp emp);
}
