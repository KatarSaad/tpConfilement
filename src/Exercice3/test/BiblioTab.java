package Exercice3.test;


public class BiblioTab extends Bibliotheque {
    public int n;
    Livre stock[]=new Livre[n];
    private int curentStock=0;


    public BiblioTab(int n)

    {
        this.n=n;
        for (int i =0;i<n;i++)
        {
            stock[i]=null;

        }
    }




     public boolean addBook(Livre livre) {
        if (curentStock < n)
        {

            for (int i = 0; i < n; i++) {
                if (stock[i] == null) {
                    stock[i] = livre;
                    curentStock++ ;

                    return true;
                }

            }
        }

        return false;
    }
     public boolean removeBook(Livre livre )
    {
        for (int i=0;i<n;i++)
        {
            if (livre.getTitre() == stock[i].getTitre())
            {
                stock[i]=stock[curentStock-1];
                return true;
            }
        }
        return false ;
    }


}
