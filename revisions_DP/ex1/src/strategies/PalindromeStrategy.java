package strategies;

public class PalindromeStrategy implements IStrategy{

    private int compte;

    public PalindromeStrategy(){
        this.compte = 0;
    }

    public void check(String mot){
        if (mot.length() < 2) {
            return;
        }
        StringBuilder temp = new StringBuilder(mot);
        if(mot.equals(temp.reverse().toString())){
            System.out.println(mot);
            this.compte++;
        }
    }

    public int getCompte(){
        return this.compte;
    }

    public String getString() {
        return "PalindromeStrategy : " + this.compte + " fois";
    }
}
