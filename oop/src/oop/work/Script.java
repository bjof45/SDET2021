package oop.work;

public class Script extends Bot {

	
	public void whatAreWe() {
		
		System.out.println("We are a script");
	}
	
	public void start() {
		System.out.println("Script: Starting....");
		
	}

	@Override
	public void stop() {
		System.out.println("Script: Stopping...");
		
	}

	@Override
	public void update() {
		System.out.println("Script: Updating");
		
	}

	public void showAll() {
		System.out.println("Script "+this.getName()+" by "+this.getDeveloper()+" makes "+this.getIncome()+" amount of dollars and "+this.getSupport(support));
		
	}
}
