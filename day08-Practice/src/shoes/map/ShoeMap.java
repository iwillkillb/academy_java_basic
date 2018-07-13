package shoes.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import shoes.list.Shoe;

public class ShoeMap {
	Map<String, Shoe> shoes;
	
	// 생성자
	public ShoeMap () {
		shoes = new HashMap<>();
	}

	public ShoeMap (Map<String, Shoe> shoes) {
		this.shoes = shoes;
	}

	// 메소드
	public int add(Shoe shoe) {
		int addIdx = 0;
		if (shoes.put(shoe.getShoeCode(), shoe) == null) {
			addIdx++;
		}
		return addIdx;
	}

	public int set(Shoe shoe) {
		int setIdx = findShoeIdx(shoe);

		if (setIdx > -1) {
			shoes.put(String.valueOf(setIdx), shoe);
		}
		return setIdx;
	}

	public int remove(Shoe shoe) {
		int rmIdx = findShoeIdx(shoe);

		if (rmIdx > -1) {
			shoes.put(String.valueOf(rmIdx), shoe);
		}
		return rmIdx;
	}

	public Shoe get(Shoe shoe) {
		int getIdx = findShoeIdx(shoe);
		Shoe found = null;
		if (getIdx > -1) {
			// 찾아올 제품이 존재
			found = shoes.get(getIdx);
		}
		return found;
	}

	public List<Shoe> getAllShoes() {
		return new ArrayList<Shoe>(shoes.values());
	}

	private int findShoeIdx(Shoe shoe) {
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
