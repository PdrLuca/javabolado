import javax.swing.JOptionPane;

public class CaixaConfirmacao {

    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null,
            "Deseja continuar?", "Confirmação",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
        );

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar!", "Resultado",               
            JOptionPane.INFORMATION_MESSAGE
            );
    
    }else {
        JOptionPane.showMessageDialog(null, "Você escolheu cancelar!", "Resultado",               
        JOptionPane.INFORMATION_MESSAGE
        );
    }
    }
}