package Tp8Exo2;

import java.sql.SQLOutput;

public class Personne implements Homme{
    private String nom;
    private String prenom;
    public void setNom(String nom)
    {
        this.nom=nom;

    }
    public String getNom()
    {
        return this.nom;

    }
    public void setPrenom(String prenom)
    {
        this.prenom=prenom;

    }
    public String getPrenom()
    {
        return this.prenom;

    }
    public Personne(String nom ,String prenom)
    {
        setNom(nom);
        setPrenom(prenom);

    }
    @Override
    public void identité() {
        System.out.println("Nom::"+this.nom+"\n"+"Prenom::"+this.prenom);

    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}//end
