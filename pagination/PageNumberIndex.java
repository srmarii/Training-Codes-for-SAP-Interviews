package pagination;

/*
3. Número da página a partir de um índice
Dado um índice de um item na lista e um tamanho de página, retorne em qual página esse item se encontra (começando da página 1).

indexItem = 0
pageSize = 5
     0,1,2,3,4
1 - {1,1,1,1,1}

     5,6,7,8,9
2 - {2,2,2,2,2}
*/
public class PageNumberIndex {
    public int whichPage(int indexItem, int pageSize){
        if(indexItem < pageSize){
            return 1;
        }
        return 0;
    }
}
