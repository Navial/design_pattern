package composite;

import strategies.IStrategy;

public class OrFlex implements IStrategy {

      private IStrategy[] strategies;
      private int compte;

      public OrFlex(IStrategy... strategies) {
          this.strategies = strategies;
          this.compte = 0;
      }

      public boolean check(String mot) {

          for (IStrategy strategy : strategies) {
              if (strategy.check(mot)) {
                  this.compte++;
                  return true;
              }
          }
          return false;
      }

      public int getCompte() {
          return this.compte;
      }

      public String getString() {
          return "OrFlex : " + getCompte() + " fois";
      }
}
