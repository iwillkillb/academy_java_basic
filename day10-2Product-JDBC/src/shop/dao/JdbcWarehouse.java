package shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.vo.Product;
/**
 * 제품 정보 저장을 JDBC를 통하여 오라클 데이터베이스의 PRODUCT 테이블로 저장하는 클래스
 * @author PC38208
 *
 */
public class JdbcWarehouse implements GeneralWarehouse {
	
	// DB 커넥션을 위한 정보
	private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	
	
	
	// 1. 멤버 변수 선언
	// DB에 저장된 데이터를 묶어서 저장할 List 변수
	private List<Product> products;
	
	
	
	// 2. 생성자 선언
	public JdbcWarehouse() {
		this.products = new ArrayList<>();
	}
	public JdbcWarehouse(List<Product> products) {
		this.products = products;
	}
	
	
	
	@Override
	public int add(Product product) throws DuplicateException {
		/*
		 * INSERT INTO PRODUCT(PRODCODE, PRODNAME, price, quantity)
		   VALUES (?, ?, ?, ?)
		 */
		// 추가하려는 제품이 이미 존재하는지 검사
		if (!isExists(product)) {
			throw new DuplicateException("조회", product);
		}
		
		int addCnt = 0;
		
		// 0. 필요객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "INSERT INTO PRODUCT(prodcode, prodname, price, quantity)"
					   + "VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdCode());
			pstmt.setString(2, product.getProdName());
			pstmt.setInt(3, product.getPrice());
			pstmt.setInt(4, product.getQuantity());
			
			// 4. 쿼리 실행
			addCnt = pstmt.executeUpdate();
			
			// 5. 결과 처리
			// 쿼리 실행 전 중복여부를 검사하기 때문에 특별한 결과 처리가 필요 없음.
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원 반납 오류!");
				e.printStackTrace();
			}
		}
		
		return addCnt;
	}

	@Override
	public Product get(Product product) throws NotFoundException {
		// 조회하려는 제품 존재여부 검사 : isExists()
		if (!isExists(product)) {
			throw new NotFoundException("조회", product);
		}
		
		// 0. 필요객체 선언
		Product found = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "SELECT p.PRODCODE"
					   + "     , p.PRODNAME"
					   + "     , p.PRICE"
					   + "     , p.QUANTITY"
					   + "  FROM product p"
					   + " WHERE p.PRODCODE = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdCode());
			
			// 4. 쿼리 실행
			result = pstmt.executeQuery();
			
			// 5. 결과 처리
			while (result.next()) {
				String prodCode = result.getString(1);
				String prodName = result.getString(2);
				int price = result.getInt(3);
				int quantity = result.getInt(4);
				
				found = new Product(prodCode, prodName, price, quantity);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(result != null) {
					result.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원 반납 오류!");
				e.printStackTrace();
			}
		}
		
		
		return found;
	}

	@Override
	public int set(Product product) throws NotFoundException {
		// 조회하려는 제품 존재여부 검사 : isExists()
		if (!isExists(product)) {
			throw new NotFoundException("수정", product);
		}
		
		// 0. 필요객체 선언
		int setCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "UPDATE product p"
					   + "   SET p.PRODNAME = ?"
					   + "     , p.PRICE = ?"
					   + "     , p.QUANTITY = ?"
					   + "     , p.MODDATE = sysdate"
					   + " WHERE p.PRODCODE = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getQuantity());
			pstmt.setString(4, product.getProdCode());
			
			// 4. 쿼리 실행
			setCnt = pstmt.executeUpdate();
			
			// 5. 결과 처리
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원 반납 오류!");
				e.printStackTrace();
			}
		}
		
		return setCnt;
	}

	@Override
	public int remove(Product product) throws NotFoundException {
		// 삭제하려는 제품 존재여부 검사 : isExists()
		if (!isExists(product)) {
			throw new NotFoundException("삭제", product);
		}
		
		// 0. 필요객체 선언
		int removeCnt = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "DELETE product p";
			// product 매개변수에 null이 아닌 값이 오면 1건 삭제
			// null이 왔을 때는 전체 삭제
			if (product != null) {
				sql += " WHERE p.PRODNAME = ?";
			}
			
			pstmt = conn.prepareStatement(sql);
			if (product != null) {
				pstmt.setString(1, product.getProdName());
			}
			
			// 4. 쿼리 실행
			removeCnt = pstmt.executeUpdate();
			
			// 5. 결과 처리
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원 반납 오류!");
				e.printStackTrace();
			}
		}
		
		return removeCnt;
	}

	@Override
	public List<Product> getAllProducts() {
		
		// 0. 필요객체 선언
		List<Product> listProduct = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "SELECT p.PRODCODE"
					   + "     , p.PRODNAME"
					   + "     , p.PRICE"
					   + "     , p.QUANTITY"
					   + "  FROM product p";
			pstmt = conn.prepareStatement(sql);
			
			// 4. 쿼리 실행
			result = pstmt.executeQuery();
			
			// 5. 결과 처리
			while (result.next()) {
				String prodCode = result.getString(1);
				String prodName = result.getString(2);
				int price = result.getInt(3);
				int quantity = result.getInt(4);
				
				Product product = new Product(prodCode, prodName, price, quantity);
				listProduct.add(product);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(result != null) {
					result.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원 반납 오류!");
				e.printStackTrace();
			}
		}
		
		
		return listProduct;
	}

	
	
	// 지원 메소드 : 등록, 수정, 삭제, 조회할 대상 제품의 존재여부를 확인하는 메소드
	private boolean isExists(Product product) {
		boolean isExist = false;
		
		// 0. 필요객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 커넥션
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "SELECT p.PRODCODE"
					   + "  FROM product p"
					   + " WHERE p.PRODCODE = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProdCode());
			
			// 4. 쿼리 실행
			result = pstmt.executeQuery();
			
			// 5. 결과 처리
			while (result.next()) {
				// 조회결과가 있다는 뜻은 동일 제품 코드가 등록되어있다는 뜻.
				isExist = true;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(result != null) {
					result.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원 반납 오류!");
				e.printStackTrace();
			}
		}
		
		return isExist;
	}
}
