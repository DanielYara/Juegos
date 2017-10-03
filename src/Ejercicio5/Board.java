/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Estudiante
 */
public class Board extends JPanel implements ActionListener, MouseListener, KeyListener{
    private int xref;
    private int yref;
    private Timer timer;

    public Board(){
    this.xref = 0;
    this.yref= 0;
    this.timer = new Timer(30, this);
    this.timer.start();
    this.addMouseListener(this);
    this.addKeyListener(this);
}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("fondo.png");
        g.drawImage(fondo, 0, 0, this);
        
        
    }
    
    public Image loadImage(String file){
        ImageIcon load = new ImageIcon(file);
        Image image = load.getImage();
        return image;
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
