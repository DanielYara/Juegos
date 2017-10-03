/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Board extends JPanel implements ActionListener, MouseListener{
    private int xref;
    private int xref2;
    private int yref;
    private int xGato;
    private int numImagen ;
    private Timer timer; 
    
    public Board(){
      this.xref = 10;
      this.xref2 = 10;
      this.yref = 0;
      this.xGato = 0;
      this.numImagen = 0;
      this.timer = new Timer(25, this);
      this.timer.start();
      this.addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        
        Image fondo = loadImage("fondo.png");
        g.drawImage(fondo, 0, 0, this);
       
        int[] x = {this.xref+10, this.xref+20, this.xref+30, this.xref+40};
        int[] y = {50, 40, 40, 50};
        g.fillPolygon(x, y, 4);
        g.setColor(Color.CYAN);
        g.fillRect(this.xref,50,50, 10);
        g.setColor(Color.BLACK);
        g.drawRect(this.xref,50,50, 10);
        g.fillOval(this.xref+10, 60, 10, 10);
        g.fillOval(this.xref+30, 60, 10, 10);
        
        Rectangle carro = new Rectangle(this.xref,40 ,50, 30);
        g.setColor(Color.RED);
        g.fillOval(this.xref2 + 1200, 40, 20, 20);
        Rectangle oval = new Rectangle(this.xref2+1200, 40, 20, 20);
        
        Image gato = loadImage("cats.gif");
        g.drawImage(gato, this.xGato, 350, (this.xGato+132), (350+80), (this.numImagen*132), 0, (this.numImagen*132) + 132, 80, this);
        
        
        if(carro.intersects(oval)){
          this.timer.stop();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.xref++;
        this.xref2--;
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

    @Override
    public void mouseClicked(MouseEvent e) {
        Point mp = e.getPoint();
        Rectangle cat = new Rectangle(this.xGato, 350, (this.xGato+132), (350+80));
        if(cat.contains(mp))
            this.timer.stop();
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

    
}