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

        // qualquer indice da pagina 1 (0,1,2,3,4) dividido por 5 daria 0
        // qualque indice da pagina 2 (5,6,7,8,9) dividido por 5 daria 1
        // +1 porque normalmente as paginas começam no 1
        return (indexItem / pageSize) + 1;
    }
}
