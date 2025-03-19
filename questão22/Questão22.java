package questão22;
import javax.swing.JOptionPane;
public class Questão22 {
    public static void main(String[] args) {
        int qtd1, qtd5, qtd10, qtd25, qtd50, qtd100;
        double reais;
        String s_qtd1, s_qtd5, s_qtd10, s_qtd25, s_qtd50, s_qtd100;

        s_qtd1 = JOptionPane.showInputDialog(null, "Quantas moedas de 1 centavo você tem?");
        s_qtd5 = JOptionPane.showInputDialog(null, "Quantas moedas de 5 centavos você tem?");
        s_qtd10 = JOptionPane.showInputDialog(null, "Quantas moedas de 10 centavos você tem?");
        s_qtd25 = JOptionPane.showInputDialog(null, "Quantas moedas de 25 centavos você tem?");
        s_qtd50 = JOptionPane.showInputDialog(null, "Quantas moedas de 50 centavos você tem?");
        s_qtd100 = JOptionPane.showInputDialog(null, "Quantas moedas de 1 real você tem?");
        qtd1 = Integer.parseInt(s_qtd1);
        qtd5 = Integer.parseInt(s_qtd5);
        qtd10 = Integer.parseInt(s_qtd10);
        qtd25 = Integer.parseInt(s_qtd25);
        qtd50 = Integer.parseInt(s_qtd50);
        qtd100 = Integer.parseInt(s_qtd100);

        reais = qtd1 + qtd5 * 5 + qtd10 * 10 + qtd25 * 25 + qtd50 * 50 + qtd100 * 100;
        reais = reais / 100;
    
        JOptionPane.showMessageDialog(null, "Total de reais: " + reais);
    }
    
}
