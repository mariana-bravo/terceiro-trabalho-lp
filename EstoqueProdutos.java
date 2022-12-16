import java.util.ArrayList; 

public class EstoqueProdutos {
    ArrayList<ProdutoEstoque> estoque;

    public EstoqueProdutos(){
      estoque = new ArrayList<>();
    }
    public void adicionaProduto(ProdutoEstoque produto){
      estoque.add(produto);
    }
}

/** Fontes:
https://www.devmedia.com.br/forum/resolvido-array-dinamico/565602
https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298
*/