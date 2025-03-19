package questão15_lista3;
import javax.swing.JOptionPane;
public class Questão15_lista3 {

    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        String resultado = "";

        while (count < 5) {
            int soma = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    soma += i;
                }
            }

            if (soma == num) {
                resultado += num + " é um número perfeito.\n";
                count++;
            }

            num++;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}

 
