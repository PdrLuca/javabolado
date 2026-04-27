package SistemaDeCarros;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuCarro {
    public static void main(String[] args) {
       

        ArrayList<Carro> carros = new ArrayList<>();
        boolean executando = true;

        while (executando) {
            String opcao = JOptionPane.showInputDialog
            (null,
                "Escolha a opção: \n"+
                "1- Cadastrar Carro\n"+
                 "2- Listar Carros\n"+
                  "3-Detalhar Carro\n"+
                   "4-Alterar Carro\n"+
                    "5-Excluir Carro\n"+
                     "6-Gravar infomações em arquivo\n"+
                      "7-Sair ", 
                  "Menu Principal",
            JOptionPane.QUESTION_MESSAGE);

            if (opcao == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada. Saindo do programa.");
                break;
            }
            switch (opcao) {
                case "1":
                    String marca = JOptionPane.showInputDialog(null, 
                        "Digite a marca do carro:", "Cadastro de Carros", JOptionPane.QUESTION_MESSAGE);
                    String modelo = JOptionPane.showInputDialog(null, 
                        "Digite o modelo do carro:", "Cadastro de Carros", JOptionPane.QUESTION_MESSAGE);
                    String anoStr = JOptionPane.showInputDialog(null, 
                        "Digite o ano do carro:", "Cadastro de Carros", JOptionPane.QUESTION_MESSAGE);
                    
                    if (marca == null || marca.trim().isEmpty() ||
                        modelo == null || modelo.trim().isEmpty() ||
                        anoStr == null || anoStr.trim().isEmpty()) {
                        JOptionPane.showMessageDialog
                        (null, "Carro não cadastrado! Todos os campos são obrigatórios.");
                    } else {
                        try {
                            int ano = Integer.parseInt(anoStr);
                            Carro novoCarro = new Carro(marca, modelo, ano);
                            carros.add(novoCarro);
                            JOptionPane.showMessageDialog
                            (null, "Carro cadastrado com sucesso!");
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog
                            (null, "Ano inválido! Carro não cadastrado.");
                        }
                    }   
                    break;

            case "2":
                 JOptionPane.showMessageDialog(null, "Opção Listar selecionada!");

                 if (carros.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado!");
                 } else {
                    StringBuilder listaCarros = new StringBuilder("Carros Cadastrados:\n");
                    for (Carro c : carros) {
                        listaCarros.append("- ").append(c).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, listaCarros.toString());
                 }
            break;

            case "3":
            JOptionPane.showMessageDialog(null, "Opção Detalhar selecionada!");
             if (carros.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado!");
             } else {
                StringBuilder detalhesCarros = new StringBuilder("Detalhes dos Carros Cadastrados:\n");
                for (Carro c : carros) {
                    detalhesCarros.append(c.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, detalhesCarros.toString());
             }
                
            break;

            case "4":
            JOptionPane.showMessageDialog(null, "Opção Alterar selecionada!");
             if (carros.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado!");
             } else {
                StringBuilder alterarCarros = new StringBuilder("Alterar Carros Cadastrados:\n");
                for (Carro c : carros) {
                    alterarCarros.append(c.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, alterarCarros.toString());
             }
            break;

            case "5":
            JOptionPane.showMessageDialog(null, "Opção Excluir selecionada!");
             if (carros.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado!");
             } else {
                StringBuilder excluirCarros = new StringBuilder("Excluir Carros Cadastrados:\n");
                for (Carro c : carros) {
                    excluirCarros.append(c.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, excluirCarros.toString());
             }
            break;

            case "6": // Gravar em arquivo
                    try {
                        FileWriter writer = new FileWriter("carros.txt");

                        for (Carro c : carros) {
                            writer.write("Marca: " + c.getMarca() + "\n");
                            writer.write("Modelo: " + c.getModelo() + "\n");
                            writer.write("Ano: " + c.getAno() + "\n");
                            writer.write("----------------------\n");
                        }

                        writer.close();
                        JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo.");
                    }
                    break;
            
            case "7":
            JOptionPane.showMessageDialog(null, "Saindo do programa. Até logo!");
            executando = false;
            break;

        }
    }
    
}
}
