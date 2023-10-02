public class ConcreteFactoryLivre implements AbstractFactory{

    public Livre creeProduit(String nom, int anneeDeParution){
        return new Livre(nom, anneeDeParution);
    }

}
