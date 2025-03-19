package questão30;
import javax.swing.JOptionPane;
public class Questão30 {
    public static void main(String[] args) {
        int grandes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de grande porte:"));
        int medios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de médio porte:"));
        int pequenos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de pequeno porte:"));
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de anos na empresa:"));

        int totalPontos = (grandes * 10) + (medios * 5) + (pequenos * 2) + (anos * 2);

        JOptionPane.showMessageDialog(null, "Total de pontos acumulados: " + totalPontos);
    }
    
}
