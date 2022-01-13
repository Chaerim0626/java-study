package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer () {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.01;
		
		System.out.println("VIPCustomer() »£√‚");
	}
	
	public int getAgentID () {
		return agentID;
	}
}
