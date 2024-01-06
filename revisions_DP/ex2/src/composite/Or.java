package composite;

import strategies.IStrategy;

public class Or {

    private IStrategy strategy1;
    private IStrategy strategy2;

    public Or(IStrategy strategy1, IStrategy strategy2) {
        this.strategy1 = strategy1;
        this.strategy2 = strategy2;
    }

    public boolean check(String mot) {
        return this.strategy1.check(mot) || this.strategy2.check(mot);
    }

}
