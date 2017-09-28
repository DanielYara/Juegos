/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Board extends JPanel implements ActionListener{
    private int xref;
    private int yref;
    private int xGato;
    private int numImagen ;
    private Timer timer; 
    
    public Board(){
      this.xref = 10;
      this.yref = 0;
      this.xGato = 0;
      this.numImagen = 0;
      this.timer = new Timer(25, this);
      this.timer.start();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        
        Image fondo = loadImage("fondo.png");
        g.drawImage(fondo, 0, 0, this);
       
        
        
        g.drawRect(this.xref,50 ,20, 20);
        Rectangle carro = new Rectangle(this.xref,50 ,20, 20);
        g.fillOval(40, this.yref, 15, 15);
        Rectangle oval = new Rectangle(40, this.yref, 15, 15);
        
        Image gato = loadImage("cats.gif");
        g.drawImage(gato, this.xGato, 100, (this.xGato+132), (100+80), (this.numImagen*132), 0, (this.numImagen*132) + 132, 80, this);
        
        
        if(carro.intersects(oval)){
          //this.timer.stop();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.xref++;
        this.yref++;
        this.xGato++;
        
        if(this.numImagen == 6){
           this.numImagen=0;
        }else{
          this.numImagen++;
        }
        repaint();
    }
    
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

   

    
}