import java.lang.String;

public class ProdutoEstoque{ //atributos
  private String nome;
  private float valor;
  private int quantidade;

  public ProdutoEstoque(String nome, float valor, int quantidade){ //construtor
    this.nome = nome;
    this.valor = valor;
    this.quantidade = quantidade;
  }
    public int getQuantidade(){
      return quantidade;
    }
    public float getValor(){
      return valor;
    }
    public String getNome(){
      return nome;
    }
    public void setNome(String nome){
      this.nome = nome;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setValor(float valor){
      this.valor = valor;
    }

  }