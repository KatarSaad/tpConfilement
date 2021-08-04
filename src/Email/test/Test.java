package Email.test;

public class Test {
    public static void main(String[] args) {
        Email mail=new Email ("saad","katar ");
        mail.setDepartment();
        mail.generateEmail();
        mail.generatePassword(10);        System.out.println(mail.getDepartment());
        System.out.println(mail.getPassword());
        System.out.println(mail.getEmail());



    }//الحمد لله
}
