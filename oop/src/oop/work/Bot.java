package oop.work;

public class Bot implements Actions {

  public enum WEBSITE_SUPPORT { NIKE, FOOTSITES, RETAIL, ALL, SUPREME, NONE }
  WEBSITE_SUPPORT support;
  private String developer;
  private String name;
  private int income;
  
  public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
  
  public void whatAreWe() {
	  
	  System.out.println("We are a bot");
	  
  }

@Override
public void start() {
	System.out.println("Bot: Starting....");
	
}

@Override
public void stop() {
	System.out.println("Bot: Stopping...");
	
}

@Override
public void update() {
	System.out.println("Bot: Updating");
	
}
 
public String getDeveloper() {
	return developer;
}

public void setDeveloper(String developer) {
	this.developer = developer;
}

public int getIncome() {
	return income;
}

public void setIncome(int income) {
	this.income = income;
}
  

public void setSupport(String answer) {
	switch(answer) {
	
	case "NIKE":
		this.support = support.NIKE;
		break;
		
	case "FOOTSITES":
		this.support = support.FOOTSITES;
		break;
	case "RETAIL":
		this.support = support.RETAIL;
		break;
	case "SUPREME":
		this.support = support.SUPREME;
		break;
	case "ALL":
		this.support = support.ALL;
		break;
	default:
		this.support = support.NONE;
	    
	}
}
public String getSupport(WEBSITE_SUPPORT input) {
	
	switch(input) {
	case NIKE: 
		return "we support Nike";
		
	case FOOTSITES:
		return "we support Footlocker";
		
	case RETAIL: 
		return "we support Amazon";
		
	case SUPREME:
		return "we support Supreme";
		
	case ALL:
		return "we support ALL sites";
	
	case NONE:
		return "we dont support any sites :(";
	default:
		return "we dont support any sites :(";
		
}

	
	
	
}

@Override
public void showAll() {
	System.out.println("Bot "+this.getName()+" by "+this.getDeveloper()+" makes "+this.getIncome()+" amount of dollars and "+this.getSupport(support));
	
}

}
