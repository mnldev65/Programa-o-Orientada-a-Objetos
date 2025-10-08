package veiculos;

public class Moto extends Veiculo {
    private final int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Moto - Marca: " + marca + ", Modelo: " + modelo + ", Cilindradas: " + cilindradas);
    }
}
