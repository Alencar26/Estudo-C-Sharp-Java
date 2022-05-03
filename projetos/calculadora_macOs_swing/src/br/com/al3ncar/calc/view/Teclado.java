package br.com.al3ncar.calc.view;

import javax.swing.*;
import java.awt.*;

public class Teclado extends JPanel {

    private final Color COR_CINZA_ESCURO = new Color(50,56,68);
    private final Color COR_CINZA_CLARO = new Color(89,92,96);
    private final Color COR_LARANJA = new Color(250,129,25);

    public Teclado() {

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        setLayout(layout);
        c.weightx = 1; //espandir no eixo x
        c.weighty = 1; //espandir no eixo y
        c.fill = GridBagConstraints.BOTH; // preenche os espaços em branco em volta dos botões.

        //linha 1
        c.gridwidth = 3; //deixando o botão ocupando 3 espaços do grid
        adicionarBotao("AC", COR_CINZA_ESCURO, c, 0, 0);
        c.gridwidth = 1; //voltando a plaicação para ocupar 1 espaço do grid por botão.
        adicionarBotao("/", COR_LARANJA, c, 0, 3);
        //linha 2
        adicionarBotao("7", COR_CINZA_CLARO, c, 1, 0);
        adicionarBotao("8", COR_CINZA_CLARO, c, 1, 1);
        adicionarBotao("9", COR_CINZA_CLARO, c, 1, 2);
        adicionarBotao("X", COR_LARANJA, c, 1, 3);
        //linha 3
        adicionarBotao("4", COR_CINZA_CLARO, c, 2, 0);
        adicionarBotao("5", COR_CINZA_CLARO, c, 2, 1);
        adicionarBotao("6", COR_CINZA_CLARO, c, 2, 2);
        adicionarBotao("-", COR_LARANJA, c, 2, 3);
        //linha 4
        adicionarBotao("1", COR_CINZA_CLARO, c, 3, 0);
        adicionarBotao("2", COR_CINZA_CLARO, c, 3, 1);
        adicionarBotao("3", COR_CINZA_CLARO, c, 3, 2);
        adicionarBotao("+", COR_LARANJA, c, 3, 3);
        //linha 5
        c.gridwidth = 2; //ocupando 2 espaços do grid
        adicionarBotao("0", COR_CINZA_CLARO, c, 4, 0);
        c.gridwidth = 1; // voltando a ocupar 1 espaço do grid
        adicionarBotao(",", COR_CINZA_CLARO, c, 4, 2);
        adicionarBotao("=", COR_LARANJA, c, 4, 3);
    }

    private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int y, int x) {
        c.gridx = x;
        c.gridy = y;
        Botao botao = new Botao(texto, cor);
        add(botao, c);
    }
}
