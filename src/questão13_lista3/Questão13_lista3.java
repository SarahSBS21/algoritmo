
package questão13_lista3;
import javax.swing.JOptionPane;
public class Questão13_lista3 {

    public static void main(String[] args) {
       
        String resultado = "Números no intervalo de 1000 a 1999 que, quando divididos por 11, dão resto igual a 5:\n";

        for (int i = 1000; i <= 1999; i++) {
            if (i % 11 == 5) {
                resultado += i + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}

