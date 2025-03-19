package questão19;
import javax.swing.JOptionPane;
public class Questão19 {

    public static void main(String[] args) {
         int frangos;
        double gasto;
        String s_frangos;

        s_frangos = JOptionPane.showInputDialog(null, "Quantos frangos tem na granja");
        frangos = Integer.parseInt(s_frangos);

        gasto = frangos * (4 + 2*3.50);

        JOptionPane.showMessageDialog(null, "Gasto total é: " + gasto);
    }
    
}
