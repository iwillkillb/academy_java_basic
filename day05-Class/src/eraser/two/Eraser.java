package eraser.two;
/**
 * 칠판 지우개를 정의하는 클래스
 * -------------------------
 * 칠판 지우개의 속성을 정의하기 위하여
 * 가로	: width		: double
 * 세로	: height	: double
 * 높이	: depth		: double
 * 겹	: layer		: int
 * 네 개의 멤버 변수를 선언
 * -------------------------
 * 기본 생성자(매개변수를 받지 않는 생성자), 매개변수를 받는 생성자, 두 개를 정의
 * 매개변수를 받는 생성자는 네 개의 필드 모두에 대해서
 * 매개변수를 받도록 정의한다.
 * -------------------------
 * 칠판 지우개의 상태를 출력 : print() : void
 * 지우개의 한 겹을 제거 : peel() : void
 * -------------------------
 * 
 * @author PC38208
 *
 */
public class Eraser {
	// 1. 멤버변수 선언부
	// 가로
	double width;
	// 세로
	double height;
	// 높이
	double depth;
	// 겹
	int layer;
	
	// 2. 생성자 선언부
	// 기본 생성자
	Eraser () {

	}
	// width 필드만 초기화하는 생성자
	Eraser (double width) {
		this.width = width;
	}
	// width, height 필드를 초기화하는 생성자
	Eraser (double width, double height) {
		this (width);
		this.height = height;
	}
	// width, height, depth 필드를 초기화하는 생성자
	Eraser (double width, double height, double depth) {
		this (width, height);
		this.depth = depth;
	}
	// 모든 필드를 초기화하는 생성자
	Eraser (double width, double height, double depth, int layer) {
		this (width, height, depth);
		this.layer = layer;
		/*
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.layer = layer;
		*/
	}
	// this() 선언은 생성자 첫번째 줄에 단 1회만 사용 가능.
	
	// 3. 메소드 선언부
	// 지우개의 상태를 출력
	void print () {
		System.out.printf("가로 %.2f X 세로 %.2f X 높이 %.2f, %d겹%n", width, height, depth, layer);
	}
	// 지우개의 한 겹을 제거
	void peel () {
		// 남아있는 겹의 수가 -값이 될 수는 없으므로 if구문으로 값 체크
		if (layer > 0) {
			System.out.printf("%d겹 남았습니다.%n", --layer);
		} else {
			System.out.println("더 이상 벗길 겹이 없습니다.");
		}
	}
}
