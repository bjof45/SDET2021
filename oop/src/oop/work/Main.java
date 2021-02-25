package oop.work;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    String tempvar;
    int tempnum;
	Bot type1 = new Bot();
	Script type2 = new Script();
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the information for your bot below....\n");
	
	type1.start();
	System.out.print("What is your bot name: ");
	tempvar = input.nextLine();
	type1.setName(tempvar);
	
	System.out.print("What is the developer name: ");
	tempvar = input.nextLine();
	type1.setDeveloper(tempvar);
	
	System.out.print("What is the income of your bot: ");
	tempnum = input.nextInt();
	type1.setIncome(tempnum);
	
	System.out.print("Who do you support(NIKE, FOOTSITES, RETAIL, ALL, NONE): ");
	tempvar = input.next();
	type1.setSupport(tempvar);
	type1.stop();	
	
	System.out.println("---------------------------------------------");
	System.out.println("Now let's enter information about your script");
	
	type2.start();
    System.out.print("What is your script name: ");
	
	tempvar = input.next();
	type2.setName(tempvar);
	
	System.out.print("What is the developer name: ");
	tempvar = input.next();
	type2.setDeveloper(tempvar);
	
	System.out.print("What is the income of your bot: ");
	tempnum = input.nextInt();
	type2.setIncome(tempnum);
	
	System.out.print("Who do you support(NIKE, FOOTSITES, RETAIL, ALL, NONE): ");
	tempvar = input.next();
	type2.setSupport(tempvar);
	type2.stop();	
	
	System.out.println("---------------------------------------------");
	type1.showAll();
	type2.showAll();
	
	
	
	
	
	
	
	}

}
