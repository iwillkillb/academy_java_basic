package api.collection;

import java.util.List;

import api.object.Product;

import java.util.ArrayList;

/**
 * 객체를 요소(Element)로 저장하는 컬렉션(Collection) 중에서
 * 1. 중복저장 허용
 * 2. 순서 상관있음
 * 으로 데이터를 저장하는 List타입을 테스트한다.
 * @author PC38208
 *
 */
public class ListTest {

	public static void main(String[] args) {
		/*
		 * ----------------------------------
		 * ArrayList 배열의 단점을 개선한 리스트 구현 클래스
		 * 1. 처음 생성시 크기가 고정되는 것.
		 * 2. 데이터 추가시 동적으로 크기가 변경되지 않는 것.
		 * 3. 데이터 삭제시 빈 인덱스 처리가 안되는 것.
		 * 등을 개선.
		 * ----------------------------------
		 */
		// 1. 선언
		List list;
		
		// 2. 초기화
		list = new ArrayList();
		
		// 3. 사용
		// (1) 리스트에 아이템 추가
		System.out.println(list.add("1st 아이템"));
		System.out.println(list.add("1st Item"));
		System.out.println(list.add(2));	// auto-boxing
		System.out.println(list.add(new Double(3.0)));
		System.out.println(list.add(new Boolean(true)));
		System.out.println(list.add(false));
		
		/*
		 * auto-boxing : 컬렉션에 기본형 데이터 추가 시 자동으로 객체형 데이터로 포장
		 * 				 wrapper 클래스 작동, 1.5버전부터 지원.
		 * -----------------------------------------------------
		 * auto-unboxing : 컬렉션에서 포장된 기본형 데이터를 뽑았을 때 형변환없이 바로
		 * 				    기본형 변수에 저장, 1.5부터 지원.
		 */
		//int two = (Integer)list.get(1);
		
		// 사용자 정의 타입 객체도 추가
		Product product = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		System.out.println(list.add(product));
		
		// 동일한 데이터 추가 시도
		System.out.println("=== 동일한 데이터 추가 시도 ===");
		System.out.println(list.add("1st Item"));
		
		// (2) list 내용 출력
		System.out.println("=== Set의 내용 출력 ===");
		System.out.println(list);
		
		System.out.println("=== foreach로 출력 ===");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== index 사용 for로 출력 ===");
		for (int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}
		
		// (3) 리스트에 들어있는 객체가 Product 타입이면 입고하는 기능
		System.out.println("=== Product의 buy()와 print() 사용 ===");
		for (Object obj : list) {
			if (obj instanceof Product) {
				Product prod = (Product)obj;
				prod.buy(100);
				
				prod.print();
			}
		}
	}

}
