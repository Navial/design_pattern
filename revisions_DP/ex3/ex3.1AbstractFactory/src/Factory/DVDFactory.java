// Authors: Victor Denis - Navial
package Factory;

public class DVDFactory implements ItemFactory {

  public Item createItem(String name, int anneeDeParution) {
    return new DVD(name, anneeDeParution);
  }
}
