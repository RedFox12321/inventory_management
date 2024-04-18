import javax.swing.*;

public class GestaoArmazens extends JFrame{
    private JPanel HOME_ARMAZENS;
    private JButton buttonArmazem;

    public GestaoArmazens(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(HOME_ARMAZENS);
        pack();
    }
    public static void main(String[] args) {
        new GestaoArmazens("Gestão de Armazéns").setVisible(true);
    }

}
