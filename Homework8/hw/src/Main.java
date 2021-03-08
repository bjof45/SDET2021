package hw;

import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		List<String> myString = new LinkedList<String>();
		Stack<String> stack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
		Map<String,String> superheroes = new LinkedHashMap<String,String>();
        Scanner stdin = new Scanner(System.in);
		
        // Add names to the queue and hash
		queue.add("Barry");
		superheroes.put("Barry", "The Flash");
		queue.add("Clark");
		superheroes.put("Clark", "Superman");
		queue.add("Bruce");
		superheroes.put("Bruce", "Batman");
		queue.add("Diana");
		superheroes.put("Diana", "Wonder Woman");
		
		//Linked list
		myString.add("Barry");
		myString.add("thinks");
		myString.add("Java");
		myString.add("is");
		myString.add("kinda");
		myString.add("cool");
		
		// print out list
		System.out.println(myString);
		int amt = myString.size();
		
		System.out.print("How many [greater than 1 but less than "+amt+"]? ");
		int howmany = stdin.nextInt();
		
		// Stack push
		for(int i=0; i < howmany; i++) {
			stack.push(myString.get(i));
			System.out.println("Pushing: "+myString.get(i));
		}
        
		// Whos in queue first?
		System.out.println("Whos in the queue first? "+queue.peek());
		
		// Get the first one out and see whos next
		queue.poll();
		
		System.out.println("First one is out, who's next up? "+queue.peek());
		
		// Go through our map of super heroes
		
		for(Entry<String, String> entry:superheroes.entrySet()) {
			 System.out.println("Real Name: "+entry.getKey()+ "\n\tHero Codename: "+ entry.getValue()+"\n");
		}
		
	}

}
