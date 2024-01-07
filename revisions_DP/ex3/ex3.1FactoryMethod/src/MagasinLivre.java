import Factory.Item;
import Factory.Livre;

public class MagasinLivre extends Magasin {

    public Item createItem(String name, int anneeDeParution) {
        return new Livre(name, anneeDeParution);
    }

}
