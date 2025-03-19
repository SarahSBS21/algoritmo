package questão29_lista2;
import javax.swing.JOptionPane;
public class Questão29_lista2 {

    public static void main(String[] args) {
        char caractere = JOptionPane.showInputDialog("digite um caractere maiúculo").charAt(0);
        String mensagem = verificaCaractere(caractere);
        JOptionPane.showMessageDialog(null, mensagem);
    }
    public static String verificaCaractere(char caractere){
        if(Character.isUpperCase(caractere)){
            switch (caractere){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                return "vogal";
                default:
                    return "consoante";
            }
        }else {
            return "outro";
        }
    }
    
}
