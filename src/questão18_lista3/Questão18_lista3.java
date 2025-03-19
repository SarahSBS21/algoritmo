package questão18_lista3;
import javax.swing.JOptionPane;
public class Questão18_lista3 {

    public static void main(String[] args) {
        int capacidade = 20000; 
        int vazaoPorHora = 2 * 50; 
        int consumoPorHora = 300; 
        int perdaTotalPorHora = vazaoPorHora + consumoPorHora; 

        double horas = (double) capacidade / perdaTotalPorHora;

        JOptionPane.showMessageDialog(null, "O garrafão estará vazio em aproximadamente " + horas + " horas.");
    }
}

