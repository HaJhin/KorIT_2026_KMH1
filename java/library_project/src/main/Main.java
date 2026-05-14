package main;

import java.util.Scanner;

import model.dao.BookDao;
import model.dao.CustomerDao;
import model.dao.RentalDao;
import model.dto.BookDto;
import model.dto.CustomerDto;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookDao bookDao = new BookDao();
		CustomerDao customerDao = new CustomerDao();
		RentalDao rentalDao = new RentalDao();
		
		outer : while (true) {
			System.out.println("도서 대여 프로그램");
			System.out.println("1. 고객 등록");
			System.out.println("2. 도서 등록");
			System.out.println("3. 도서 전체 조회");
			System.out.println("4. 도서 대여");
			System.out.println("5. 전체 대여 목록 조회");
			System.out.println("6. 회원 대여 목록 조회");
			System.out.println("7. 재고 부족 도서 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("옵션 선택 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1: 
				System.out.print("고객 이름 입력 : ");
				String name = sc.next();
				System.out.print("전화번호 입력 : ");
				String phone = sc.next();
				customerDao.insertCustomer(new CustomerDto(name, phone));
				break;
			case 2:
				System.out.print("도서명 입력 : ");
				String title = sc.next();
				System.out.print("저자 입력 : ");
				String author = sc.next();
				System.out.print("재고 입력 : ");
				int stock = sc.nextInt();
				bookDao.insertBook(new BookDto(title,author,stock));
				break;
			case 3:
				bookDao.fildAllBooks();
				break;
			case 4:
				System.out.print("회원 ID 입력 : ");
				int customerId = sc.nextInt();
				System.out.print("도서 ID 입력 : ");
				int bookId = sc.nextInt();
				rentalDao.rentalBook(customerId, bookId);
				break;
			case 5:
				rentalDao.rentalList();
				break;
			case 6:
				System.out.print("회원 ID 입력 : ");
				int customerId2 = sc.nextInt();
				rentalDao.userRentalList(customerId2);
				break;
			case 7:
				bookDao.findLowStockBook();
				break;
			case 0:
				System.out.println("시스템 종료.");
				break outer;
			} // switch ed
		} // while ed
		
	} // main ed
} // class ed
