public class PalindromeStrategy implements Strategy {

    @Override
    public boolean check(String word) {
        return estPalindrome(word);
    }

    private boolean estPalindrome(String mot) {
        if (mot == null)
            return false;
        StringBuffer stringbuffer = new StringBuffer(mot);
        return mot.equals(stringbuffer.reverse().toString());
    }
}
