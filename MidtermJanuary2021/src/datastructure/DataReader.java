package datastructure;

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

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
		FileReader readf = null;
		BufferedReader buffr = null;
		String temp;

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
				//System.out.println(temp);
				splitTheString(temp);
			}
		} catch (IOException e) {
			System.out.println("Error reading from the file: (STACK TRACE BELOW)");
			e.printStackTrace();
		}

	}

	public static void splitTheString(String wordGiven) {
		String st = "";
		ArrayList<String> words = new ArrayList<String>(Arrays.asList(wordGiven.split(" "))); // make array by splitting the sentence, hoping the words are seperated by single spaces
		int tempLength = 0;
/*
		for(int i=0; i < words.size(); i++) {
			if(words.get(i).length() > tempLength) {
				tempLength = words.get(i).length();
				st = words.get(i);
			}
		}
		map.put(tempLength, st);
		return map;
		*/
		for (int i = 0; i < words.size(); i++) {
			theStack.push(words.get(i));
			theLL.add(words.get(i));

			System.out.println("Size of LL: "+theLL.size());
			System.out.println("Size of Stack: "+theStack.size());
		}
	}


	}
