package io.github.some_example_name;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Finestra  {
    private final int LARGHEZZA_FINESTRA=1500;
    private final int ALTEZZA_FINESTRA = 1000;

    public Finestra() {
        //creo il frame
        JFrame frame = new JFrame("Due TextBox + Pulsante");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //opzioni per il frame
        frame.setSize(LARGHEZZA_FINESTRA, ALTEZZA_FINESTRA);
        frame.setLayout(null);

        //creo i componenti con le dimensioni volute
        JTextField username = new JTextField();
        frame.setLocationRelativeTo(null);
        //username.setMaximumSize(new Dimension(LARGHEZZA_FINESTRA - 1800, 20));
        username.setBounds(110,50,300,50);
        username.setFont(new Font("Arial", Font.PLAIN, 20));
        JTextField password = new JTextField();
        JLabel nome = new JLabel("Username: ");
        nome.setBounds(20,25,100,100);
        //password.setMaximumSize(new Dimension(LARGHEZZA_FINESTRA - 1800, 20));
        password.setBounds(550,50,300,50);
        password.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel p_label = new JLabel("Password: ");
        p_label.setBounds(470,25,100,100);

        //Insersico il modello della macchina --> faccio
        String[] auto = { "Fiat", "Ford", "Ferrari", "Lamborghini", "BMW", "Mercedes", "Audi",
                "Volkswagen", "Toyota", "Honda", "Nissan", "Peugeot", "Renault", "Opel", "Mazda", "Hyundai", "Kia", "Volvo", "Chevrolet",
                "Dodge", "Jeep", "Subaru", "Mitsubishi", "Suzuki", "Jaguar", "Land Rover", "Porsche", "Alfa Romeo", "Citroën", "Tesla",
                "Mini", "Bentley", "Rolls-Royce", "Aston Martin", "Maserati" };
        JList<String> lista = new JList<>(auto);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(20, 200, 120, 200);

         //creo bottone
        JButton bottone = new JButton("Conferma");
        bottone.setBounds((LARGHEZZA_FINESTRA - (LARGHEZZA_FINESTRA/2)) - 200,ALTEZZA_FINESTRA - 200,400,100);


        // immagine da modificare  //TO DO immagine è modificata dopo che ho schiacciato il bottone conferma e gli inserisco tutti gli elementi del
        ImageIcon immagineMacchina = new ImageIcon();


        //aggiungo il pannello al frame
        frame.add(username);
        frame.add(nome);
        frame.add(password);
        frame.add(p_label);
        frame.add(scroll);
        frame.add(bottone);
        frame.setResizable(false);

        //se non invoco questa la finestra non viene mostrata
        frame.setVisible(true);
    }


}
