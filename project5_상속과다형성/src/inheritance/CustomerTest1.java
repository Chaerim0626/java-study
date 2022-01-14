package inheritance;
import inheritance.Customer;
import inheritance.VIPCustomer;

public class CustomerTest1 {

	public static void main(String[] args) {
		
	/*	Customer customerLee = new Customer();
		
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("LEE"); */
		
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint = 1000;
		
		//System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
		
		//다형성 : 하나의 코드가 여러가지 자료형으로 구현되어 실행되는 것
	}
}
