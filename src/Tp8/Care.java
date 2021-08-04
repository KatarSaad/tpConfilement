package Tp8;

public abstract class Care implements Forme{
    private double cote;
    public Care(double cote)
    {
        setCote(cote);
    }
    public Care()
    {

    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double aire() {
        return 0;

    }

    @Override
    public double perimetre() {
        return 0;
    }
}
