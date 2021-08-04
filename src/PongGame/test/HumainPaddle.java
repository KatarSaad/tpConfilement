package PongGame.test;

import java.awt.*;

public class HumainPaddle implements Paddle{
  public  double y,yVel ;//yVel is how fast y moves (change )
  public boolean upAccel,downAccel;
  int player ,x;
  final double GRAVITY=0.94;

    public HumainPaddle(int player){
        upAccel=downAccel=false;
        y=210;yVel=0;
        if (player==1){
            this.x=20;

        }
        else
            this.x=660;

    }
    @Override
    public void draw(Graphics g) {
       g.setColor(Color.white);
       g.fillRect(x, (int) y,20,80);//draw player
    }

    @Override
    public void move() {
        if (upAccel){
            yVel-=2;


        }
        else if (downAccel){
            yVel+=2;

        }
        else if (!downAccel && !upAccel){

            yVel*=GRAVITY;
        }
         if (yVel>=5){
            this.y=5;
        }
        else if (yVel<=-5){
            this.y=-5;
        }

        this.y+=yVel;//each variable tessted determine its conditions(if ,else if )

        if (y<0){
            this.y=0;
        }
        if (y>420){
            this.y=420;
        }

    }

    @Override
    public int getY() {
       return (int)y;
    }

    public void setUpAccel(boolean upAccel) {
        this.upAccel = upAccel;
    }

    public void setDownAccel(boolean downAccel) {
        this.downAccel = downAccel;
    }
}//end
