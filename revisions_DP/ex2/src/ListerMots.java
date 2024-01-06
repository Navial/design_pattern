import java.io.*;
import java.util.*;
import strategies.IStrategy;

public class ListerMots { // mal foutu
  private String fichier;

  public ListerMots(String fichier) {
    this.fichier = fichier;
  }

  public void scannerTexte(IStrategy strategy) throws IOException {
    BufferedReader input = new BufferedReader(new FileReader(this.fichier));
    String buffer = null;
    while ((buffer = input.readLine()) != null) {
      StringTokenizer mots = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
      while (mots.hasMoreTokens()) {
        String mot = mots.nextToken();
        if (strategy.check(mot))
          System.out.println(mot);
      }
    }
  }
}
