import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuOptionpane {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        boolean executando = true;  

    while (executando) {
        String opcao = JOptionPane.showInputDialog
        (null,
            "Escolha a opção: \n"+
            "1- Cadastrar\n"+
             "2- Listar\n"+
              "3-Sair ", 
              "Menu Principal",
        JOptionPane.QUESTION_MESSAGE);

        if (opcao == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada. Saindo do programa.");
            break;
        }
        switch (opcao) {
            case "1":
                String produto = JOptionPane.showInputDialog(null, 
                    "Digite o nome do produto:", "Cadastro de Produtos", JOptionPane.QUESTION_MESSAGE);
                

                if (produto==null || produto.trim().isEmpty()) {
                    JOptionPane.showMessageDialog
                    (null, "Produto não cadastrado!");
                }else {
                    produtos.add(produto);
                    JOptionPane.showMessageDialog
                    (null, "Produto cadastrado com sucesso!");
                }   
                break;

        case "2":
             JOptionPane.showMessageDialog(null, "Opção Listar selecionada!");

             if (produtos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!");
             } else {
                StringBuilder listaProdutos = new StringBuilder("Produtos Cadastrados:\n");
                for (String p : produtos) {
                    listaProdutos.append("- ").append(p).append("\n");
                }
                JOptionPane.showMessageDialog(null, listaProdutos.toString());
             }
        break;

        case "3":
        JOptionPane.showMessageDialog(null, "Saindo do programa. Até logo!");
        break;

        default:
        JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha uma opção válida.");
        break;


        }
        
    }
}
}