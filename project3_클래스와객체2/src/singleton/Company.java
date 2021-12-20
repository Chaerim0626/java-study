package singleton;

public class Company {
	
	private static Company instance = new Company(); //유일하게 사용되는 인스턴스

	private Company() {}
	
	public static Company getInstance() { //singletion 패턴
		return instance;
	}
}
