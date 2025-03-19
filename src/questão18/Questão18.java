package questão18;
import javax.swing.JOptionPane;
public class Questão18 {
    public static void main(String[] args) {
         int horas_normais, horas_extras;
        double salário;
        String s_horas_normais, s_horas_extras;

        s_horas_normais = JOptionPane.showInputDialog(null, "Quantas horas normais você trabalhou?");
        s_horas_extras = JOptionPane.showInputDialog(null, "Quantas horas extras você trabalhou?");
        horas_normais = Integer.parseInt(s_horas_normais);
        horas_extras = Integer.parseInt(s_horas_extras);

        salário = 10 * horas_normais + 15 * horas_extras;

        JOptionPane.showMessageDialog(null, "Seu salário bruto é: " + salário + ", e o líquido é: " + salário * 0.90);
    
    }
    
}
