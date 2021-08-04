package Abstract.test;

public final class TravailleurPiece  extends Employee{
    public double retributionPiece;
    public int quantité;

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public void setRetributionPiece(double retributionPiece) {
        this.retributionPiece = retributionPiece;
    }
    public TravailleurPiece(String nom ,String prenom,double retributionPiece,int quantité)
    {
        super(nom,prenom);
        setQuantité(quantité);
        setRetributionPiece(retributionPiece);
    }


    public String toString() {
        return super.toString() +"TravailleurPiece{" +
                "retributionPiece=" + retributionPiece +
                ", quantité=" + quantité +
                "} ||Travailleur Piece  ";

    }
    public double gains(){
        return  this.retributionPiece*this.quantité;
    }
}//end
