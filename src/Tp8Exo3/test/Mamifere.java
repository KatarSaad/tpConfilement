package Tp8Exo3.test;

public class Mamifere implements Son{
    private String parole;
    private String nom;
    private int vitesse ;

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String getNom() {
        return nom;

    }

    public String getParole() {
        return parole;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setParole(String parole) {
        this.parole = parole;
    }

    public Mamifere(String nom, String parole,int vitesse)
    {
        setNom(nom);
        setParole(parole);
        setVitesse(vitesse);
    }
    public void parler()
    {
        System.out.println(this.parole);
    }
    public void vitesse()
    {
        System.out.println(getVitesse());
    }

}
