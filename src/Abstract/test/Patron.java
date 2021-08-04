package Abstract.test;

public class Patron extends Employee {
    public double salaireHebdo;


    public Patron(String nom,String prenom,double salaireHebdo)
    {
        super(nom,prenom);
        setSalaireHebdo(salaireHebdo);
    }

    public void setSalaireHebdo(double salaireHebdo)
    {
        this.salaireHebdo=salaireHebdo;

    }
    public double gains()
    {
        return (float)(this.salaireHebdo*4);

    }
    public String toString ()
    {
        return super.toString()+" ||| C'est un Patron , avec Salaire Hebdomadaire "+this.salaireHebdo;
    }


}
