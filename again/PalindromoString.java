package again;

public class PalindromoString {
    public boolean isPalindromoString(String word){
        int tam = word.length();
        String newWord = "";

        for(int i = tam-1; i>=0; i--){
            newWord = newWord + word.charAt(i);
        }

        return newWord.equalsIgnoreCase(word);
    }

    public static void main(String[] args) {
        PalindromoString ps = new PalindromoString();

        System.out.println(ps.isPalindromoString("ARara"));
    }
}
