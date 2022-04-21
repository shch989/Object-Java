package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance(); // static을 가져다 써야할 경우 new가 아니라 클래스 이름을 쓴다
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();
	}

}
