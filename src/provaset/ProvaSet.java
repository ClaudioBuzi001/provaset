package provaset;

import java.util.HashSet;
import java.util.Set;

public class ProvaSet {

	public static void main(String[] args) {
		Set<String>macchine = 	new HashSet<String>();
		
		macchine.add("BMW");
		macchine.add("AUDI");
		macchine.add("Opel");
		macchine.add("Ferrari");
		macchine.add("Alfa Romeo");
		macchine.add("Mclaren");
		
		System.out.println(macchine.size());
		for(String macchinaItem : macchine) {
			System.out.println(macchinaItem);
		}
		
		//TODO Implementare classe che usa un set per controllare la matricola

	}

}
