package pagination;
/*
2. Número total de páginas
Dada uma quantidade total de itens e um tamanho de página, retorne quantas páginas são necessárias para exibir todos os itens.

totalItems = 10
pageSize = 5

pages = 10/5 = 2
*/

public class TotalPageNumber {
    public int howManyPages(int totalItems, int pageSize){
        int calculation = totalItems / pageSize;

        return calculation;
    }
    public static void main(String[] args) {
        TotalPageNumber tpn = new TotalPageNumber();

        System.out.println(tpn.howManyPages(10, 5));
    }
    
}
