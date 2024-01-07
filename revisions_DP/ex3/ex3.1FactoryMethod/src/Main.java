import Factory.DVDFactory;
import Factory.LivreFactory;

public class Main
{
  public static void main(String[] args) {

    // Intanciation de la classe Magasin
    Magasin magasin = new MagasinDVD();
    magasin.createItem("DVD1", 2000);

    // Affichage du bac
    magasin.afficherBac();

  }
}
