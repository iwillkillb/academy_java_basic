package shoes.list;

import java.util.ArrayList;
import java.util.List;
/**
 * ShoeList, ShoeSet, ShoeMap 따로
 * 
 * 생성자 : 
 * 기본생성자 - shoes를 직접 ArrayList<Shoe> / HashSet<Shoe> / HashMap<String, Shoe>로 초기화
 * 매개변수가 있는 생성자
 * 
 * 메소드 :
 * add(Shoe shoe) : int : 추가성공 1, 추가실패 0
 * set(Shoe shoe) : int : 수정성공 1, 수정실패 0
 * remove(Shoe shoe) : int : 삭제성공 1, 삭제실패 0
 * get(Shoe shoe) : Shoe : 조회성공 shoe, 조회실패 null
 * getAllShoes() : List<Shoe> : 전체목록을 리턴
 * @author PC38208
 *
 */
public class ShoeList {
	List<Shoe> shoes;
	
	// 생성자
	public ShoeList () {
		shoes = new ArrayList<Shoe> ();
	}
	public ShoeList (List<Shoe> shoes) {
		this.shoes = shoes;
	}
	
	// 메소드
	public int add (Shoe shoe) {
		boolean success = shoes.add(shoe);
		return success ? 1 : 0;
	}
	
	public int set (Shoe shoe) {
		int setIdx = findShoeIdx(shoe);
		
		if (setIdx > -1) {
			shoes.set(setIdx, shoe);
		}
		return setIdx;
	}
	
	public int remove (Shoe shoe) {
		int rmIdx = findShoeIdx(shoe);
		
		if (rmIdx > -1) {
			shoes.set(rmIdx, shoe);
		}
		return rmIdx;
	}
	
	public Shoe get (Shoe shoe) {
		int getIdx = findShoeIdx(shoe);
		Shoe found = null;
		if (getIdx > -1) {
			// 찾아올 제품이 존재
			found = shoes.get(getIdx);
		}
		return found;
	}
	
	public List<Shoe> getAllShoes() {
		return this.shoes;
	}
	
	
	
	private int findShoeIdx (Shoe shoe) {
		int index = -1;

		for (int idx = 0; idx < shoes.size(); idx++) {
			if (shoes.get(idx).equals(shoe)) {
				index = idx;
				break;
			}
		}
		return index;
	}
}
