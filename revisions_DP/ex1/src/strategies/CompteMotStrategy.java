package strategies;

public class CompteMotStrategy implements IStrategy{

    private int compte;
    private String searchedWord;

    public CompteMotStrategy(String searchedWord){
        this.compte = 0;
        this.searchedWord = searchedWord;
    }
    
    public void check(String mot){
        if(mot.equals(this.searchedWord)){
            System.out.println(mot);

            this.compte++;
        }
    }

    public int getCompte(){
        return this.compte;
    }
    public String getString() {
        return "CompteMotStrategy : " + this.searchedWord + " : " + this.compte + " fois";
    }

}
