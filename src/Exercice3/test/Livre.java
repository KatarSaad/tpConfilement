package Exercice3.test;

public class Livre extends Element{
    public String auteur;//
    public  String titre ;//
    public String editeur;

    public Livre(String titre, String auteur,String editeur) {
        super(titre, auteur);
        this.editeur=editeur;

    }

    @Override
    public String toString() {
        return "Livre{" +
                "auteur='" + auteur + '\'' +
                ", titre='" + titre + '\'' +
                ", editeur='" + editeur + '\'' +
                '}';
    }
}//end

