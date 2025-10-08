package pessoas;

public class Fornecedor {
    private double valorCredito;
    private double valorDivida;

    
    public Fornecedor() {
        super(); 
        this.valorCredito = 0.0;
        this.valorDivida = 0.0;
    }

    
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(); 
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    // Getters e Setters
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }


    public String getTelefone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTelefone'");
    }


    public String getEndereco() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEndereco'");
    }


    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}
