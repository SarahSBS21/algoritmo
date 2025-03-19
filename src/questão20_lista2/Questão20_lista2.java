package questão20_lista2;
import javax.swing.JOptionPane;
public class Questão20_lista2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o saldo médio do último ano:");

        try {
        double saldoMedio = Double.parseDouble(input);
        double credito;
        
        if (saldoMedio < 0) {
            JOptionPane.showMessageDialog(null, "Saldo inválido.");
            return;
        } else if (saldoMedio < 500) {
            credito = 0; 
        } else if (saldoMedio < 1000) {
            credito = saldoMedio * 0.3; 
        } else if (saldoMedio < 3000) {
            credito = saldoMedio * 0.4; 
        } else {
            credito = saldoMedio * 0.5; 
        }
        
        JOptionPane.showMessageDialog(null, String.format("Saldo Médio: R$ %.2f\nCrédito Concedido: R$ %.2f", saldoMedio, credito));
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número válido.");
    }
}}
