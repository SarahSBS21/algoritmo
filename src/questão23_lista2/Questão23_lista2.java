package questão23_lista2;
import javax.swing.JOptionPane;
public class Questão23_lista2 {
    public static void main(String[] args) {
        int X, Y, Z;
        X = 10;
        Y = 12;
        Z = X - Y;
        X = X + 8;

        if (X > Y) {
            if (Z < X) {
                Z = Y;
            } else {
                Z = X;
            }
        } else {
            if (Y > X) {
                Y = Z;
            } else {
                Y = Y + 1;
            }
        }

        
        JOptionPane.showMessageDialog(null, "O valor de X é: " + X);
        JOptionPane.showMessageDialog(null, "O valor de Y é: " + Y);
        JOptionPane.showMessageDialog(null, "O valor de Z é: " + Z);
    }
    
}
