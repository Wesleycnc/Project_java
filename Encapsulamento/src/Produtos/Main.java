package Produtos;

public class Main {
    public static void main(String[] args) {
        Eletronico produtoEletronico = new Eletronico(1, 123, "Samsung", "Smartphone", "design elegante e sofisticado", 1500.00, 10, "Azul");
        produtoEletronico.mostrarDados();
        
        
        Alimento produtoAlimenticio = new Alimento(2, 1234, "Nestlé", "Chocolate", "Contem derivados de leite de soja", 14.96 , 30, "11/12/2026");
        produtoAlimenticio.mostrarDados();

        
        Vestuario produtoVestuario = new Vestuario(3, 12345, "Nike", "Nike Dri-FIT", "perfeita para corredores", 100.00 , 50, "G");
        produtoVestuario.mostrarDados();
        


    }
    
}
