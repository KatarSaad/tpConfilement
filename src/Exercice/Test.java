package Exercice;

import java.util.Scanner;



public class Test {
    static boolean isPrime(int num){


        int x = (int) (num / 2);
       // System.out.println("//"+num);
        //System.out.println(x);
        while (x > 1) {
            if (num % x == 0) {
                return false;
            }
            x--;
        }
       return true;
    }
    static boolean passwordChecker(String password ){
        String numbers="1234567890";
        String letters ="azertyuiopqsdfghjklmwxcvbnAZERTYUIOPQSDFGHJKLMWXCVBN";
        boolean isdoublenumber=false ;
        boolean isLetter=false;

        int count=0;
        if (password.length()<8){
            return false ;
        }
        for (int i=0;i<password.length();i++){
            char  c=password.charAt(i);
            if (numbers.indexOf(c)==-1 && letters.indexOf(c)==-1){

                return false ;

            }
            if (!isLetter &&letters.indexOf(c)!=-1){
                isLetter=true;
            }
            if (!isdoublenumber && numbers.indexOf(c)!=-1){
                count++;
                if (count>=2){
                    isdoublenumber=true;
                }


            }//وفقني يا الله ,الحمد لله,بسم الله





        }
        if( isdoublenumber && isLetter){
            return true;


        }
        else {
            return false ;
        }

    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.next();
      /*  boolean   a;
        if (isPrime(5)) a = true;
        else a = false;
          */
       /* for (int i=3;i<=100;i++){
            if (isPrime(i) && isPrime(i+2)){

                System.out.println("("+i+","+Integer.toString(i+2)+")");
            }
        */
        System.out.println(passwordChecker(pass));

    }
}
