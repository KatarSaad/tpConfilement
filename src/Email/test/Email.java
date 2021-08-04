package Email.test;

import java.util.Random;
import java.util.Scanner;

public class Email {
    private String email;
    private String password;
    private int capacityEmail ;
    private String alternateEmail;
    private String firstName;
    private String secondName ;
    private String department ;
  public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

   public void setCapacityEmail(int capacityEmail) {
        this.capacityEmail = capacityEmail;
    }

    /*public void setEmail(String email) {
        this.email = email;
    }*/

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setSecondName(String secondName){
        this.secondName=secondName;
    }


    public Email(String firstName, String secondName){
       setFirstName(firstName);
       setSecondName(secondName);
    }

    public void setDepartment() {
        Scanner scanner=new Scanner(System.in);
       String departmentt;
        System.out.println("What's your department \n::1/acounting \n::2/Sales\n::3/Devolopment\n0::None ");
        int  dep= Integer.parseInt(scanner.next());
        if (dep==1){departmentt="acount";}
        if (dep==2){departmentt="Sales";}
        if (dep==3){departmentt="Dev";}
        else {departmentt="None";}


        this.department=departmentt;

    }
    public void generatePassword(int length ){
        String passwordSet="azertyuiop^$ùmlkjhgfdsqWXCVBBN?./§123456778990++&é&'(-è__à'";
        char []pass=new char[length];
        for (int i=0;i<length;i++){
           int rand= (int)(Math.random()*passwordSet.length());//cast a number between 0 and length of passwordSet
           // password=password+passwordSet[Math.random()]
            pass[i] += passwordSet.charAt(rand);

        }
        this.password=new String (pass);//convert the list to a String ...
    }
    public void generateEmail(){
        this.email=this.firstName+"."+this.secondName+"@"+this.department+".Company.com";
    }

    public int getCapacityEmail() {
        return capacityEmail;

    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}//end
