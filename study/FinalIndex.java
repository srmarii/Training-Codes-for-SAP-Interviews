/*
1. Índice final da página
Dado um número de página e tamanho de página, retorne o último índice (exclusive) que deve ser lido de uma lista.

    {0,1,2,3,4,5,6,7,8,9}
    System.out.println(p.whichIsTheFinalIndex(1, 10)); // 9

    {0,1,2,3,4,5,6,7,8,9}
    {10,11,12,13,14,15,16,17,18,19}
    System.out.println(p.whichIsTheFinalIndex(2, 10)); // 19

    {0,1,2,3,4,5,6,7,8,9}
    {10,11,12,13,14,15,16,17,18,19}
    {20,21,22,23,24,25,26,27,28,29}
    System.out.println(p.whichIsTheFinalIndex(3, 10)); // 29

    {0,1,2,3,4}
    {5,6,7,8,9}
    System.out.println(p.whichIsTheFinalIndex(2, 5));  // 9
*/
public class FinalIndex {
    public int whichIsTheFinalIndex(int pageNumber, int pageSize){
        int calculation = (pageSize * pageNumber) - 1;
       
        return calculation;
    }

    public static void main(String[] args) {
        FinalIndex fi = new FinalIndex();

        System.out.println(fi.whichIsTheFinalIndex(1, 10)); // 9
        System.out.println(fi.whichIsTheFinalIndex(2, 10)); // 19
        System.out.println(fi.whichIsTheFinalIndex(3, 10)); // 29
        System.out.println(fi.whichIsTheFinalIndex(2, 5));  // 9
    }
}