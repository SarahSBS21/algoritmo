package questão21_lista2;
import javax.swing.JOptionPane;
public class Questão21_lista2 {

    public static void main(String[] args) {
        double salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual:"));
        int codigoCargo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cargo:"));

        double aumento = 0;

        switch (codigoCargo) {
            case 101:
                aumento = 0.10;
                break;
            case 102:
                aumento = 0.15;
                break;
            case 103:
                aumento = 0.20;
                break;
            default:
                aumento = 0.355;
                break;
        }

        double aumentoSalarial = salarioAtual * aumento;
        double novoSalario = salarioAtual + aumentoSalarial;

        JOptionPane.showMessageDialog(null, "Salário atual: R$" + salarioAtual + "\nNovo salário: R$" + novoSalario + "\nDiferença: R$" + aumentoSalarial);
    }
}  
