package stepDefinations;

import io.cucumber.java.*;

public class Hooks {

	@Before("@NetBanking")
	public void netBaking() {
		System.out.println("*****************************");
		System.out.println("setup the entries in net Baking database");
	}
	
	@After
	public void tearDown() {		
		System.out.println("Delete all the entries from database");
		System.out.println("*****************************");
	}	
	
	@Before("@Mortgage")
	public void mortgageBaking() {
		System.out.println("*****************************");
		System.out.println("setup the entries in Mortgage Baking database");
	}
	
	//Flow of execution in Cucumber BDD Framework : Before -> Background -> Scenario -> After
}
