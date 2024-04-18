import javax.swing.*;

public class ADD_ITEM extends JFrame{
    private JPanel painelADD_ITEM;
    private JButton buttonInserirImagem;
    private JTextField nomeProdutoInserido;
    private JTextField quantidadeInserida;
    private JTextField precoInserido;
    private JTextField nomeProduto;
    private JTextField quantidade;
    private JTextField preco;
    private JTextField fornecedor;
    private JTextField fornecedorInserido;
    private JTextField armazem;
    private JTextField armazemInserido;
    private JButton buttonCriar;
    private JButton cancelarButton;
    private JTextArea descricao;

        public ADD_ITEM(String title) {
            super(title);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setContentPane(painelADD_ITEM);
            pack();
        }
        public static void main(String[] args) {
            new ADD_ITEM("Add Item").setVisible(true);
        }

}
