package Abstract.test;

public final class  TravailleurCommisison extends Employee {//class finale:no extenssion
    public double salaire;
    public double commission;
    public int  quantité;

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }


    public TravailleurCommisison(String nom, String prenom, double salaire, double commission, int quantité)
    {
        super(nom,prenom);
        setCommission(commission);
        setQuantité(quantité);
        setSalaire(salaire);

    }
    public String toString ()
    {
        return super.toString()+" | Travailleur a Commission ";



    }
    public double gains()
    {
        return this.salaire+this.commission*this.quantité;//oui(priorité *)>+

    }


}//end
