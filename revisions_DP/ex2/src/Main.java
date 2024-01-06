import composite.And;
import composite.AndFlex;
import decorator.Counter;
import java.io.IOException;
import strategies.IStrategy;
import strategies.PalindromeStrategy;
import strategies.CompteMotsStrategy;

public class Main {
  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      System.out.println("Usage : java ListerMots1 fichier");
      System.exit(1);
    }
    IStrategy palindromeStrategy = new PalindromeStrategy();
    IStrategy compteMotStrategy = new CompteMotsStrategy("non");
    IStrategy andStrategy = new AndFlex(palindromeStrategy, compteMotStrategy);
    IStrategy counter = new Counter(andStrategy);

    new ListerMots(args[0]).scannerTexte(counter);
    System.out.println(palindromeStrategy.getString());
    System.out.println(compteMotStrategy.getString());
    System.out.println(andStrategy.getString());

    System.out.println(counter.getString());

  }
}
