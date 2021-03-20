package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		HashMap<String,String> myMap = new HashMap<>();
		Map<String, List<String>> list = new HashMap<String, List<String>>();

		myMap.put("Batman", "DC");
		myMap.put("Superman", "DC");
		myMap.put("Flash", "DC");
		myMap.put("Captain Marvel", "DC");
		myMap.put("Cyclops", "Marvel");
		myMap.put("Professor X", "Marvel");
		myMap.put("Spider-Man", "Marvel");
		myMap.put("Captain America", "Marvel");

		List<String> villainsDC = new ArrayList<>();
		List<String> villainsMarvel = new ArrayList<>();

		villainsDC.add("Joker");
		villainsDC.add("Lex Luthior");
		villainsDC.add("Cheetah");
		villainsDC.add("Black Adam");

		villainsMarvel.add("Dr.Oct");
		villainsMarvel.add("Red Skull");
		villainsMarvel.add("Magneto");
		villainsMarvel.add("Mr.Sinister");

		for(Entry<String,String> entry: myMap.entrySet()) {
			System.out.println(entry.getKey()+" from "+entry.getValue());

			if(entry.getValue().equals("DC")) {
				list.put(entry.getKey(), villainsDC);
			} else {
				list.put(entry.getKey(), villainsMarvel);
			}
		}

		System.out.println("--------------------------");
		
		for(Entry<String, List<String>> entry: list.entrySet()) {
			System.out.println("Character "+entry.getKey()+" has a list of villains such as "+entry.getValue());

		}
		}

}

