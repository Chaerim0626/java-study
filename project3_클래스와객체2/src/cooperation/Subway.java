package cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		//½Â°´ ÅÂ¿ì±â
		this.money += money; //¹ŞÀº µ·¸¸Å­ µ· Áõ°¡
		passengerCount++;

	}
	
	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶ " + lineNumber + "È£¼±ÀÇ ½Â°´Àº " + passengerCount + "¸íÀÌ°í, ¼öÀÔÀº " + money + "ÀÔ´Ï´Ù.");
	}
}
