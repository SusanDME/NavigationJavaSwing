package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana app = new Ventana();
                app.setSize(600, 600);
                app.setVisible(true);
            }
        });
    }
}
