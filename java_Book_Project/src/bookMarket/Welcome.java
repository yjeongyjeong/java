package bookMarket;

import java.util.Scanner;

public class Welcome {

	// 도서 정보를 저장할 2차원 배열을 생성, 도서의 개수에 대한 상수와 도서의 정보 개수에 대한 상수 선언함
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 4;
	static CartItem[] mCartItem = new CartItem[NUM_BOOK];
	static int mCartCount = 0;

	public static void main(String[] args) {
		String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 >>");
		String userName = sc.next();
		System.out.println("연락처를 입력해주세요 >>");
		int userPhone = sc.nextInt(); // 4184316576입력 시 에러발생 내 생각엔 숫자 너무 커서일듯

		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";

		boolean quit = false;
		while (!quit) {
			// 반복할 횟수를 모르니까 while을 사용, 메뉴를 종료하기 전까지 계속 반복되도록 종료메뉴에 quit = true라는 코드를 넣어줌 =>
			// 8을 선택하면 quit가 true가 되니까 !quit가 false로 변하게 됨 따라서 시행되지 않음 (=8을 선택하기 전까지는 quit값이
			// false니까 !quit가 true가 되어서 계속 실행됨
			System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);

			/*
			 * System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
			 * System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
			 * System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니에 항목수량 줄이기");
			 * System.out.println(" 3. 장바구니 비우기 \t \t6. 장바구니의 항목 삭제하기");
			 * System.out.println(" 7. 영수증 표시하기 \t \t8. 종료");
			 * System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
			 */
			menuIntroduction();

			System.out.println("메뉴 번호를 선택해주세요.");
			int menuNum = sc.nextInt();
//        System.out.println(menuNum + "번을 선택하셨습니다.");

			if (menuNum < 1 || menuNum > 8) {
				System.out.println("1부터 8까지의 숫자를 입력하세요.");
			} else {
//        	switch(연산식 또는 변수) case1: ()안의 값이 ~라면 ... 
				switch (menuNum) {
				case 1:
					/*
					 * System.out.println("현재 고객 정보 : "); System.out.println("이름 : "+ userName +
					 * "연락처 : " + userPhone);
					 */
					menuGuestInfo(userName, userPhone);
					break;

				case 2:
					// System.out.println("장바구니 상품 목록 보기 :");
					menuCartItemList();
					break;
				case 3:
					// System.out.println("장바구니 비우기");
					menuCartItemList();
					break;
				case 4:
					// System.out.println("장바구니에 항목 추가하기 : ");
					menuCartAddItem(mBook);
					break;
				case 5:
					// System.out.println("5. 장바구니의 항목 수량 줄이기");
					menuCartRemoveItemCount();
					break;
				case 6:
					// System.out.println("6. 장바구니의 항목 삭제하기");
					menuCartRemoveItem();
					break;
				case 7:
					// System.out.println("7. 영수증 표시하기");
					menuCartBill();
					break;
				case 8:
					// System.out.println("8. 종료");
					menuExit();
					quit = true;
					break;

				}
			}
		}

	}

	private static void menuGuestInfo(String userName, int userPhone) {
		System.out.println("현재 고객 정보 : ");
		System.out.println("이름 : " + userName + "연락처 : " + userPhone);
	}

	public static void menuCartItemList() {
		System.out.println("2. 장바구니 상품 목록 보기");
		System.out.println("장바구니 상품 목록 :");
		 System.out.println("---------------------------------------");
		 System.out.println("    도서ID \t|     수량 \t|      합계"); for (int i = 0; i <
		 mCartCount; i++) { System.out.print("    " + mCartItem[i].getBookID() +
		 " \t| "); System.out.print("    " + mCartItem[i].getQuantity() + " \t| ");
		 System.out.print("    " + mCartItem[i].getTotalPrice());
		 System.out.println("  "); }
		 System.out.println("---------------------------------------");
	}

	public static void menuCartClear() {
		System.out.println("3. 장바구니 비우기");
	}

	public static void menuCartAddItem(String[][] book) {
//		System.out.println("4. 장바구니에 항목 추가하기");
// 		장바구니에 추가할 도서의 ID가 목록에 포함되어잇으면 종료, 포함되어있지않으면 다시 입력하도록 와일반복
		boolean quit = false;
		while (!quit) {
			System.out.println("장바구니에 추가할 도서의 ID를 입력하세요");

			Scanner input = new Scanner(System.in);
			String str = input.nextLine();

			boolean flag = false;
			int numId = -1; //왜 -1일까

			for (int i = 0; i < NUM_BOOK; i++) {
				if (str.equals(book[i][0])) { // 도서의 아이디는 전부 0번째에 있음
					numId = i;
					flag = true;
					break; // 입력된 아이디가 저장된 도서의 아이디와 같으면 끝남
				}
			}
			if (flag) { // flag가 true가 되면(입력한 아이디가 배열에 있는 아이디와 일치하면)
				System.out.println("장바구니에 추가하시겠습니까? Y | N");
				str = input.nextLine();
				
				if(str.toUpperCase().equals("Y")) {
					System.out.println(book[numId][0] + "도서가 장바구니에 추가되었습니다."); //numId는 for밖에서 있으므로 for에서 나온 i값이 저장됨
					if(!isCartInBook(book[numId][0]))
						mCartItem[mCartCount++] = new CartItem(book[numId]);
				}//book에 대한 정보를 cartItem에다 저장
				//어떤 한 book을 담는다면 isCartInBook은 실행이 안되고(mCartCount가 0이니까) flag값은 false로 남음 따라서 !false = true이므로 if문이 실행됨
//				mCartItem[1] = new CartItem(book[numId]) -> 객체 생성됨
//				같은 걸 또 담게 되면 isCartInBook에서 mCartCount가 1이므로 for이 실행되지 않고 다시 위로 올라가서 mCartItem[2] = new CartItem(book[numId])가 실행되며 객체가 생성됨...?
//				한번 더 담게되면 mCartCount가 2이므로 isCartInBook에서 for문이 실행됨
//				bookId와 mCartItem[0]의 bookId가 일치하면 mCartItem[0번째]의 수량은 원래 있던 수량에서 1을 더해준 1이됨-> 근데 mCartCount의 값이 2이므로 index값이 1일때가 한번 더 실행됨 -> 따라서 mcartItem[1]의 수량도 +1이 됨 
				quit = true;
			} else {
				System.out.println("다시 입력해주세요."); // 아이디가 일치하지 않는 경우
			}
		}
	}

	private static boolean isCartInBook(String bookId) {
		boolean flag = false;
		for(int i = 0; i< mCartCount; i++) {
			if(bookId == mCartItem[i].getBookID()) {
				mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
				flag = true;
			}
		}
		return flag;
		
	}

	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}

	public static void menuCartRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기");
	}

	public static void menuCartBill() {
		System.out.println("7. 영수증 표시하기");
	}

	public static void menuExit() {
		System.out.println("8. 종료");
	}

	public static void BookList(String[][] book) {
		book[0][0] = "ISBN1234";
		book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
		book[0][2] = "27000";
		book[0][3] = "송미영";
		book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍 ";
		book[0][5] = "IT전문서";
		book[0][6] = "2018/10/08";

		book[1][0] = "ISBN1235";
		book[1][1] = "안드로이드 프로그래밍";
		book[1][2] = "33000";
		book[1][3] = "우재남";
		book[1][4] = "실습 단계별 명쾌한 멘토링!";
		book[1][5] = "IT전문서";
		book[1][6] = "2022/01/22";

		book[2][0] = "ISBN1236";
		book[2][1] = "스크래치";
		book[2][2] = "22000";
		book[2][3] = "고광일";
		book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
		book[2][5] = "컴퓨터입문";
		book[2][6] = "2019/06/10";

	}

	public static void menuIntroduction() {
		System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
		System.out.println(" 1. 고객 정보 확인하기 \t4. 장바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니에 항목수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t \t6. 장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기 \t \t8. 종료");
		System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
	}

}
