import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import strategies.IStrategy;

public class AnalyseurDeTexte {

	public void analyser(String fichier, IStrategy strategy) throws IOException, FileNotFoundException {
		String ligne;
		BufferedReader lecteurAvecBuffer = null;

		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(fichier));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}

			while ((ligne = lecteurAvecBuffer.readLine()) != null) {
				for (String mot : ligne.trim().split(" ")) {
					strategy.check(mot);
				}
			}

			lecteurAvecBuffer.close();
	}
}
