import Factory.Item;
import Factory.ItemFactory;
import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {

	private Map<String, Item> bac= new HashMap<String, Item>();

	public void ajouterItem(String name, int anneeDeParution){
		Item newItem = this.createItem(name,anneeDeParution);
		bac.put(name,newItem);
	}

	public abstract Item createItem(String name, int anneeDeParution);

	public Item retourneItem(String name){
		return bac.get(name);
	}

	public void afficherBac(){
		for (Map.Entry<String, Item> entry : bac.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue().getPrix());
		}
	}
}
