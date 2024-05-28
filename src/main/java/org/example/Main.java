package org.example;


import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        vistaPrincipal.setTitle("Conversor de monedas ALURA");
        vistaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        vistaPrincipal.setVisible(true);
    }
}