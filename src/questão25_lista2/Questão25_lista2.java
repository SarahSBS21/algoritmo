package questão25_lista2;
import javax.swing.JOptionPane;
public class Questão25_lista2 {

    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("digite o coeficiente a da reta: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("digite o coeficiente b da reta: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("digite o coeficiente c da reta: "));
        
        double x = Double.parseDouble(JOptionPane.showInputDialog("digite a coordenada x do ponto: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("digite a coordenada y do ponto: "));
        
        if (a*x+b*y == c){
            JOptionPane.showMessageDialog(null, "o ponto (" + x + ", "+ y + ") pertence a reta " + a + "x + " + b + "y = " + c);
        }else{
            JOptionPane.showMessageDialog(null, "o ponto (" + x + ", "+ y + ") não pertence a reta " + a + "x + " + b + "y = " + c);
        }
        
    }
    
}
