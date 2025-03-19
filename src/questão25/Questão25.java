package questão25;
import javax.swing.JOptionPane;
public class Questão25 {
    public static void main(String[] args) {
        double volume, raio, altura;
        String s_raio, s_altura;

        s_raio = JOptionPane.showInputDialog(null, "Qual o raio da circunferência da caixa d'água?");
        s_altura = JOptionPane.showInputDialog(null, "Qual a altura da caixa d'água?");
        raio = Double.parseDouble(s_raio);
        altura = Double.parseDouble(s_altura);

        volume = Math.PI * (raio * raio) * altura;

        JOptionPane.showMessageDialog(null, "O volume é: " + volume);
    }
    
}
