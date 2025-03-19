package questão27;
import javax.swing.JOptionPane;
public class Questão27 {

    public static void main(String[] args) {
        double[] compras = new double[4];
        double totalGastos = 0;
        
        for (int i = 0; i < 4; i++) {
            compras[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra " + (i+1) + ":"));
            totalGastos += compras[i];
        }
        
        double pontos = totalGastos / 5;
        
        JOptionPane.showMessageDialog(null, "O total de pontos acumulados é: " + pontos);
    }
    
}
