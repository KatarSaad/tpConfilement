package Gues.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        Player player1 = new Player("Saad");
        Player player2 = new Player("Thouraya");
        int x = rand.nextInt(100);
        System.out.println(x);
        int max = 100;
        int min = 0;
        int guess1;
        int guess2;
        do {


             guess1 = player1.getGuess(max, min);
             guess2 = player2.getGuess(max, min);
            if (guess1 > x && guess2 > x) {
                max = Math.min(guess1, guess2);
            } else if (guess1 < x && guess2 < x) {
                min = Math.max(guess1, guess2);
            } else if (guess1 < x) {

                min = guess1;

            } else if (guess2 < x) {
                min = guess2;

            } else if (guess1 > x) {
                max = guess1;
            } else if (guess2 > x) {
                max = guess2;

            }
            System.out.println("Min ::"+min+"||Max:: "+max);
        }while ((guess1!=x && guess2!=x));
        if(guess1==x){
            System.out.println("The winner is "+player1.getPlayerName());

        }
        else {
            System.out.println("The winner is "+player2.getPlayerName());
        }
    }
}
