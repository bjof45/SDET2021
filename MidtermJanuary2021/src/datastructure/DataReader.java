package datastructure;
//BR
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataReader {

	static Stack<String> theStack = new Stack<>();
	static LinkedList<String> theLL = new LinkedList<>();

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
		String textFile = "/Users/berrykix/development/school/SDET2021/MidtermJanuary2021/src/data/self-driving-car";
		FileReader readf = null;
		BufferedReader buffr = null;
		String temp;

		System.out.println(textFile);

		try {
			readf = new FileReader(textFile);

		} catch(FileNotFoundException e) {
			System.out.println("We could not find the file to open: (STACK TRACE BELOW)");
			e.printStackTrace();
		}

		try {
			buffr = new BufferedReader(readf);
			System.out.println("Reading file..");
			while((temp = buffr.readLine()) != null) {
				System.out.println(temp);
				splitTheString(temp);
			}
		} catch (IOException e) {
			System.out.println("Error reading from the file: (STACK TRACE BELOW)");
			e.printStackTrace();
		}

		// done with reading the file
		System.out.println("---------------------------------");
		manipulateStack();
		manipulateLinkList();

		System.out.println("FIN");
	}

	public static void splitTheString(String wordGiven) {
		ArrayList<String> words = new ArrayList<>(Arrays.asList(wordGiven.split(" "))); // make array by splitting the sentence, hoping the words are seperated by single spaces

		for (String word : words) {
			theStack.push(word);
			theLL.add(word);
		}
	}


	public static void manipulateStack() {
		Stack<String> copyStack = (Stack<String>)theStack.clone();
		String tempString;
		String searchString = "current";
		int i = 0;
      // stack is filo, whatever we pushed first would be last out.
		System.out.println("Start stack section");
		System.out.println("Using peek: "+copyStack.peek());
		tempString = copyStack.pop();
		System.out.println("Using pop: "+tempString);
		System.out.println("Let's peek again: "+copyStack.peek());
		System.out.println("Let's push '"+tempString+"' and see what happens");
		copyStack.push(tempString);
		System.out.println("Let's peek at stack again: "+copyStack.peek());
		String answer = copyStack.search(searchString) > 0 ? "yep!": "nope!";
		System.out.println("Is the string '"+searchString+"' in the stack? "+answer);
		System.out.println("Let's go through the stack....");
		System.out.println("------------------------------");
do {
	if(copyStack.elementAt(i).equals("")) { // blanks seem to be new lines
		System.out.println("");
	}
	else {
		System.out.print(copyStack.elementAt(i) + " ");
	}

	i++;
} while(i < copyStack.size());
		System.out.println("\n------------------------------");
		System.out.println(">>Now let's pop through this copy of stack<<");

		while(copyStack.isEmpty() == false) {
			if(copyStack.peek().equals("")) {
				copyStack.pop();
				System.out.println("");
			} else {
				System.out.print(copyStack.pop()+" ");
			}
		}
        System.out.println("");
		System.out.println("End stack section");
	}

	public static void manipulateLinkList() {
		LinkedList<String> copyLL = (LinkedList<String>) theLL.clone();
		String tempString = "";

		System.out.println("\nStarted linkedlist section");
		// linkedlist is fifo, whatever we pushed first would be first out.
		System.out.println("Using peek: "+copyLL.peek());
		tempString = copyLL.poll();
		System.out.println("Using poll: "+tempString);
		System.out.println("Let's peek again: "+copyLL.peek());
		System.out.println("Let's push '"+tempString+"' and see what happens");
		copyLL.push(tempString);
		System.out.println("Let's peek at linkedlist again: "+copyLL.peek());
		System.out.println("Let's go through the linkedlist....");
		System.out.println("------------------------------");

		while((tempString = copyLL.poll()) != null) {
			tempString = tempString.length() > 0 ? tempString+" " : "\n";

			System.out.print(tempString);
		}
		System.out.println("");
	}

 }
