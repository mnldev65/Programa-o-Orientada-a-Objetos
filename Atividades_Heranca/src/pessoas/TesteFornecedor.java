package pessoas;

public class TesteFornecedor {
    public static void main(String[] args) {
        
        Fornecedor f1 = new Fornecedor("João da Silva", "Rua das Flores, 123", "99999-0000", 5000.0, 1200.0);

        
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Endereço: " + f1.getEndereco());
        System.out.println("Telefone: " + f1.getTelefone());

        
        System.out.println("Crédito: R$ " + f1.getValorCredito());
        System.out.println("Dívida: R$ " + f1.getValorDivida());
        System.out.println("Saldo disponível: R$ " + f1.obterSaldo());

        
        f1.setValorDivida(3000.0);
        System.out.println("\nApós atualizar a dívida:");
        System.out.println("Novo saldo: R$ " + f1.obterSaldo());
    }
}
