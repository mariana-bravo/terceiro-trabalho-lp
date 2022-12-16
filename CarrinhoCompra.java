import java.util.ArrayList; 
import java.lang.String;

public class CarrinhoCompra {
  float total = 0;
  EstoqueProdutos estoqueCarrinho; // criado para permitir o acesso ao estoque fora do construtor
  ArrayList<ProdutoEstoque> carrinhoCompra; // cria a lista de produtos presentes no carrinho

  public CarrinhoCompra(EstoqueProdutos estoque){
    this.estoqueCarrinho = estoque;
    this.carrinhoCompra = new ArrayList<>();
  }
  
  public void adicionaItem(String nome, int quantidade){
      int i;
      for(i=0; i < estoqueCarrinho.estoque.size() ; i++){
        if(estoqueCarrinho.estoque.get(i).getNome().equals(nome)){
          if(estoqueCarrinho.estoque.get(i).getQuantidade() >= quantidade){
            carrinhoCompra.add(new ProdutoEstoque( nome, estoqueCarrinho.estoque.get(i).getValor(), quantidade));
          }else{
            System.out.println("A quantidade de produto em estoque é insuficiente, restam apenas: " + estoqueCarrinho.estoque.get(i).getQuantidade());
          }
        }
      }
  }

  public void finalizaCompra(){
    int i;
    int j;
    for(i=0; i < estoqueCarrinho.estoque.size() ; i++){
      for(j=0; j < carrinhoCompra.size(); j++){
        if(estoqueCarrinho.estoque.get(i).getNome().equals(carrinhoCompra.get(j).getNome())){
          estoqueCarrinho.estoque.get(i).setQuantidade(estoqueCarrinho.estoque.get(i).getQuantidade() - carrinhoCompra.get(j).getQuantidade()) ;
        }
      }
    }
  }

  public float calculaTotal(){
    int i;
    for(i=0; i < carrinhoCompra.size(); i++){
      total = total + (carrinhoCompra.get(i).getValor() * carrinhoCompra.get(i).getQuantidade());
    }
    return total;
  }
  
}

/** Fonte:
http://www.universidadejava.com.br/java/java-string/
*/