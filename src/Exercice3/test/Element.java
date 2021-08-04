package Exercice3.test;

public class Element {
    public String titre ;
    public String auteur;

    public Element(String titre ,String auteur )
    {
        this.titre=titre ;
        this.auteur=auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "Element{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
