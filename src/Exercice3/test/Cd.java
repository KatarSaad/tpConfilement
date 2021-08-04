package Exercice3.test;

public class Cd extends Element  {

    public Cd(String titre,String auteur){
        super(titre, auteur);



    }

    @Override
    public String getAuteur() {
        return super.getAuteur();
    }

    @Override
    public String getTitre() {
        return getTitre();
    }


    @Override
    public String toString() {
        return "Cd{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
