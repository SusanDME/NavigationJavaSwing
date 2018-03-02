package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame{
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem item;
    private Ventana login;

    public VentanaPrincipal(Ventana l){
        super("Ventana Principal");
        setSize(600, 600);
        login = l;

        menuBar = new JMenuBar();
        menu = new JMenu("Archivo");
        item = new JMenuItem("Salir");
        setJMenuBar(menuBar);
        menuBar.add(menu);
        menu.add(item);

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.setVisible(true);
                setVisible(false);
            }
        });
    }
}
