package veiculos;

public class TesteVeiculo {
    public static void main(String[] args) {
        
        Veiculo v1 = new Carro("Toyota", "Corolla", 4);
        Veiculo v2 = new Moto("Honda", "CB500", 500);
        Veiculo v3 = new Carro("Volkswagen", "Golf", 2);
        Veiculo v4 = new Moto("Yamaha", "MT-07", 700);

        
        Veiculo[] veiculos = { v1, v2, v3, v4 };

        
        for (Veiculo v : veiculos) {
            v.exibirInfo(); 
        }
    }
}
