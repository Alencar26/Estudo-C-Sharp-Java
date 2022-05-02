package br.com.al3ncar.calc.view;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    public Calculadora() {

        organizarLayout();

        setSize(232,322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayout() {
        // setando o gerenciador de layout para o BorderLayout
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(233,60));
        // segundo parâmetro indica a posição do elemento, só funciona com BorderLayout
        add(display, BorderLayout.NORTH);
        Teclado teclado = new Teclado();
        // segundo parâmetro indica a posição do elemento, só funciona com BorderLayout
        add(teclado, BorderLayout.CENTER);

    }


    public static void main(String[] args) {
        new Calculadora();
    }
}
