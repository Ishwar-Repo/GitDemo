package stepDefinations;

import io.cucumber.java.*;

public class Hooks {

	@Before("@NetBanking")
	public void netBaking() {
		System.out.println("*****************************");
		System.out.println("setup the entries in net Baking database");
		
		System.out.println("This changes from Eclipse1");
	}
	
	@After
	public void tearDown() {		
		System.out.println("Delete all the entries from database");
		System.out.println("*****************************");
		
		System.out.println("This changes from Eclipse2");
	}	
	
	@Before("@Mortgage")
	public void mortgageBaking() {
		System.out.println("*****************************");
		System.out.println("setup the entries in Mortgage Baking database");
	}
	
	//Flow of execution in Cucumber BDD Framework : Before -> Background -> Scenario -> After
}
