package Exercice3.test;

public class Ouvrage extends Livre {
    //
    //
    private double dateEmprunt ;//null basiclly
    private  int cote;
    public Ouvrage(String titre ,String auteur ,double dateEmprunt,int cote,String editeur )
    {
        super(titre,auteur,editeur);
        this.dateEmprunt=dateEmprunt;
        this.cote=cote;

    }

    public double getDateEmprunt() {
        return dateEmprunt;
    }

    public int getCote() {
        return cote;
    }


    @Override
    public String toString() {
        return "Ouvrage{::Cote:="+ this.cote+"||Date Emprunt:=" + this.dateEmprunt+"\n"+ super.toString();
    }
}
