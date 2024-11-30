package exercicio01;

public class ProdutoImportado extends Produtos{
	
	private Double taxa;
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	protected Double getTaxa() {
		return taxa;
	}

	protected void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double totalProduto() {
		return getPreco() + taxa;
	}
	
	@Override
	public String etiquetaPreco() {
		return getNome() 
				+ " $ " 
				+ String.format("%.2f", totalProduto())
				+ " (Taxa do produto: $ " 
				+ String.format("%.2f", taxa)
				+ ")";
	}
	
	

}
