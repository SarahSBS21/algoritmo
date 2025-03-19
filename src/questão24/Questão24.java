package questão24;
import javax.swing.JOptionPane;
public class Questão24 {
    public static void main(String[] args) {
        double refresco, água, suco;
        String s_refresco, s_água, s_suco;
        
        s_refresco = JOptionPane.showInputDialog(null, "Quantidade de litros de refresco: ");
        refresco = Double.parseDouble(s_refresco);
        
        água = refresco * 0.8;
        suco = refresco * 0.2;
        
        JOptionPane.showMessageDialog(null, "Serão necessários "+ água +"L de água e "+ suco +"L de suco.");
    }
    
}
