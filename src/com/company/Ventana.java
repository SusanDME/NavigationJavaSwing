package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JLabel login, password;
    private JTextField campo1;
    private JPasswordField campo2;
    private JButton boton1 , boton2;
    private VentanaPrincipal v1;

    public Ventana(){
        super("Login");
        setSize(600, 600);
        login = new JLabel("Usuario");
        password = new JLabel("Contraseña");
        campo1 = new JTextField(90);
        campo2 = new JPasswordField(60);
        boton1 = new JButton("Entrar");
        boton2 = new JButton("Cancelar");
        setLayout(null);
        login.setBounds(100, 75, 50, 30);
        campo1.setBounds(200, 75, 50,30);
        password.setBounds(100,125,50,30);
        campo2.setBounds(200, 125, 50, 30);

        boton1.setBounds(100,175,50,30);
        boton2.setBounds(200,175,50,30);
        add(login);
        add(password);
        add(campo1);
        add(campo2);
        add(boton1);
        add(boton2);

        v1 = new VentanaPrincipal(this);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1.setVisible(true);
                setVisible(false);
            }
        });
    }
}
