package Tp8Exo2;

public class Peuple {
    private int nombrePopulation;
    private int curent =0;
    Personne pays[]=new Personne[100];

    public void setNombrePopulation(int nombrePopulation) {
        this.nombrePopulation = nombrePopulation;
        for (int i=0;i<100;i++)
        {
            pays[i]=null;
        }
    }

    public Peuple(int nombrePopulation)

    {
       setNombrePopulation(nombrePopulation);
    }
    public void naissance(Personne personne )
    {  if (curent<100)

      {


        for (int i = 0; i < 100; i++)
        {
            if (pays[i] == null)
            {
                pays[i] = personne;
                nombrePopulation++;
                return;
            }
        }
      }
      else
    {
        System.out.println("Pays pleine");
    }

    }
    public void explore ()
    {
        for(int i=0;i<this.nombrePopulation;i++)
        {
            pays[i].identité();
        }
    }



}
