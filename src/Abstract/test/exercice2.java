package Abstract.test;

public class exercice2 {
    public static void main(String[] args) {
        System.out.println("Start ");
        Patron patron=new Patron("Ceo","company",25000);
        TravailleurPiece employeeParPiece=new TravailleurPiece("sami","prenom de sami",12,150);
        TravailleurCommisison employeeParCommession=new TravailleurCommisison("rami","prenom de rami",4500,14,30);
        System.out.println(patron);
        System.out.println(patron.gains());
        Employee tabEmployee[]=new Employee[3] ;
        tabEmployee[0]=patron;
        tabEmployee[1]=employeeParCommession;
        tabEmployee[2]=employeeParPiece;
        for (int i=0 ;i<3;i++)
        {
            System.out.println(tabEmployee[i].toString());
            System.out.println("le gain est:");
            System.out.println(tabEmployee[i].gains());



        }
    }//end

}
