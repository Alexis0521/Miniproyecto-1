/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import logica.JuegoMemoria;
import modelo.Jugador;

/**
 *
 * @author orlan
 */
public class VentanaJuego extends JFrame {
    public VentanaJuego(Jugador jugador) {
        // Configurar la ventana
        setTitle("Juego de Completar Vocales");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear un panel para contener los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        // Crear una etiqueta para mostrar la palabra
        JLabel etiquetaPalabra = new JLabel("_ato", SwingConstants.CENTER);
        etiquetaPalabra.setFont(new Font("SansSerif", Font.BOLD, 24));
        panel.add(etiquetaPalabra);

        // Crear un panel para contener los botones con las opciones de vocales
        JPanel panelVocales = new JPanel();
        panelVocales.setLayout(new GridLayout(1, 5));

        // Crear los botones con las opciones de vocales
        String[] vocales = {"A", "E", "I", "O", "U"};
        for (String vocal : vocales) {
            JButton botonVocal = new JButton(vocal);
            panelVocales.add(botonVocal);
        }

        // Agregar el panel de vocales al panel principal
        panel.add(panelVocales);

        // Agregar el panel a la ventana
        add(panel);

        // Mostrar la ventana
        setVisible(true);
        
    }
}
