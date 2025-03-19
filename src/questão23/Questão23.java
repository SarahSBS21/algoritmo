package questão23;
import javax.swing.JOptionPane;
public class Questão23 {
    public static void main(String[] args) {
         double alt_pessoa, som_pessoa, alt_predio, som_predio;
        String s_alt_pessoa, s_som_pessoa, s_som_predio;
        
        s_alt_pessoa = JOptionPane.showInputDialog(null, "Sua altura (em metros): ");
        s_som_pessoa = JOptionPane.showInputDialog(null, "Sua sombra (em metros): ");
        s_som_predio = JOptionPane.showInputDialog(null, "Sombra do prédio (em metros): ");
        alt_pessoa = Double.parseDouble(s_alt_pessoa);
        som_pessoa = Double.parseDouble(s_som_pessoa);
        som_predio = Double.parseDouble(s_som_predio);
        
        alt_predio = (alt_pessoa * som_predio) / som_pessoa;

        JOptionPane.showMessageDialog(null, "A altura do prédio é: "+ alt_predio +" metros");
    }
    
}
