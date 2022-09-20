/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_java;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Tarea_java extends javax.swing.JFrame
{
    private JFrame frame;
    private JTextField textField;
    interfaz_juego datosJugadores = new interfaz_juego();

    public Tarea_java() 
    {
	    initialize();
    }
    
    public static void main(String[] args)
    {
	EventQueue.invokeLater(new Runnable() {
	public void run() {
            try 
            {
		Tarea_java window = new Tarea_java();
		window.frame.setVisible(true);
            } 
            catch (Exception e) 
            {
		System.out.println("No hemos encontrado la clase de binario...");
            }
	}
        });
    }

    private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Menú Principal - Juego de UNO");
		JButton btnSubmit = new JButton("Iniciar Juego");
		btnSubmit.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent arg0) 
                    { 
                        datosJugadores = new interfaz_juego();
                        datosJugadores.setVisible(true);
                        datosJugadores.setLocationRelativeTo(null); 
                    } 
                });
		btnSubmit.setBounds(20, 20, 130, 30);
		frame.getContentPane().add(btnSubmit);
                
        JButton Salir = new JButton("Salir");
        Salir.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0) 
            {
                frame.dispose();
            }
        });
        Salir.setBounds(20, 60, 130, 30);
        frame.getContentPane().add(Salir);
        
        JButton Records = new JButton("Ver Records");
        Records.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0)
                {
                    System.out.println("Imprimiendo Resultados:\n");
                    try{
                        for (binario a : deserializar()) {
                            System.out.println(a);
                        } 
                    }
                    catch(Exception a){
                        System.out.println("\nTodos los datos han sido obtenidos. En caso de que no haya sido mostrado ninguno, la base de datos no ha sido creada todavía");
                    }
                }
        });
        Records.setBounds(20, 100, 130, 30);
        frame.getContentPane().add(Records);
	}

        public static ArrayList<binario> deserializar() 
        {
        ArrayList<binario> biblioteca = new ArrayList<binario>();
        try
        {
            FileInputStream fis = new FileInputStream("Puntaje.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            biblioteca = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error en la apertura del archivo.");

        } 
        catch (ClassNotFoundException c) 
        {
            System.out.println("No hemos encontrado la clase de binario...");

        }
        return biblioteca;
    }
}