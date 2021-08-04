package BankManagement.test;

import java.util.Scanner;

public class Client {
    private double balance;
    private String clientName;
    private String  clientId;
    private double previousTransaction;
    public double getBalance(){
        return this.balance;

    }
    public double getPreviousTransaction(){
        return this.previousTransaction;

    }
    public String getClientName(){
        return this.clientName;

    }
    public String getClientId(){
        return this.clientId;
    }
    public void setBalance(double balance){
        this.balance =balance ;

    }
    public void setClientName(String name){
        this.clientName=name;

    }
    public void setClientId(String clientId) {
        this.clientId=clientId;

    }
    public void setPreviousTransaction(double previousTransaction){
        this.previousTransaction = previousTransaction;
    }
    public Client(String name ,String clientId,double balance ,double oldTransactions){
        setBalance(balance);
        setClientId(clientId);
        setClientName(name);
        setPreviousTransaction(oldTransactions);
    }
    public void deposite (double amount ){
        this.balance =this.balance +amount ;
        this.previousTransaction =amount ;

    }
    public void withdraw(double amount ){
      double newBalance=this.balance-amount;
        if (newBalance>0)
            { this.balance=newBalance;
              this.previousTransaction =-amount;}

        else
            {   this.balance=0;
                previousTransaction =-this.balance;
                System.out.println("all your balance is whitdraw"); }


        }
    public void getPrevTransaction(){
        if (this.previousTransaction <0){
            System.out.println("You withdrawed "+ Math.abs(this.previousTransaction));
        }
        else if (this.previousTransaction >0){
            System.out.println("You deposite "+ this.previousTransaction);
        }
        else {
            System.out.println("No transaction occured ");
        }
    }
    public void showMenu(){
        char choice='x';
        Scanner scanner= new Scanner(System.in);
        System.out.println("welcome ");
        System.out.println("Your ID"+this.getClientId());
        System.out.println("`\n");
        System.out.println("A: Check Balance ");
        System.out.println("B: Deposite");
        System.out.println("C: Withdraw ");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit...");
        do {
            System.out.println("<><><><><><><><><><><><><><><><>");
            System.out.println("Enter option");
            System.out.println("<><><><><><><><><><><><><><><><>");
            choice=scanner.next().charAt(0);
            System.out.println("\n");

            switch (choice){

                case ('A'):
                    System.out.println("<><><><><><><><><><><><><>");
                    System.out.println("Your Balance :"+getBalance());
                    System.out.println("\n");
                    System.out.println("<><><><><><><><><><><><><>");
                    break;
                    case ('B'):
                    System.out.println("<><><><><><><><><><><><><>");
                    System.out.println("The amount to deposite ");
                    double dep= scanner.nextDouble();
                    deposite(dep);
                    System.out.println("\n");
                    System.out.println("<><><><><><><><><><><><><>");
                    break;
                    case('C'):
                    System.out.println("<><><><><><><><><><><><><>");
                    System.out.println("The Amount to withdtraw ");
                    double anount=scanner.nextDouble();
                    System.out.println("\n");

                    System.out.println("<><><><><><><><><><><><><>");
                    break;
                    case ('D'):
                    System.out.println("<><><><><><><><><><><><><>");
                    System.out.println("Your last transaction is :");
                    System.out.println(getPreviousTransaction());
                    System.out.println("\n");
                    System.out.println("<><><><><><><><><><><><><>");
                    break;
                    case ('E'):
                    System.out.println("<><><><><><><><><><><><><>");
                    break;

                default:
                    System.out.println("invalid option!!!");


                }



           }while (choice!='E');
    }
}//end
