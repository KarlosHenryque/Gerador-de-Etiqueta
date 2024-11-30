package exercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produtos{
	
	private LocalDate dataFabricacao;
	
	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	protected LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	protected void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	
   @Override
   public String etiquetaPreco() {
	   return getNome()
			   + "(Usado) $"
			   + String.format("%.2f", getPreco())
			   +" (Data do produto Usado: "
			   +dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+")";
			   
   }


}
