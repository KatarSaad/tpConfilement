package exp;

import java.io.OutputStream;

public class Test {
    public static void main(String[] args) {
        int x=5;
        int[] a=new int[2];

        try {
            //System.out.println(x/0);
            //a[3]=5 ;
            //System.out.println();
            throwexp(-2 );
        }
        catch (ArithmeticException e){
            System.out.println("catch it ");
        }
        /*catch (ArrayIndexOutOfBoundsException e){
            System.out.println("catch it 2");
            return;
        }*/
        catch (Exp e){
            System.out.println("in catch rest"+e);
        }

     /*   finally {
            System.out.println();
        }*/
    }
    static void throwexp(int value ) throws Exp {
        if (value<=0){ throw new Exp("negative ");}
        else {
            System.out.println("did it work");
        }
    }
}
