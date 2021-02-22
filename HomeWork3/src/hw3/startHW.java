package hw3;
import java.util.Scanner; 

public class startHW {
	static String author = "Barry";
   
	public static void main(String[] args) {
	    String user = "";
		Scanner obj = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		
		
	System.out.print("Tell us who are you? ");
	user = obj.next();
	
     if(!user.equals(author)) {
    	 System.out.println("Im not doing anything with you "+user+"! Im waiting on "+author+"!!!!");
     } 
     else {
    System.out.println("Hey "+user);
    System.out.print("Enter the first number[LOW NUMBER]: ");
    number1 = obj.nextInt();
    
    System.out.print("Enter the second number[HIGH NUMBER]: ");
    number2 = obj.nextInt();
    
    System.out.println("Sending the numbers ("+number1+","+number2+") to do their thing!");
    counter.count(number1, number2);
    
     }
     
     System.out.println("A loop will happen below if you entered the numbers correctly!");
     if(number1 < number2) {
     while(number1 < number2) {
    	 System.out.print("-LOOP");
        number1++;
       } 
      }
     else {
    	 System.out.println("You didnt do things correctly "+user+"!!!!");
     }
	}

}
