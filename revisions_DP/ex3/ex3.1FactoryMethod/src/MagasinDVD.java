import Factory.DVD;
import Factory.Item;

public class MagasinDVD extends Magasin{

    public Item createItem(String name, int anneeDeParution) {
        return new DVD(name, anneeDeParution);
    }
}
