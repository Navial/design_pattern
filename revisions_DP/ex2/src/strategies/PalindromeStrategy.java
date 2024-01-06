package strategies;

public class PalindromeStrategy implements IStrategy{

  private int compte;

  public PalindromeStrategy(){
    this.compte = 0;
  }

  public boolean check(String mot){
    if (mot.length() < 2) {
      return false;
    }
    StringBuilder temp = new StringBuilder(mot);
    if(mot.equals(temp.reverse().toString())){
      this.compte++;
      return true;
    }
    return false;
  }

  public int getCompte(){
    return this.compte;
  }

  public String getString() {
    return "PalindromeStrategy : " + this.compte + " fois";
  }
}
