package strategies;

public class CompteMotsStrategy implements IStrategy{

  private int compte;
  private String searchedWord;

  public CompteMotsStrategy(String searchedWord){
    this.compte = 0;
    this.searchedWord = searchedWord;
  }

  public boolean check(String mot){
    if(mot.equals(this.searchedWord)){
      this.compte++;
      return true;
    }
    return false;
  }

  public int getCompte(){
    return this.compte;
  }
  public String getString() {
    return "CompteMotStrategy : " + this.searchedWord + " : " + this.compte + " fois";
  }

}
