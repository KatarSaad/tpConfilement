package PongGame.test;

import javax.swing.*;
import javax.swing.table.TableRowSorter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TransferQueue;

public class Tennis extends Applet implements Runnable, KeyListener {

    final int WIDTH = 700, HEIGHT = 500;
    Thread thread ;
    HumainPaddle p1;//now we can use our humain paddle
    private JPanel panel1;


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        p1.draw(g);
    }

    public void update(Graphics g) {
        paint(g);


    }

    public  Tennis() {
        add(panel1);
        this.resize(WIDTH, HEIGHT);
        thread=new Thread(this);
        p1=new HumainPaddle(1);

        this.addKeyListener(this);

        this.start();
    }

    public void run() {
        for (; ; ) {
            repaint();
            p1.move();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        if (arg0.getKeyCode()==KeyEvent.VK_UP){

        }
        else if (arg0.getKeyCode()==KeyEvent.VK_DOWN){


        }

    }

    @Override
    public void keyReleased(KeyEvent arg0) {

        if (arg0.getKeyCode()==KeyEvent.VK_UP){

        }
        else if (arg0.getKeyCode()==KeyEvent.VK_DOWN){


        }


    }
    @Override
    public void keyTyped (KeyEvent arg0){

    }
  /*  public static void main(String[] args) {

        JFrame gui = new JFrame("pong");
        gui.setContentPane(new Tennis().panel1);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        gui.setVisible(true );
    }*/
}//end

