import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    public void setReadOnly(){
        nomeProduto.setEditable(false);
        quantidade.setEditable(false);
        preco.setEditable(false);
        fornecedor.setEditable(false);
        armazem.setEditable(false);
    }

    public static void main(String[] args) {
        new ADD_ITEM("Add Item").setVisible(true);
        //setReadOnly();
    }

}
