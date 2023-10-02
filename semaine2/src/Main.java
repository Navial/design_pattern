import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage : java ListerMots4 fichier");
            System.exit(1);
        }

        Strategy strategy1 = new BeginWithStrategy('S');
        Counter counter = new Counter(strategy1);
        // Strategy strategy2 = new LengthStrategy(6);
        // Strategy strategyAnd = new And(strategy1, strategy2);
        // Strategy strategy = new LengthStrategy(5);
        // Strategy strategy = new PalindromeStrategy();

        new ListerMots(args[0],counter).imprimer();
        System.out.println("counter: " + counter.getCounter());
    }

}