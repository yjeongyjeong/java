package bookMarket;

public class CartItem {
private String[] itemBook = new String[7];
private String bookID;
private int quantity;
private int totalPrice;


public CartItem() {

}
public CartItem(String[] book) {
	this.itemBook = book; //북 배열 받음
	this.bookID = book[0]; //배열에서 0번째가 이름
	this.quantity = 1;
	updateTotalPrice();
}


public String[] getItemBook() {
	return itemBook;
}
public void setItemBook(String[] itemBook) {
	this.itemBook = itemBook;
}
public String getBookID() {
	return bookID;
}
public void setBookID(String bookID) {
	this.bookID = bookID;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getTotalPrice() {
	return totalPrice;
}
public void updateTotalPrice() {
	totalPrice = Integer.parseInt(this.itemBook[2])*this.quantity;
	//가격*수량 ex.book[1][2] = "33000";
}

}
