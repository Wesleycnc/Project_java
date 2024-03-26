package Produtos;

public class Vestuario extends Produto {
	private String tamanho;

	public Vestuario(int codigo, int fabricanteNumero, String fabricanteNome, String nomeProduto,
			String descricaoProduto, double custo, int estoque, String tamanho) {
			super(codigo, fabricanteNumero, fabricanteNome, nomeProduto, descricaoProduto, custo, estoque);
			this.tamanho = tamanho;
	}
	
	public String getRoupa() {
		return this.tamanho;
	}
	
	public void setRoupa(String tamanho) {
		this.tamanho = tamanho;
	}
	
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tamanho: " + tamanho);
    }
}
