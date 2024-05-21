package cheeseinserter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	// private - Sichtbarkeit auf Klasse beschränkt
	// static - von der Klasse abhängig und nicht vom Objekt
	// final - Variable nach der Initialisierung unveränderbar
	private static  final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Zwiebeln?|Tomaten?|Melanzani");
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		// Initialisierung Laufvariable (iterator)
		// Abgruchbedingung (hasNext())
		// keine Inkrementierung -> passiert im Schleifenkörper
		for(ListIterator<String> iterator = ingredients.listIterator();iterator.hasNext();) {
			String ingredient = iterator.next();
			// matcher -> wird verwendet, um ingredient in unserem Muster zu finden
			// matches() -> für den direkten Vergleich
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("Käse");
			}
		}
	}
	
	public static void main(String[] args) {
		
		List<String> ingredients = new LinkedList<String>();
		// Kursiv geschrieben -> static Methode
		Collections.addAll(ingredients, "Gnocchi", "Paprika", "Tomate", "Pfeffer", "Melanzani");
		insertCheeseAroundVegetable(ingredients);
		System.out.println(ingredients);
		
	}

}
