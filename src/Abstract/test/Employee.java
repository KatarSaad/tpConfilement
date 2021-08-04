package Abstract.test;

public  abstract class Employee {
    private  String nom;
    private String prenom;
    public Employee(String nom,String prenom)
    {
        this.nom=nom;
        this.prenom=prenom;
    }
    public String getNom()
    {
        return this.nom ;

    }
    public String getPrenom()
    {
        return this.prenom;
    }
    public String toString()
    {
        return "Nom: "+this.nom+" | Prenom :"+this.prenom;
    }
    public abstract double gains();



}//end
