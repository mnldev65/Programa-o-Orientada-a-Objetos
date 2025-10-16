package questao05;

import javax.swing.JOptionPane;

public class CalculadoraSimples {
    public static void main(String[] args) {
        try {
            double num1 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o primeiro número:")
            );
            double num2 = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o segundo número:")
            );

            String[] operacoes = {"+", "-", "×", "÷"};

            int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha a operação desejada:",
                "Calculadora",
                JOptionPane.INFORMATION_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                null,
                operacoes,
                operacoes[0]
            );

            double resultado = 0;
            boolean valido = true;

            switch (escolha) {
                case 0:
                    resultado = num1 + num2;
                    break;
                case 1: 
                    resultado = num1 - num2;
                    break;
                case 2: 
                    resultado = num1 * num2;
                    break;
                case 3:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
                        valido = false;
                    } else {
                        resultado = num1 / num2;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nenhuma operação selecionada.");
                    valido = false;
            }

            if (valido) {
                JOptionPane.showMessageDialog(
                    null,
                    "Resultado: " + resultado,
                    "Calculadora Simples",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Entrada inválida!\n Digite apenas números!",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}

