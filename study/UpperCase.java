package study;
/*
1) 
#Criar uma função que recebe uma string e precisa dizer se a primeira letra é um uppercase ou não
#se uppercase returna True, senão False
*/
public class UpperCase {
    public boolean isUpperCase(String word){
        Character firstLetter= word.charAt(0);

        return Character.isUpperCase(firstLetter);
    }

    public static void main(String[] args) {
        UpperCase uc = new UpperCase();
        System.out.println(uc.isUpperCase("Mariana"));
        System.out.println(uc.isUpperCase("mariana"));
    }
}
