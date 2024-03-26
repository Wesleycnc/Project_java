package Produtos;

public class Produto {
	private int codigo;
	private int fabricanteNumero;
	private String fabricanteNome;
	private String nomeProduto;
	private String descricaoProduto;
	private double custo;
	private int estoque;

	public Produto(int codigo, int fabricanteNumero, String fabricanteNome, String nomeProduto,
			String descricaoDescricao, double custo, int estoque) {
		this.codigo = codigo;
		this.fabricanteNumero = fabricanteNumero;
		this.fabricanteNome = fabricanteNome;
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoDescricao;
		this.custo = custo;
		this.estoque = estoque;
	}

	public void inserirDados(int codigo, int fabricanteNumero, String fabricanteNome, String nomeProduto,
			String descricaoDescricao, double custo, int estoque) {
		this.codigo = codigo;
		this.fabricanteNumero = fabricanteNumero;
		this.fabricanteNome = fabricanteNome;
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoDescricao;
		this.custo = custo;
		this.estoque = estoque;
	}

	public double calcularValorVenda() {
		double margemLucro = 0.5;
		return custo * (1 + margemLucro);

	}

	public void mostrarDados() {
		System.out.println("Codigo: " + codigo);
		System.out.println("Fabricante Número: " + fabricanteNumero);
		System.out.println("Nome do fabricante: " + fabricanteNome);
		System.out.println("Nome do produto: " + nomeProduto);
		System.out.println("Decrição do produto: " + descricaoProduto);
		System.out.println("Valor do produto: R$" + custo);
		System.out.println("Quantidade em estoque: " + estoque);
		System.out.println("Valor de venda: R$" + calcularValorVenda());
	}

}
