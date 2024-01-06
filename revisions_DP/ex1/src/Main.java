import strategies.CompteMotStrategy;
import strategies.IStrategy;
import strategies.PalindromeStrategy;

public class Main {

      public static void main(String[] args) throws Exception {
        AnalyseurDeTexte analyseurDeTexte = new AnalyseurDeTexte();
        IStrategy palindromeStrategy = new PalindromeStrategy();
        IStrategy motStrategy = new CompteMotStrategy("non");
        analyseurDeTexte.analyser(args[0], motStrategy);
        System.out.println(motStrategy.getString());
      }
}
