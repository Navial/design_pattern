package decorator;

import strategies.IStrategy;

public class Counter implements IStrategy{

    IStrategy strategy;
    int compte;

    public Counter(IStrategy strategy){
        this.strategy = strategy;
        this.compte = 0;
    }

    public boolean check(String mot){
      boolean result = this.strategy.check(mot);
      if (result) {
        this.compte++;
      }
      return result; // Retourne le résultat réel de la stratégie décorée
    }

    public int getCompte(){
        return this.compte;
    }

  @Override
  public String getString() {
    return strategy.getString() + ", appelé " + getCompte() + " fois";
  }

}
