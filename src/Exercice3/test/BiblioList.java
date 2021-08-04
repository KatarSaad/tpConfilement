package Exercice3.test;

import java.util.*;
import Exercice3.test.Bibliotheque;
import Exercice3.test.Livre;


public class BiblioList extends Bibliotheque {

    public LinkedList<Livre> l=new LinkedList<Livre>();
    public boolean addBook(Livre livre )
    {
        l.add(livre);
        return true;//need optimazation

    }
    public boolean removeBook(Livre livre )
    {
        l.remove(livre);
        return true;//need optimazation
    }
    public int size()
    {
        return l.size();
    }
    public int indexLivre (Livre livre )
    {
        return l.indexOf(livre);
    }
    public Livre getLivre (int index)
    {
        return l.get(index);
    }
//fix your work
    //الحند لله

}
