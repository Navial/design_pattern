package Factory;

public class LivreFactory implements ItemFactory {

  public Item createItem(String name, int anneeDeParution) {
    return new Livre(name, anneeDeParution);
  }

}
