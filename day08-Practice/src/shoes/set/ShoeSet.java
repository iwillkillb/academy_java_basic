package shoes.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import shoes.list.Shoe;

public class ShoeSet {
	Set<Shoe> shoes;
	
	// 생성자
	public ShoeSet() {
		shoes = new HashSet<>();
	}

	public ShoeSet(Set<Shoe> shoes) {
		this.shoes = shoes;
	}
	
	// 메소드
	public int add(Shoe shoe) {
		boolean success = shoes.add(shoe);
		return success ? 1 : 0;
	}
	
	public int set(Shoe shoe) {
		boolean rmSuccess = shoes.remove(shoe);
		boolean addSuccess = false;
		if (rmSuccess) {
			shoes.add(shoe);
			addSuccess = true;
		}
		return addSuccess ? 1 : 0 ;
	}
	
	public int remove(Shoe shoe) {
		boolean success = shoes.remove(shoe);
		return success ? 1 : 0;
	}
	
	public Shoe get(Shoe shoe) {
		return findShoe(shoe);
	}
	
	public List<Shoe> getAllShoes() {
		List<Shoe> shoes = new ArrayList<Shoe>();
		
		for (Shoe product: this.shoes) {
			shoes.add(product);
		}
		
		return shoes;
	}
	
	
	
	private Shoe findShoe(Shoe shoe) {
		Shoe found = null;
		
		for (Shoe prod: shoes) {
			if (prod.equals(shoe)) {
				found = prod;
				break;
			}
		}
		
		return found;
	}
}
