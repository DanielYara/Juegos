/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class Main extends JFrame{
    public Main() {
       initUI();
    }

    /**
     * @param args the command line arguments
     */
    
    private void initUI() {
        add(new Board());
        setSize(1024, 512);
        setTitle("Ejercicio 5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        Main ex = new Main();
        ex.setVisible(true);
    }

    
    
}
