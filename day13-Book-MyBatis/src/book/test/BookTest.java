package book.test;

import static book.factory.BookShelfFactory.getBookShelf;

import book.dao.BookShelf;
import book.exception.DuplicateException;
import book.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		BookShelf bookShelf = getBookShelf("mybatis");
		
		Book book1 = new Book("BK001", "하루의 취향", "김민철", 13500, "9791188850167", "북라이프");
		Book book2 = new Book("BK002", "어머니의 나라", "추 와이홍", 13800, "9788965962687", "흐름출판");
		Book book3 = new Book("BK003", "굿 나이트 스토리즈 포 레벨 걸스", "엘레나 파빌리, 프란체스카 카발로", 22000, "9788934981824", "주니어김영사");
		
		try {
			bookShelf.insert(book1);
			bookShelf.insert(book2);
			bookShelf.insert(book3);
		} catch (DuplicateException e) {
			e.printStackTrace();
		}
		
		bookShelf.select();
	}

}
