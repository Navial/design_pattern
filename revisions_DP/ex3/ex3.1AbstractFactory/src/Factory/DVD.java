package Factory;

public class DVD implements Item{

	public static final double PRIX=19.99;
	private String name;
	private int anneeDeParution;
	private double prix;


	public DVD(String name, int anneeDeParution){
		this.name=name;
		this.anneeDeParution=anneeDeParution;
		this.prix=PRIX;
	}

	public double getPrixDeBase(){
		return PRIX;
	}

	public String getName() {
		return name;
	}

	public int getAnneeDeParution() {
		return anneeDeParution;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(int prix){
		this.prix=prix;
	}
	
}
