public class Main {
    public static void main(String[] args) {
        AbstractFactory factoryDVD = new ConcreteFactoryDVD();
        Magasin magasinDVD = new Magasin(factoryDVD);
        magasinDVD.ajouterProduit("Star-Wars", 1999);
        magasinDVD.ajouterProduit("Shutter-island", 2017);

    }
}