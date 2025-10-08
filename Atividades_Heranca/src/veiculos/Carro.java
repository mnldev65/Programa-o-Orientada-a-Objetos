package veiculos;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro - Marca: " + marca + ", Modelo: " + modelo + ", Portas: " + quantidadePortas);
    }
}
