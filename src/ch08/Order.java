package ch08;

public class Order {
	
	public String orderNumber;
	public String orderPhone;
	public String orderAdress;
	public int date;
	public int time;
	public int price;
	public String menuNumber;
	
	public Order(String orderNumber, String orderPhone, String orderAdress, int date, int time, int price, String menuNumber) {
		this.orderNumber = orderNumber;
		this.orderPhone = orderPhone;
		this.orderAdress = orderAdress;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void showOrder() {
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : " + orderPhone);
		System.out.println("주문 집 주소 : " + orderAdress);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 시간 : " + time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuNumber);
	}
}
