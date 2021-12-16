package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100); //버스타는 경우
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();

		Subway subwayGreen = new Subway(2); //지하철 타는 경우
		tomas.takeSubway(subwayGreen);
		subwayGreen.showInfo();
	}

}
