import Factory.Item;
import Factory.ItemFactory;
import java.util.HashMap;
import java.util.Map;

public class Magasin {

	private Map<String, Item> bac= new HashMap<String, Item>();

	public void ajouterItem(ItemFactory factory, String name, int anneeDeParution){
		Item newItem = factory.createItem(name,anneeDeParution);
		bac.put(name,newItem);
	}

	public Item retourneItem(String name){
		return bac.get(name);
	}

	public void afficherBac(){
		for (Map.Entry<String, Item> entry : bac.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue().getPrix());
		}
	}
}
