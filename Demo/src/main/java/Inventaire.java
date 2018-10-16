import java.util.HashMap;
import java.util.Map;

public class Inventaire {
	private int fruit, legumes;
	public Map<Integer, String> inv = new HashMap<Integer,String>();
	
	public Inventaire() {};
     
	public Inventaire(int or, int po, int tom, int conco) {
		
		Fruits o = new Oranges(or);
		Fruits p = new Pomme(po);
		Fruits t = new Tomate(tom);
		Legumes c = new Concombre(conco);
		
		/*inv.put(or, "Orange");
		  inv.put(po, "Pomme");
		  inv.put(tom, "Tomate");
		  inv.put(conco, "Concombre");*/
	}
}
