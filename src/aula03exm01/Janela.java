package aula03exm01;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends JFrame{
    private final JTextField caixaNumero_1;
    private final JTextField caixaNumero_2;
    private final JLabel escrito_1;
    private final JLabel escrito_2;
    private final JLabel escritoResultado;
    
    public Janela() throws HeadlessException{
        super("Calculo");
        setLayout(new FlowLayout());
        escrito_1 = new JLabel("Digite o numero 1: ");
        escrito_2 = new JLabel("Digite o numero 2: ");
        escritoResultado = new JLabel("");
        caixaNumero_1 = new JTextField("",15);
        caixaNumero_2 = new JTextField("",15);
        add(escrito_1);
        add(caixaNumero_1);
        add(escrito_2);
        add(caixaNumero_2);
        add(escritoResultado);
        caixaNumero_1.addActionListener(new funcao());
        caixaNumero_2.addActionListener(new funcao());
    }
    
    public class funcao implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(caixaNumero_1!=null&&caixaNumero_2!=null&&caixaNumero_1.getText()!=""&&caixaNumero_2.getText()!=""){
                try{
                   Float num_1 = Float.parseFloat(caixaNumero_1.getText());
                   Float num_2 = Float.parseFloat(caixaNumero_2.getText());
                   escritoResultado.setText("O Resultado da soma eh: "+(num_1+num_2));
                }
                catch(NumberFormatException erro){
                    JOptionPane.showMessageDialog(null, "Numero invalido digitado", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Digite numeros nas caixas correspondentes", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
