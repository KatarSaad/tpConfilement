package Tp8Exo3.test;

public class Test {
    public static void main(String[] args) {
        Son[]  listeSons=new    Son[2];
        Mamifere[]  listeMammiferes=new   Mamifere[2];
        Homme  h=new  Homme("ali", "bonjour", 20);
        Chien ch=new Chien("lassie", "hab hab", 2) ;
        listeSons[0]=ch;
        listeSons[1]=h;
        listeMammiferes[0]=h;
        listeMammiferes[1]=ch;
        for (int i=0; i<2; i++)   {
            listeSons[i].parler();
            listeMammiferes[i].vitesse();
        }

    }
}
