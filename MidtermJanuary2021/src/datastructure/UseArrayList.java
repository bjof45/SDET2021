package datastructure;
//BR
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		//Sprint,T-Mobile,ATT,Verizon
		ArrayList<String> phoneCompany = new ArrayList<String>();
		Scanner getInput = new Scanner(System.in);
		String tempString;

		System.out.print("Enter a couple of phone companies separated by a comma: ");
		tempString = getInput.nextLine();

		phoneCompany = new ArrayList<>(Arrays.asList(tempString.split(",")));

		for(String word : phoneCompany)
			System.out.println("Phone company provider: "+word);

		System.out.println("");

		if(phoneCompany.remove("Sprint")) {
			System.out.println("My phone company Sprint was removed\n");
		}
		for(String word : phoneCompany)
			System.out.println("Phone company provider: "+word);

	}

}
