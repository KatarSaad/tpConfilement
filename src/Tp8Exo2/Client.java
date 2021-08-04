package Tp8Exo2;

public class Client extends Personne {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Client (String nom , String prenom,int numero)
    {
        super(nom,prenom);
        setNumero(numero);

    }

}
