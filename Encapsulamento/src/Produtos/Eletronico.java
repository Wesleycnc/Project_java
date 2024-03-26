package Produtos;

public class Eletronico extends Produto {
	private String corEletronico;

	public Eletronico(int codigo, int fabricanteNumero, String fabricanteNome, String nomeProduto,
			String descricaoProduto, double custo, int estoque, String corEletronico) {
		super(codigo, fabricanteNumero, fabricanteNome, nomeProduto, descricaoProduto, custo, estoque);
		this.corEletronico = corEletronico;
	}
	public String getEletronico() {
		return this.corEletronico;
	}

	public void setEletronico(String tipoEletronico) {
		this.corEletronico = tipoEletronico;
	}
	
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cor do eletronico: " + corEletronico);
    }


}
