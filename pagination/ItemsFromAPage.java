package pagination;

import java.util.ArrayList;

/*
4. Itens de uma página
Dada uma lista, um número de página e um tamanho de página, retorne os itens daquela página.

list = {1,2,3,4,5,6,7,8,9}
pageNumber = 3
pageSize = 2

pages= {0,1}, {2,3}, {4,5}, {6,7}, {8}
        1       2      3      4     5

*/
public class ItemsFromAPage {
    public ArrayList<Integer> returnItems(int list[], int pageNumber, int pageSize){
        int firstIndex = (pageNumber -1) * pageSize;
        ArrayList<Integer> arrayReturn = new ArrayList<>();

        for(int i = firstIndex; 
            i < firstIndex + pageSize 
            //i < list.length para o caso de pageNumber ser 5
            && i < list.length; 
            i++){
            arrayReturn.add(list[i]);
        }

        return arrayReturn;
    }

    public static void main(String[] args) {
        ItemsFromAPage itemsFromAPage = new ItemsFromAPage();

        int list[] = {0,1,2,3,4,5,6,7,8};
        System.out.println(itemsFromAPage.returnItems(list, 5, 2));
    }
}
