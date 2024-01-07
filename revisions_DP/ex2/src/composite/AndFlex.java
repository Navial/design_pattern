package composite;

import strategies.IStrategy;

public class AndFlex implements IStrategy{

    private IStrategy[] strategies;
    private int compte;

    public AndFlex(IStrategy... strategies) {
        this.strategies = strategies;
        this.compte = 0;
    }

    public boolean check(String mot) {

        for (IStrategy strategy : strategies) {
            if(!strategy.check(mot)){
                return  false;
            }
        }
        this.compte++;
        return true;
    }

    public int getCompte() {
        return this.compte;
    }

    public String getString() {
        StringBuilder result = new StringBuilder("AndFlex: ");
        for (IStrategy strategy : strategies) {
            result.append(strategy.getString()).append("; ");
        }
        result.append("appelé ").append(getCompte()).append(" fois");
        return result.toString();
    }

}
