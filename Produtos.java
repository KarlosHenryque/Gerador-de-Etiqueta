package exercicio01;

public class Produtos {
	
	private String nome;
	private Double preco;
	
	public Produtos() {
	}

	public Produtos(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected Double getPreco() {
		return preco;
	}

	protected void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String etiquetaPreco() {
		return nome + " $ " +String.format("%.2f", preco);
	}

}
