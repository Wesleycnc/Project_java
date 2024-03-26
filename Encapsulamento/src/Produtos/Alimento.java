package Produtos;

public class Alimento extends Produto{
	private String validade;
	
	
    public Alimento(int codigo, int fabricanteNumero, String fabricanteNome, String nomeProduto,
            String descricaoProduto, double custo, int estoque, String validade) {
    		super(codigo, fabricanteNumero, fabricanteNome, nomeProduto, descricaoProduto, custo, estoque);
    		this.validade = validade;
}
    
    	public String getAlimento() {
    		return this.validade;
    	}
 
    	public void setAlimento(String tipoAlimento) {
    		this.validade = tipoAlimento;
    	}
    	
        public void mostrarDados() {
            super.mostrarDados();
            System.out.println("Validade do produto: " + validade);
        }

}
