package encapsulation;
import java.util.Scanner;

public class starter {

	public static void main(String[] args) {
		String holdString;
		int holdInt;
		boolean holdStat;
		Scanner getInfo = new Scanner(System.in);
		BotInformation bot = new BotInformation();
		    
	    System.out.print("Let's get information on your bot\nBot Name: ");
		holdString = getInfo.nextLine();
		bot.setBotName(holdString);
		System.out.print("Bot Author: ");
        holdString = getInfo.next();
        bot.setBotAuthor(holdString);
        System.out.print("Date your bot went into production: ");
		holdString = getInfo.next();
		bot.setBotDOB(holdString);
		System.out.print("How many copies are out there? ");
		holdInt = getInfo.nextInt();
		bot.setCopies(holdInt);
		System.out.print("Answer the following questions true or false please\nDoes the bot support Nike? ");
		holdStat = getInfo.nextBoolean();
		bot.setNike(holdStat);
		System.out.print("Does the bot support Mesh? ");
		holdStat = getInfo.nextBoolean();
		bot.setMesh(holdStat);
		System.out.print("Does the bot support Footsites? ");
		holdStat = getInfo.nextBoolean();
		bot.setFoots(holdStat);    
		System.out.print("Does the bot support retail sites(Amazon, Target)? ");
		holdStat = getInfo.nextBoolean();
		bot.setRetail(holdStat); 
		
		System.out.println("So the bot "+bot.getBotName()+" developed by "+bot.getBotAuthor()+" that was released on "+bot.getBotDOB()+" has "+bot.getCopies()+" copies out there!");
       	 bot.supportNike();
         bot.supportMesh();
		  bot.supportFoots(); 
		  bot.supportRetail();
		    
		    
	  }
	}

