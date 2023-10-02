import java.util.HashMap;
import java.util.Map;


public class Magasin {
	private Map<String,Produit> bac= new HashMap<String,Produit>();
	private AbstractFactory factory;

	public Magasin(AbstractFactory factory){
		this.factory = factory;
	}
	public void ajouterProduit(String name, int anneeDeParution){
		Produit produit= this.factory.creeProduit(name, anneeDeParution);
		bac.put(name,produit);
	}
	public Produit retourneProduit(String name){
		return bac.get(name);
	}
}
