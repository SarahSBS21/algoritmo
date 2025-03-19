package questão17;
import javax.swing.JOptionPane;
public class Questão17 {

    public static void main(String[] args) {
         double celsius, fahrenheit;
        String s_celsius;
        
        s_celsius = JOptionPane.showInputDialog(null, "Graus em celsius:");
        celsius = Double.parseDouble(s_celsius);

        fahrenheit = (1.8 * celsius) + 32;

        JOptionPane.showMessageDialog(null, "" + celsius + "°C são " + fahrenheit + "°F");    }
    
}
