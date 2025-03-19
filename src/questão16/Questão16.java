package questão16;
import javax.swing.JOptionPane;
public class Questão16 {
    public static void main(String[] args) {
        double hambúrguer = 100;
        double presunto = 50;
        double queijo = 50;
        int quantidade;
        String s_quantidade;

        s_quantidade = JOptionPane.showInputDialog(null, "Quantos sanduíches você irá fazer?");
        quantidade = Integer.parseInt(s_quantidade);

        hambúrguer = hambúrguer * quantidade / 1000;
        queijo = queijo * quantidade * 2 / 1000;
        presunto = presunto * quantidade/ 1000;

        JOptionPane.showMessageDialog(null, "Hambúguer: " + hambúrguer + ", Queijo: " + queijo + ", Presunto: " + presunto);
    }
    
}
