package datastructure;
//BR
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,poll elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		String tempString;

		Queue<String> queue = new LinkedList<>();

		queue.add("Jay-Z");
		queue.add("Benny The Butcher");
		queue.add("Conway the Machine");
		queue.add("WestSide Gunn");
		queue.add("Rick Ross");

		Queue<String> cqueue = new LinkedList<>();


		System.out.println("Queue is filled with my favorite rappers, the 1st would be "+queue.peek());
		tempString = queue.remove();

		System.out.println("Next up in my list is "+queue.peek());
		System.out.println("Adding '"+tempString+"' back to this queue, where will it land?");
		queue.add(tempString);

		System.out.println("The front is now: "+queue.peek()+" [expected result is '"+tempString+"' being added to end of queue]");
		System.out.println("Without further ado-");

		//while loop
		while((tempString = queue.poll()) != null) {
			System.out.println("A favorite rapper of mine is " + tempString);
			cqueue.add(tempString); // add to our 2nd queue
		}


		//iterator
		Iterator<String> it = cqueue.iterator();

		while(it.hasNext())
			System.out.println("IT: "+it.next());

		}
}

