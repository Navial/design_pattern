public class ConcreteFactoryDVD implements AbstractFactory{

    public DVD creeProduit(String nom, int anneeDeParution){
        return new DVD(nom, anneeDeParution);
    }

}
