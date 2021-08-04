package Gues.test;

import java.util.Random;

public class Player {
    public int result;
    private String playerName;

    Random guess=new Random();
    public Player (String playerName){
        this.playerName=playerName;



    }
    public String getPlayerName(){
        return this.playerName;
    }

    public int getGuess(int max,int min  ) {

        return this.result=guess.nextInt(max-min)+min  ;

    }
    public void displayGuess (){
        System.out.println(this.playerName+" Guesses "+this.result);
    }
}
