package PongGame.test;


import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               Tennis gui =new Tennis();
               gui.setVisible(true);
            }
        });
    }

}
