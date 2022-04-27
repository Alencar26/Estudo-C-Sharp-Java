package br.com.al3ncar.cm.visao;

import br.com.al3ncar.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro) {

        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.paraCadaCampo(campo -> add(new BotaoCampo(campo)));
        tabuleiro.registrarObservador(e -> {
            //TODO mostrar resultado para o usuário.
        });
    }
}
