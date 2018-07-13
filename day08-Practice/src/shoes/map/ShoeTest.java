package shoes.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * main에서
 * 1. Shoe타입 객체 4개 생성
 * shoeCode는 SH001같은 일련번호 부여
 * 나머지 필드들은 실존하는 데이터로 검색하여 생성
 * 
 * 2. Main에서 모두 진행할 것...
 * Shoe타입을 저장할 List<Shoe> shoes를 선언, 리스트에 add(shoe)로 추가
 * Set<Shoe> shoes를 선언, add(shoe)로 추가
 * Map<Shoe> shoes를 선언, put(code, shoe)로 추가
 * 
 * 3. 각 자료구조별 shoes를 foreach로 출력
 * 
 * 4. SH003번 코드로 등록된 신발의 정보 1개 입력
 * 
 * 5. SH003번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
 * 
 * 6. 재고가 조정된 내용 출력
 * 
 * 7. SH003번 코드로 등록된 신발 정보를 삭제
 * 
 * 8. 삭제된 신발 정보가 shoes에 없는 것을 출력 (전체출력)
 * @author PC38208
 *
 */
public class ShoeTest {

	public static void main(String[] args) {
		// 1. Shoe타입 객체 4개 생성
		Shoe shoe0 = new Shoe ("SH001", "나이키 에어 볼텍스", 280, 76300, "운동화", 10);
		Shoe shoe1 = new Shoe ("SH002", "에스디3205비비더블유", 270, 79000, "샌들", 8);
		Shoe shoe2 = new Shoe ("SH003", "호킨스 플레인", 275, 79000, "구두", 12);
		Shoe shoe3 = new Shoe ("SH004", "버티고 917", 265, 227000, "부츠", 6);
		
		// 2. Shoe타입을 저장할 List<Shoe> shoes를 선언, 리스트에 add(shoe)로 추가
		Map<String, Shoe> shoes = new HashMap<>();
		shoes.put("SH001", shoe0);
		shoes.put("SH002", shoe1);
		shoes.put("SH003", shoe2);
		shoes.put("SH004", shoe3);
		
		System.out.println("Shoes Map 방식 시작...");
		
		// 3. 각 자료구조별 shoes를 foreach로 출력
		for (Shoe sh : new ArrayList<Shoe>(shoes.values())) {
			System.out.println(sh.toString());
		}
		
		// 4. SH003번 코드로 등록된 신발의 정보 1개 입력
		// 입력받을 때 쓸 정보변수들과 스캐너 변수
		String inputName;
		int inputSize;
		int inputPrice;
		String inputType;
		int inputQuantity;
		Scanner scan = new Scanner(System.in);
		// 입력을 받는다.
		System.out.println("SH003 신발의 정보를 새로 입력합니다.");
		System.out.print("제품명 : ");
		inputName = scan.next();
		System.out.print("사이즈 : ");
		inputSize = scan.nextInt();
		System.out.print("가격 : ");
		inputPrice = scan.nextInt();
		System.out.print("타입 : ");
		inputType = scan.next();
		System.out.print("재고 : ");
		inputQuantity = scan.nextInt();
		// 입력받은 정보들을 바탕으로 새 신발 정보를 만든다.
		Shoe newShoe = new Shoe("SH003", inputName, inputSize, inputPrice, inputType, inputQuantity);
		// SH003에 덮어쓰기
		shoes.put("SH003", newShoe);
		
		// 5. SH003번 코드로 등록된 신발의 정보에서 재고를 0으로 조정
		Shoe zeroQuantityShoe = new Shoe ("SH003", newShoe.getShoeName(), newShoe.getSize(), newShoe.getPrice(), newShoe.getType(), 0);
		// SH003에 덮어쓰기
		shoes.put("SH003", zeroQuantityShoe);
		
		// 6. 재고가 조정된 내용 출력
		System.out.printf("\n수정된 결과\n");
		for (Shoe sh : new ArrayList<Shoe>(shoes.values())) {
			System.out.println(sh.toString());
		}
		
		// 7. SH003번 코드로 등록된 신발 정보를 삭제
		shoes.remove("SH003");
		
		// 8. 삭제된 신발 정보가 shoes에 없는 것을 출력 (전체출력)
		System.out.printf("\n삭제된 결과\n");
		for (Shoe sh : new ArrayList<Shoe>(shoes.values())) {
			System.out.println(sh.toString());
		}
	}
}
