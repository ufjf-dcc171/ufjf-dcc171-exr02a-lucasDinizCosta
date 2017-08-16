package aula03exm01;

import javax.swing.JFrame;

public class Aula03Exm01 {

    public static void main(String[] args) {
        Janela j = new Janela();
        j.setSize(300,400);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }

}
