package composite;

import strategies.IStrategy;

public class And implements IStrategy{

    private IStrategy strategy1;
    private IStrategy strategy2;
    private int compte;

    public And(IStrategy strategy1, IStrategy strategy2) {
        this.strategy1 = strategy1;
        this.strategy2 = strategy2;
        this.compte = 0;
    }

    public boolean check(String mot) {
        if(this.strategy1.check(mot) && this.strategy2.check(mot)){
            this.compte++;
            return true;
        }
        return false;
    }

    public int getCompte() {
        return this.compte;
    }

    public String getString() {
        return "And : " + strategy1.getString() + " et " + strategy2.getString() + " | Total : " + getCompte() + " fois";
    }

}
