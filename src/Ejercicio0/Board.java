/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {
    
    private int xRef = 10;
    private int xRef2 = 100;
    
    private int delay = 30;

    private Timer timer;
    
    public Board() {
        setBackground(Color.WHITE);
        //Fires one or more ActionEvents at specified intervals.
        timer = new Timer(this.delay, this);
        timer.start();
    }

    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //dibujarEscenario(g);
//        g.setColor(Color.red);
//        g.drawLine(0,0,100,100);
//        
//        g.setColor(Color.BLUE);
//        g.fillRect(10, 10, 30, 30);
//        g.drawString("Puntaje", 50, 50);
//        
//        g.setColor(Color.blue);
//        g.fillRect(45, 10, 30, 30);
//        
//        int x[] = {10,15,15};
//        int y[] = {20, 5, 20};
//        g.drawPolygon(x, y, 3);
        
        g.setColor(Color.BLUE);
        int x[] = {this.xRef, (this.xRef+10), (this.xRef+20), (this.xRef+30)};
        int y[] = {10, 0, 0, 10};
        g.fillPolygon(x, y, 4);
        
//        g.setColor(Color.BLUE);
//        int x[] = {10, 20, 30, 40};
//        int y[] = {10, 0, 0, 10};
//        g.fillPolygon(x, y, 4);
        
        g.setColor(Color.CYAN);
        g.fillRect((this.xRef-10), 10, 50, 10);
        
        g.setColor(Color.BLACK);
        g.drawRect((this.xRef-10), 10, 50, 10);
        
        g.fillOval(this.xRef, 20, 10, 10);
        g.fillOval((this.xRef+20), 20, 10, 10);
        
        g.fillRect(xRef2, 10, 30, 20);
        
    }

   /* private void dibujarEscenario(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        //the first two parameters are the position (x,y) and after comes the width and the height
        g2d.fillOval(0, 0, 30, 30);
        g2d.drawOval(0, 50, 30, 30);
               
        g2d.fillRect(50, 0, 30, 30); 
        g2d.drawRect(50, 50, 30, 30);
        
        g2d.drawString("Puntaje del Juego", 100, 100);
        
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
       this.xRef += 1;
       this.xRef2 -= 1;
       repaint(); //To change body of generated methods, choose Tools | Templates.
    }
}