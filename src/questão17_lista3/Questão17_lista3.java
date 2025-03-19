package questão17_lista3;
import javax.swing.JOptionPane;
public class Questão17_lista3 {

    public static void main(String[] args) {
        int capacidade = 20000;
        int vazao = 50;
        int tempoVazamento = (capacidade / vazao) * 30;

        double horas = tempoVazamento / 60.0;

        JOptionPane.showMessageDialog(null, "O garrafão estará vazio em aproximadamente " + horas + " horas.");
    }
    
}
