package questão15;
import javax.swing.JOptionPane;
public class Questão15 {

    public static void main(String[] args) {
        int carlos_andré;
        double conta, conta_rachada, centavos, felipe;
        String s_conta;

        s_conta = JOptionPane.showInputDialog(null, "Qual o total da conta?");
        conta = Double.parseDouble(s_conta); 
        conta_rachada = conta / 3;
        carlos_andré = (int)conta_rachada;
        centavos = conta_rachada - carlos_andré;
        felipe = carlos_andré + 3 * centavos;
        
        JOptionPane.showMessageDialog(null, "Carlos: " + carlos_andré + ", André: " + carlos_andré + ", Felipe: " + felipe);
    }
    
}
