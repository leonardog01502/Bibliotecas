import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biblioteca {
    private JLabel lblID;
    private JLabel lblNome;
    private JLabel lblNascimento;
    private JLabel lblSexo;
    private JLabel lblCPF;
    private JLabel lblEndereco;
    private JLabel lblFone;
    private JTextField txtID;
    private JTextField txtNome;
    private JTextField txtNascimento;
    private JTextField txtSexo;
    private JTextField txtCPF;
    private JTextField txtEndereco;
    private JTextField txtTelefone;
    private JButton btnExcluir;
    private JButton btnAlterar;
    private JButton btnNovo;
    private JButton btnCadastrar;
    private JButton btnSair;
    private JLabel lblbNome;
    private JTextField txtxtNome;
    private JButton btnPesquisar;
    private JTable table1;
    private static JPanel Bibliotecas;

    public Biblioteca() {
    btnPesquisar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = txtxtNome.getText();
        }
    });
    btnExcluir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    btnAlterar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    btnNovo.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    btnCadastrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome1 = txtNome.getText();
            String Nascimento = txtNascimento.getText();
            String Sexo = txtSexo.getText();
            String CPF = txtCPF.getText();
            String endereco = txtEndereco.getText();
            String telefone = txtTelefone.getText();
        }
    });
    btnSair.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int escolha = JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), "Deseja realmente sair da aplicação?", "Confirmar Saída", JOptionPane.YES_NO_OPTION);

            if (escolha == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    });
}

    public static void main(String[] args) {
        Bibliotecas.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        Biblioteca biblioteca = new Biblioteca();
    }
}