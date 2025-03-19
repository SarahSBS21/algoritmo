package questão26;
import javax.swing.JOptionPane;
public class Questão26 {

    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog("Digite o nome do 1º colocado:");
        int pontos1 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do 1º colocado:"));

        String nome2 = JOptionPane.showInputDialog("Digite o nome do 2º colocado:");
        int pontos2 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do 2º colocado:"));

        String nome3 = JOptionPane.showInputDialog("Digite o nome do 3º colocado:");
        int pontos3 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do 3º colocado:"));

        int totalPontos = pontos1 + pontos2 + pontos3;
        double premio1 = (double) pontos1 / totalPontos * 500000;
        double premio2 = (double) pontos2 / totalPontos * 500000;
        double premio3 = (double) pontos3 / totalPontos * 500000;

        JOptionPane.showMessageDialog(null, "Prêmio do 1º colocado (" + nome1 + "): R$" + String.format("%.2f", premio1));
        JOptionPane.showMessageDialog(null, "Prêmio do 2º colocado (" + nome2 + "): R$" + String.format("%.2f", premio2));
        JOptionPane.showMessageDialog(null, "Prêmio do 3º colocado (" + nome3 + "): R$" + String.format("%.2f", premio3));
    }
    
}
