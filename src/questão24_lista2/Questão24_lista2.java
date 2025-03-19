package questão24_lista2;
import javax.swing.JOptionPane;
public class Questão24_lista2 { 
    public static void main(String[] args) {
         double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y:"));

        if (2 * x + y == 3) {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") pertence à reta.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") NÃO pertence à reta.");
    }
    
}}
