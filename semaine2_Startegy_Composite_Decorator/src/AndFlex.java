import java.util.ArrayList;

public class AndFlex implements Strategy{

    public Strategy[] strategies;

    public AndFlex(Strategy...strategies){
        this.strategies = strategies;
    }

    @Override
    public boolean check(String word) {
        for(Strategy strat : strategies){
            if(!strat.check(word))
                return false;
        }
        return true;
    }
}
