package strategies;

public class RegexStrategy {

  private int compte;
  private String regex;

  public RegexStrategy(String regex){
      this.compte = 0;
      this.regex = regex;
  }

  public void check(String mot){
      if(mot.matches(regex)){
          System.out.println(mot);
          this.compte++;
      }
  }

  public int getCompte(){
      return this.compte;
  }

  public String getString() {
      return "RegexStrategy : " + this.compte + " fois";
  }

}
