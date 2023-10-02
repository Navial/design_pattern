public class BeginWithStrategy implements Strategy {

    private char firstLetter;

    public BeginWithStrategy(char letter){
        this.firstLetter = letter;
    }
    @Override
    public boolean check(String word) {
        return word.charAt(0) == firstLetter;
    }
}
