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
        if(this.strategy.check(mot)){
          System.out.println("Counter ++" );
            this.compte++;
            return true;
        }
        return false;
    }

    public int getCompte(){
        return this.compte;
    }

  @Override
  public String getString() {
    return getCompte() + " fois";
  }

}
