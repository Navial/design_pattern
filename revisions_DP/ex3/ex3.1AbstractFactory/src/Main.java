import Factory.DVDFactory;
import Factory.LivreFactory;

public class Main
{
  public static void main(String[] args) {

    // Intanciation de la classe Magasin
    Magasin magasin = new Magasin();

    // Ajout des items au magasin
    magasin.ajouterItem(new DVDFactory(), "DVD1", 2010);
    magasin.ajouterItem(new LivreFactory(), "Livre1", 2010);
    magasin.ajouterItem(new DVDFactory(), "DVD2", 2010);
    magasin.ajouterItem(new LivreFactory(), "Livre2", 2010);

    // Affichage du bac
    magasin.afficherBac();

  }
}
