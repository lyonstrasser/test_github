package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTester {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.rotate(list, 2);
		
		// "Laufvariable" zum Iterieren eienr Datenstruktur
		// läuft immer voom Anfangs bis zum Ende
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			if(iterator.next() == 3) {
				//System.out.println("Found 3");
				iterator.remove();
			}
		}
		// Iterator muss wieder zurückgesetzt werden
		// sprich an den Anfang der Liste
		iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
