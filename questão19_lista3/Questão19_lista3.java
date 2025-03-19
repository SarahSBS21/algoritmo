
package questão19_lista3;
import javax.swing.JOptionPane;
public class Questão19_lista3 {

    public static void main(String[] args) {
        int n1 = 1, n2 = 1;

        String resultado = n1 + "\n" + n2 + "\n";

        for (int i = 3; i <= 15; i++) {
            int n3 = n1 + n2;
            resultado += n3 + "\n";
            n1 = n2;
            n2 = n3;
        }

        javax.swing.JOptionPane.showMessageDialog(null, resultado);
    }
}

